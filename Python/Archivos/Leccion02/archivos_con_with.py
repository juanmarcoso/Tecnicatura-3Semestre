from ManejoArchivos import ManejoArchivos

# Manejo de contexto con with: sintaxis simplificada, abre y cierra el archivo
#with open('prueba.txt', 'r', encoding='UTF-8') as archivo:
#    print(archivo.read())

# En el contexto de with lo que se ejecuta de manera automatica
# Utiliza diferentes métodos: __enter__ este es el que abre
# El metodo que cierra: __exit__

with ManejoArchivos('prueba.txt') as archivo:
    print(archivo.read())