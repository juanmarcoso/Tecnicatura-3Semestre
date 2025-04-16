# Importamos la clase ManejoArchivos desde el módulo ManejoArchivos
from ManejoArchivos import ManejoArchivos

# Ejemplo básico de manejo de archivos usando el contexto with (comentado)
# with open('prueba.txt', 'r', encoding='UTF-8') as archivo:
#     print(archivo.read())

# Explicación del manejo de contexto (context manager) con with:
# - La sintaxis with simplifica el manejo de recursos
# - Abre automáticamente el archivo al entrar al bloque
# - Cierra automáticamente el archivo al salir del bloque, incluso si ocurren excepciones
# - Esto evita tener que llamar manualmente a close() y previene fugas de recursos

# Detrás de escena, el manejo de contexto utiliza dos métodos especiales:
# 1. __enter__(): Se ejecuta al entrar al bloque, abre el recurso (archivo en este caso)
# 2. __exit__(): Se ejecuta al salir del bloque, cierra el recurso y maneja cualquier excepción

# Usamos nuestra propia clase ManejoArchivos como context manager
# Esto demuestra cómo implementar el protocolo de manejo de contexto en clases personalizadas
with ManejoArchivos('prueba.txt') as archivo:
    # Dentro del bloque with, podemos trabajar con el archivo
    # Al salir de este bloque (incluso si hay errores), el archivo se cerrará automáticamente
    print(archivo.read())