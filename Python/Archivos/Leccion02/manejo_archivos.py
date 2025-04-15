# Declaramos una variable 
try:
    archivo = open('prueba.txt', 'w') # La w es para escritura
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt\n')
    archivo.write('Con esto terminamos.')
except Exception as e:
    print(e)
finally: # Siempre se ejecuta
    archivo.close() # Con esto siempre se cierra el archivo
    
