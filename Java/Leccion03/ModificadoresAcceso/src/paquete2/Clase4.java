package paquete2;

/**
 * Esta clase demuestra el uso del modificador de acceso más restrictivo: private.
 * Los miembros privados solo son accesibles dentro de la propia clase.
 */
public class Clase4 {
    // Atributo privado: solo accesible dentro de Clase4
    private String atributoPrivate = "Atributo Privado";

    /**
     * Constructor privado:
     * - Solo puede ser invocado desde dentro de la clase (por ejemplo, desde otro constructor).
     * - Útil para implementar patrones como Singleton o controlar la creación de instancias.
     */
    private Clase4() {
        System.out.println("Constructor privado");
    }

    /**
     * Constructor público:
     * - Permite crear instancias desde cualquier clase.
     * - Internamente llama al constructor privado con this().
     * @param argumento Parámetro de ejemplo (no usado en este caso).
     */
    public Clase4(String argumento) {
        this(); // Llama al constructor privado
        System.out.println("Constructor publico");
    }

    // Método privado: solo accesible dentro de Clase4
    private void metodoPrivado() {
        System.out.println("Metodo Privado");
    }

    // Métodos públicos (getter/setter) para acceder al atributo privado
    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }

    /*
     * El modificador private es esencial para:
     * - Encapsular datos sensibles.
     * - Ocultar detalles de implementación.
     * - Controlar el acceso a través de métodos públicos (como getters/setters).
    
     * En el TestDefault.java, se demuestra que solo se puede interactuar con 
     * los miembros private de Clase4 mediante sus métodos públicos (como getAtributoPrivate()).
     */
}
