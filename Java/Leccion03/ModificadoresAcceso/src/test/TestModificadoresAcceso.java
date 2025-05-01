package test;

import paquete1.Clase1; // Importamos la clase Clase1 desde otro paquete.
import paquete2.Clase3; // Importamos Clase3 para probar herencia y modificadores.

/**
 * Esta clase prueba el acceso a miembros con diferentes modificadores:
 * - public (desde Clase1)
 * - protected (a través de herencia con Clase3)
 * También demuestra cómo los modificadores afectan la visibilidad entre paquetes.
 */
public class TestModificadoresAcceso {
    public static void main(String[] args) {
        // Acceso a miembros públicos de Clase1 (desde otro paquete)
        Clase1 clase1 = new Clase1();
        System.out.println("Clase1 = " + clase1.atributoPublic); // Acceso directo a atributo público
        clase1.metodoPublico(); // Llamada a método público

        // Prueba de herencia con Clase3 (acceso a miembros protected)
        Clase3 claseHija = new Clase3(); // Clase3 hereda de Clase1
        System.out.println("Clase hija: " + claseHija); // Imprime la referencia (toString() heredado de Object)
    }
}