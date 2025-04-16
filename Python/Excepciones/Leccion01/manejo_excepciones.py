# Importamos nuestra excepción personalizada
from num_iguales_exception import NumerosIgualesException

# Variable para almacenar el resultado (inicializada como None)
resultado = None

try:
    # Solicitamos al usuario dos números enteros
    a = int(input("Ingrese el primer numero: "))
    b = int(input("Ingrese el segundo numero: "))

    # Validación personalizada: si los números son iguales
    if a == b:
        # Lanzamos nuestra excepción personalizada con un mensaje
        raise NumerosIgualesException('Son numeros iguales')
    
    # Operación que podría generar excepciones
    resultado = a / b  # División que podría fallar

# Manejo específico de división por cero
except ZeroDivisionError as e:
    print(f'ZeroDivisionError - Ocurrió un error: {type(e)}')
    print("No se puede dividir por cero")

# Manejo específico de tipo de datos incorrectos
except TypeError as e:
    print(f'TypeError - Ocurrió un error: {type(e)}')
    print("Se esperaban valores numéricos")

# Cláusula catch-all para cualquier otra excepción
except Exception as e:
    print(f'Exception - Ocurrió un error: {e}')

# Bloque else: se ejecuta SI NO hubo excepciones
else:
    print("No se arrojó ninguna excepción")
    print("La división se realizó correctamente")

# Bloque finally: se ejecuta SIEMPRE (haya o no excepciones)
finally:
    print("Ejecución de este bloque finally")
    print("Este bloque es ideal para limpieza o liberación de recursos")

# Continuación del flujo del programa
print(f'El resultado es: {resultado}')  # Mostramos el resultado (puede ser None si hubo error)
print('seguimos...')  # Indicamos que el programa continúa