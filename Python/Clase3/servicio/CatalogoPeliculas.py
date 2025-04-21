import os
import dominio.Pelicula as Pelicula

class CatalogoPeliculas:
    # Nombre del archivo (atributo de clase)
    nombre_archivo = 'Peliculas.txt'

    @classmethod
    def agregar_pelicula(self, pelicula):
        # Abre en modo 'a' (append) para añadir contenido sin borrar lo existente
        with open(self.nombre_archivo, 'a', encoding='UTF-8') as archivo:
            archivo.write(f'{pelicula.nombre}\n')

    @classmethod
    def listar_peliculas(self):
        try:
            with open(self.nombre_archivo, 'r', encoding='UTF-8') as archivo:
                print('Catálogo de películas:'.center(50, '-'))
                print(archivo.read())
        except FileNotFoundError:
            print('El archivo no existe todavía...')

    @classmethod
    def eliminar(self):
        try:
            os.remove(self.nombre_archivo)
            print(f'Archivo {self.nombre_archivo} eliminado')
        except FileNotFoundError:
            print('El archivo no existe...')
