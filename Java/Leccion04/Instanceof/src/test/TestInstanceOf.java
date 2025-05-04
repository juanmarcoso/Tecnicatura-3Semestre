package test;

import domain.*;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 2000);
        //empleado1 = new Gerente("Jose", 5000, "Sistemas");
        determinarTipo(empleado1); // Llamada al método para verificar el tipo
    }

    /**
     * Método que determina el tipo de un objeto Empleado usando instanceof.
     * instanceof verifica en tiempo de ejecución si un objeto es instancia de una clase,
     * una subclase o implementa una interfaz. Esto implica una verificación en la memoria
     * del objeto para conocer su tipo real (no solo la referencia).
     * "instanceof" es util en el polimorfismo para manejar la logica diferenciada por tipo
     */
    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo Gerente");
            /* 
             * Este bloque se ejecuta si el objeto en memoria es de tipo Gerente,
             * aunque la referencia sea Empleado (polimorfismo).
             */
        }
        else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo Empleado");
        }
        else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
            // Todos los objetos en Java heredan de Object, por lo que este bloque es redundante.
        }
    }
}
