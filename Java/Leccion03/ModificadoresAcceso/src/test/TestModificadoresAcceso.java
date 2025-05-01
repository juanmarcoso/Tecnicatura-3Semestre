package test;

import paquete1.Clase1; // Importamos la clase Clase1 desde otro paquete.

/**
 * Esta clase prueba el acceso a los miembros públicos de la clase 'Clase1'.
 * Demuestra cómo el modificador 'public' permite interactuar con:
 * - Constructores
 * - Atributos
 * - Métodos
 * desde un paquete diferente.
 */
public class TestModificadoresAcceso {
    public static void main(String[] args) {
        // Creamos una instancia de Clase1 (su constructor es público).
        Clase1 clase1 = new Clase1();

        // Accedemos al atributo público 'atributoPublic' e imprimimos su valor.
        System.out.println("Clase1 = " + clase1.atributoPublic);

        // Ejecutamos el método público 'metodoPublico()' de la instancia.
        clase1.metodoPublico();
    }
}