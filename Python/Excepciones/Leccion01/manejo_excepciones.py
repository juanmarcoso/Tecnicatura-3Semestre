resultado = None
a = '10'
b = 0

try:
    resultado = a / b # Modificamos 
except ZeroDivisionError as e: # Nos va a dar un error de type por lo que es un string
    print(f'Ocurrio un error: {e}')

print(f'El resultado es: {resultado}')
print('seguimos...')