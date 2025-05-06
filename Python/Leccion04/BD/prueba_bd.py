import psycopg2 #Para poder conectarnos a Postgres
from config import DB_CONFIG

#print(f"Version: {psycopg2.__libpq_version__}")
conexion = psycopg2.connect(
    user = DB_CONFIG['user'],
    password = DB_CONFIG["password"],
    host = DB_CONFIG["host"],
    port = DB_CONFIG["port"],
    database = DB_CONFIG["database"]
)

with conexion:
    with conexion.cursor() as cursor:
        sentencia = 'SELECT * FROM persona'
        cursor.execute(sentencia) # De esta manera ejecutamos la query
        registros = cursor.fetchall() # Recuperamos todos los registros que seran una lista
        print(registros)
        
#print(conexion)
# cursor = conexion.cursor()
# sentencia = 'SELECT * FROM persona'
# cursor.execute(sentencia) # De esta manera ejecutamos la sentencia
# # Recuperamos todos los registros como tuplas dentro de una tupla
# registros = cursor.fetchall() #
# print(registros) #[(1, 'Juan', 'Perez', 'jperez@mail.com'), (2, 'Carla', 'Gomez', 'kgomez@gmail.com')]

cursor.close() # Cerramos la conexion con el objeto cursor
conexion.close() # Cerramos la conexion con nuestra base de datos