resultado = None
a = 10
b = 0

try:
    resultado = a / b # Modificamos
except ZeroDivisionError as e:
    print(f'ZeroDivisionError - Ocurrio un error: {type(e)}')
except TypeError as e:
    print(f'TypeError - Ocurrio un error: {type(e)}')
except Exception as e: # La clase padre puede manejar todo tipo error
    print(f'Exception - Ocurrio un error: {e}')

print(f'El resultado es: {resultado}')
print('seguimos...')