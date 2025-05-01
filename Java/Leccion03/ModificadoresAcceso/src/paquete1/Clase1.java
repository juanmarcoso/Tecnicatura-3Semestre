package paquete1;

/**
 * Esta clase demuestra el uso del modificador de acceso 'public' en:
 * - Clases
 * - Atributos
 * - Métodos
 * - Constructores
 * 
 * El modificador 'public' permite el acceso desde cualquier otra clase,
 * incluso si está en otro paquete.
 */
public class Clase1 {

    // Atributo público: accesible desde cualquier clase.
    public String atributoPublic = "Valor atributo public";

    /**
     * Constructor público: permite crear instancias de esta clase
     * desde cualquier otra clase (ejemplo: TestModificadoresAcceso).
     */
    public Clase1() {
        System.out.println("Constructor public");
    }

    // Método público: puede ser invocado desde cualquier clase.
    public void metodoPublico() {
        System.out.println("Metodo publico");
    }
}
