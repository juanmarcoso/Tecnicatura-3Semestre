# Operador instanceof

El operador instanceof verifica si un objeto es instancia de una clase específica o de una de sus clases padre.

## En este código:

Se usa para determinar el tipo concreto de un objeto en tiempo de ejecución

Es útil cuando necesitamos comportamientos diferentes según el tipo

El orden de las verificaciones es importante: debemos ir de más específico a más general

- Primero verificamos **Gerente** (más específico)

- Luego **Empleado** (más general)

- Finalmente **Object** (el más general de todos)

## Ejemplo de uso:

~~~sh
    if (obj instanceof Gerente) {
        // Código específico para gerentes
    } else if (obj instanceof Empleado) {
        // Código para empleados no gerentes
    }
~~~