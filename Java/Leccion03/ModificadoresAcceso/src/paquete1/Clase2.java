package paquete1;

/*
 * - Utilizamos el modificador default
*/

public class Clase2 extends Clase1{
    String atributoDefault = "Valor del atributo";

    // Clase2(){
    //     System.out.println("Constructor Default");
    // }

    public Clase2(){
        super();
        this.atributoDefault = "Modificacion del atributo default";
        System.out.println("Atributo default: " + atributoDefault);
        this.metodoDefault();
    }

    void metodoDefault(){
        System.out.println("Metodo Default");
    }
}
