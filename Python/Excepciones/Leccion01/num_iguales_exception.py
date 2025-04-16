"""
Implementación de una excepción personalizada para manejar casos específicos
donde números iguales no son permitidos en la lógica de negocio.
"""

# Creamos una excepción personalizada heredando de la clase base Exception
class NumerosIgualesException(Exception):
    """
    Excepción personalizada para indicar cuando se reciben números iguales
    en operaciones donde esto no está permitido.
    
    Hereda todos los comportamientos de la clase Exception estándar.
    """
    
    def __init__(self, mensaje):
        """
        Constructor de la excepción personalizada.
        
        Parámetros:
            mensaje (str): Mensaje descriptivo del error que se mostrará al usuario.
        """
        # Almacenamos el mensaje de error como atributo de la instancia
        self.message = mensaje
        
        # Llamamos al constructor de la clase padre (Exception)
        # para mantener todo el comportamiento estándar
        super().__init__(mensaje)