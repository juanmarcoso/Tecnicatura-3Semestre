package test;

import domain.*;

/**
 * Clase de prueba para demostrar la conversión de objetos (upcasting y downcasting).
 */
public class TestConversionObjetos {

    public static void main(String[] args) {
        
        // Upcasting implícito: Escritor es tratado como Empleado
        Empleado empleado = new Escritor("Juan", 5000.00, TipoEscritura.CLASICO);
        
        // Muestra información usando toString() y obtenerDetalles()
        System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetalles()); // Polimorfismo: se llama al método de Escritor

        // Downcasting: convertir Empleado a Escritor explícitamente
        // Opción 1: casting directo
        // ((Escritor)empleado).getTipoEscritura();
        
        // Opción 2: casting asignado a variable
        Escritor escritor = (Escritor)empleado;
        escritor.getTipoEscritura();

        // Upcasting: convertir Escritor a Empleado (implícito)
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles()); // Sigue llamando al método de Escritor
    }
}
