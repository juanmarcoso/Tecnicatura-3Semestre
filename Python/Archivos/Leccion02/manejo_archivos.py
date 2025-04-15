# Declaramos una variable 
try:
    archivo = open('prueba.txt', 'w') # La w es para escritura
except Exception as e:
    print(e)
finally: # Siempre se ejecuta
    archivo.close() # Con esto siempre se cierra el archivo
    
