package domain;

/**
 * Clase que representa a un Gerente, que es un tipo específico de Empleado.
 * Hereda de Empleado y añade información sobre el departamento que gestiona.
 */
public class Gerente extends Empleado {

    private String departamento;  // Departamento que gestiona el gerente

    /**
     * Constructor para crear una instancia de Gerente.
     * @param nombre Nombre del gerente
     * @param sueldo Sueldo del gerente
     * @param departamento Departamento que gestiona el gerente
     */
    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo); // Inicializa nombre y sueldo usando el constructor de Empleado
        this.departamento = departamento;
    }

    /**
     * Sobrescribe el método obtenerDetalles() de Empleado.
     * Añade información del departamento al resultado.
     * @return Cadena con todos los detalles del gerente
     */
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Departamento: " + this.departamento;
    }

    /**
     * Obtiene el departamento que gestiona el gerente
     * @return El departamento del gerente
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Establece el departamento que gestiona el gerente
     * @param departamento Nuevo departamento para el gerente
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
