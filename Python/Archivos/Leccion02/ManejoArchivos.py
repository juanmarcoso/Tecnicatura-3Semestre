"""
Implementación de un Context Manager personalizado para manejo seguro de archivos.
Permite usar la sintaxis 'with' para garantizar apertura y cierre adecuado de recursos.
"""

class ManejoArchivos:
    def __init__(self, nombre):
        """
        Constructor de la clase.
        
        Parámetros:
            nombre (str): Ruta/nombre del archivo a manejar
        """
        self.nombre = nombre  # Guardamos el nombre del archivo como atributo

    def __enter__(self):
        """
        Método especial que se ejecuta al ENTRAR al bloque 'with'.
        Se encarga de abrir el archivo y devolver el recurso.
        """
        # Mensaje decorado para indicar inicio de operación
        print(' Obtenemos el recurso '.center(50, '-'))
        
        # Abrimos el archivo en modo lectura con codificación UTF-8
        self.nombre = open(self.nombre, 'r', encoding='UTF-8')
        
        # Devolvemos el objeto archivo para usarlo en el bloque 'with'
        return self.nombre
    
    def __exit__(self, tipo_exception, valor_exception, traza_error):
        """
        Método especial que se ejecuta al SALIR del bloque 'with'.
        Garantiza el cierre adecuado del recurso, incluso si hay errores.
        
        Parámetros:
            tipo_exception: Tipo de excepción (si ocurrió)
            valor_exception: Valor de la excepción
            traza_error: Traza del error
        """
        # Mensaje decorado para indicar cierre de operación
        print(' Cerramos el recurso '.center(50, '-'))
        
        # Verificamos si el archivo está abierto antes de intentar cerrarlo
        if self.nombre:
            self.nombre.close()  # Cerramos el archivo
            
        # Si retornamos True, cualquier excepción sería suprimida
        # Al no retornar nada explícitamente (o retornar None), las excepciones se propagan