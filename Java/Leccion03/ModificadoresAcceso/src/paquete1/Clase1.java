package paquete1;

/**
 * Esta clase demuestra múltiples modificadores de acceso:
 * - public: acceso desde cualquier paquete.
 * - protected: acceso desde mismo paquete o subclases (herencia).
 * Contiene ejemplos de atributos, métodos y constructores con estos modificadores.
 */
public class Clase1 {

    public String atributoPublic = "Valor atributo public"; // Accesible desde cualquier clase
    protected String atributoProtected = "Valor atributo 'Protected'"; // Accesible por herencia o mismo paquete

    /**
     * Constructor público: puede ser invocado desde cualquier paquete.
     */
    public Clase1() {
        System.out.println("Constructor public");
    }

    /**
     * Constructor protected: solo accesible desde:
     * - El mismo paquete (paquete1)
     * - Subclases (aunque estén en otro paquete, como Clase3).
     * @param atributoPublic Parámetro de ejemplo (no usado en este caso).
     */
    protected Clase1(String atributoPublic) {
        System.out.println("Constructor protected");
    }

    public void metodoPublico() {
        System.out.println("Metodo publico"); // Invocable desde cualquier clase
    }

    protected void metodoProtected() {
        System.out.println("Metodo protected"); // Invocable por herencia o mismo paquete
    }
}
