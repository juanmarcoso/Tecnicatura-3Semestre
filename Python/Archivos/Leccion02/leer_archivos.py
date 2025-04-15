"""
Las letras para el manejo de archivos en python son: 
'r': read
'a': append
'w': write
'x': crea un archivo
't': para tipo de archivo text
'b': para archivos binarios
'w+': Para escribir y leer informacion
'r+': Para leer y escribir infomrción

"""
archivo = open('prueba.txt', 'r', encoding='UTF-8')
#print(archivo.read())
#print(archivo.read(16)) # Mostramos los 16 primeros lugares
#print(archivo.read(10)) # Continuamos leyendo a continuacion
#print(archivo.readline()) # Con esto leemos la primera linea
#print(archivo.readline()) # Repitiendo el script podemos ver la segunda linea

# Vamos a iterar el archivo, cada una de las lineas
#for linea in archivo:
    #print(linea): Vamos a ver el archivo iterado por lineas
    #print(archivo.readlines()) # Ahora le pedimos que nos muestre todo el archivo como una lista

print(archivo.readlines()[1]) # Se puede hacer por fuera del for tambien y buscar por indice