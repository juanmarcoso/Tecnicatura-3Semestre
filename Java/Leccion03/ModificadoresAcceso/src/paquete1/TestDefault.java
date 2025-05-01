package paquete1;

/*
 * Clase de prueba que demuestra el acceso a miembros default:
 * - Crea una instancia de ClaseHija2
 * - Accede y modifica su atributo default (heredado de Clase2)
 * - Muestra que el modificador default permite el acceso desde
 *   cualquier clase del mismo paquete
 */
public class TestDefault {
    public static void main(String[] args) {
        // Creación de instancia (el constructor es público)
        ClaseHija2 claseH2 = new ClaseHija2();
        
        // Modificación directa del atributo default (permitido por estar en mismo paquete)
        claseH2.atributoDefault = "Cambio desde la prueba";
        
        System.out.println("Clase Hija 2 del atributo Default: " + claseH2.atributoDefault);
    }
}
