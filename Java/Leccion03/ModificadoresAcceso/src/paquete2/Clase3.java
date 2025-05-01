package paquete2;

import paquete1.Clase1;

/**
 * Esta clase demuestra el uso del modificador "protected":
 * - Hereda de Clase1 (paquete diferente) y accede a sus miembros protected.
 * - Muestra cómo "protected" permite acceso desde subclases, incluso en otro paquete.
 */
public class Clase3 extends Clase1 {

    /**
     * Constructor de Clase3:
     * - Llama al constructor protected de Clase1.
     * - Accede al atributo protected de Clase1 (heredado).
     * - También puede acceder a atributos públicos de la clase padre.
     */
    public Clase3() {
        super("Protected"); // Llama al constructor protected de Clase1
        this.atributoProtected = "Accedemos desde la clase hija"; // Modifica atributo protected heredado
        System.out.println("Atributo protected: " + atributoProtected); // Acceso permitido
        this.atributoPublic = "Es totalmente publico"; // Acceso a atributo público del padre
    }
}
