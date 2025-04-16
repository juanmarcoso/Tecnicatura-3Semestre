"""
Ejemplo de manejo de archivos con manejo de excepciones y bloque finally
para garantizar el cierre adecuado del recurso.
"""

# Bloque try-except-finally para manejo seguro de archivos
try:
    # Abrimos el archivo en modo escritura ('w') con codificación UTF-8
    # - 'w' sobrescribe el archivo si existe, o lo crea si no existe
    # - UTF-8 permite manejar correctamente caracteres especiales y acentos
    archivo = open('prueba.txt', 'w', encoding='UTF-8')
    
    # Escribimos varias líneas en el archivo
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt.\n')
    archivo.write('Los acentos son importantes para las palabras\n')
    archivo.write('como por ejemplo: acción, ejecución y producción.\n')
    archivo.write('Saludos a todos los alumnos de la tecnicatura.\n')
    archivo.write('Con esto terminamos.')
    
except Exception as e:
    # Capturamos y mostramos cualquier error que ocurra durante las operaciones
    print(f'Ocurrió un error: {e}')
    
finally:
    # Este bloque se ejecuta SIEMPRE, haya ocurrido un error o no
    # Cerramos el archivo para liberar recursos del sistema
    archivo.close()
    print('El archivo ha sido cerrado correctamente.')

# Intento de escritura después del cierre (comentado porque generaría error)
# archivo.write("Todo quedó perfecto")  
# Error: no se puede escribir porque el archivo ya está cerrado
