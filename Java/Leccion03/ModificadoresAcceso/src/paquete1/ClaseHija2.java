package paquete1;

/*
 * Esta clase hereda de Clase2 y demuestra que:
 * - Puede acceder a los miembros default de su padre (atributos y métodos)
 * - Puede modificar el atributo default heredado
 * - Puede llamar al método default heredado
 * 
 * Todo esto es posible porque están en el mismo paquete (paquete1)
 */
public class ClaseHija2 extends Clase2 {
    // Constructor público que accede a miembros default del padre
    public ClaseHija2() {
        super();  // Llama al constructor default de Clase2
        this.atributoDefault = "Modificacion del atributo Default";  // Modifica atributo default heredado
        System.out.println("Atributo Default: " + this.atributoDefault);
        this.metodoDefault();  // Llama al método default heredado
    }
}
