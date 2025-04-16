"""
Modos de apertura de archivos en Python:
'r'  : Lectura (read) - Abre un archivo existente para leer (error si no existe)
'a'  : Append (añadir) - Abre para escribir al final del archivo, lo crea si no existe
'w'  : Escritura (write) - Abre para sobrescribir el archivo, lo crea si no existe
'x'  : Creación exclusiva - Crea un nuevo archivo (error si ya existe)
't'  : Modo texto (text) - Valor por defecto, archivos de texto
'b'  : Modo binario (binary) - Para archivos binarios (imágenes, ejecutables, etc.)
'w+' : Escritura + Lectura - Sobrescribe el archivo, permite lectura después
'r+' : Lectura + Escritura - Abre un archivo existente para lectura/escritura
"""

# Abrimos el archivo en modo lectura con codificación UTF-8
archivo = open('prueba.txt', 'r', encoding='UTF-8')

# Diferentes formas de leer el contenido:
# print(archivo.read())  # Lee todo el contenido del archivo
# print(archivo.read(16))  # Lee solo los primeros 16 caracteres
# print(archivo.read(10))  # Continúa leyendo los siguientes 10 caracteres
# print(archivo.readline())  # Lee una línea completa (primera línea)
# print(archivo.readline())  # Lee la siguiente línea (segunda línea)

# Iteración sobre el archivo línea por línea:
# for linea in archivo:
#     print(linea)  # Imprime cada línea del archivo
#     print(archivo.readlines())  # Lee todas las líneas restantes como lista

# Acceso directo a líneas específicas:
# print(archivo.readlines()[1])  # Accede a la segunda línea usando índice

# Proceso de copia del archivo:
# Abrimos un nuevo archivo para escritura (modo 'w' sobrescribe, 'a' añadiría)
archivo2 = open('copia.txt', 'w', encoding='utf8')  

# Copiamos el contenido del archivo original al nuevo
archivo2.write(archivo.read())

# Es importante cerrar los archivos para liberar recursos
archivo.close()  # Cerramos el archivo original
archivo2.close()  # Cerramos el archivo copia

# Mensaje de confirmación
print('Se ha terminado el proceso de leer y copiar archivos')