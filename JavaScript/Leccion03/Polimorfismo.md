# Polimorfismo

El polimorfismo (del griego "muchas formas") es un concepto de la programación orientada a objetos que permite que un mismo método o función se comporte de manera diferente según el tipo de objeto con el que se trabaje.

## En este código:

Tanto **Empleado** como **Gerente** tienen un método **obtenerDetalles()**

Cuando llamamos a **obtenerDetalles()**, **JavaScript** automáticamente ejecuta la versión correspondiente al tipo real del objeto (no al tipo declarado)

En la función **imprimir()**, la línea ***tipo.obtenerDetalles()*** es polimórfica porque:

- Si tipo es un **Empleado**, ejecuta el método de **Empleado**

- Si tipo es un **Gerente**, ejecuta el método de **Gerente**