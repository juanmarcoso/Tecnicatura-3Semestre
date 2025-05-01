package paquete1;

/*
 * Esta clase demuestra el uso del modificador default (package-private) en:
 * - Atributos
 * - Métodos
 * - Constructores
 * 
 * Como es una clase pública, puede ser usada desde otras clases,
 * pero sus miembros default solo son accesibles dentro del mismo paquete.
 */
public class Clase2 extends Clase1 {
    // Atributo con modificador default (solo visible en paquete1)
    String atributoDefault = "Valor del atributo";

    // Constructor default (solo accesible dentro del paquete1)
    Clase2() {
      System.out.println("Constructor Default");
    }

    /*
     * Constructor alternativo (comentado como ejemplo)
     * Muestra cómo se podría modificar el atributo default al crear la instancia
     */
    // public Clase2() {
    //     super();
    //     this.atributoDefault = "Modificacion del atributo default";
    //     System.out.println("Atributo default: " + atributoDefault);
    //     this.metodoDefault();
    // }

    // Método con modificador default (solo visible en paquete1)
    void metodoDefault() {
        System.out.println("Metodo Default");
    }
}
