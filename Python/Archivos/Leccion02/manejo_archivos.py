# Declaramos una variable 
try:
    archivo = open('prueba.txt', 'w', encoding='UTF-8') # La w es para escritura
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt.\n')
    archivo.write('Los acentos son importantes para las palabras\n')
    archivo.write('como por ejemplo: acción, ejecución y producción.\n')
    archivo.write('Saludos a todos los alumnos de la tecnicatura.\n')
    archivo.write('Con esto terminamos.')
except Exception as e:
    print(e)
finally: # Siempre se ejecuta
    archivo.close() # Con esto siempre se cierra el archivo
    
#archivo.write("Todo quedó perfecto") No se puede ejecutar porque ya esta cerrado el archivo
