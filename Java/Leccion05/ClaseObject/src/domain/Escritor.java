package domain;

/**
 * Clase que representa a un Escritor, que es un tipo específico de Empleado.
 * Hereda de Empleado y añade información sobre el tipo de escritura.
 */
public class Escritor extends Empleado {
    final TipoEscritura tipoEscritura;  // Tipo de escritura (constante después de la inicialización)

    /**
     * Constructor para crear una instancia de Escritor.
     * @param nombre Nombre del escritor
     * @param sueldo Sueldo del escritor
     * @param tipoEscritura Tipo de escritura que realiza el escritor
     */
    public Escritor(String nombre, Double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);  // Llama al constructor de la clase padre (Empleado)
        this.tipoEscritura = tipoEscritura;
    }

    /**
     * Sobrescribe el método obtenerDetalles() de Empleado.
     * Añade información sobre el tipo de escritura.
     * @return Cadena con todos los detalles del escritor
     */
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Tipo Escritura: " + tipoEscritura.getDescripcion();
    }

    /**
     * Sobrescribe el método toString() para mostrar información del escritor.
     * @return Representación en String del objeto Escritor
     */
    @Override
    public String toString() {
        return "Escritor{" + " tipoEscritura= " + tipoEscritura + '}' + " " + super.toString();
    }

    /**
     * Obtiene el tipo de escritura del escritor
     * @return El tipo de escritura
     */
    public TipoEscritura getTipoEscritura() {
        return this.tipoEscritura;
    }
}
