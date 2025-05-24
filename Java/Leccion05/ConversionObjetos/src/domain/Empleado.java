package domain;

/**
 * Clase base que representa a un Empleado.
 * Contiene información básica como nombre y sueldo.
 * Esta clase puede ser extendida por otras clases más específicas.
 */
public class Empleado {

    protected String nombre;    // Nombre del empleado (accesible por subclases)
    protected double sueldo;    // Sueldo del empleado (accesible por subclases)

    /**
     * Constructor para crear una instancia de Empleado.
     * @param nombre Nombre del empleado
     * @param sueldo Sueldo del empleado
     */
    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    /**
     * Método que puede ser sobrescrito por subclases.
     * Retorna detalles básicos del empleado en formato String.
     * @return Cadena con nombre y sueldo del empleado
     */
    public String obtenerDetalles() {
        return "Nombre: " + this.nombre + ", sueldo: " + this.sueldo;
    }

    // Métodos getters y setters para acceder a los atributos privados
    
    /**
     * @return El nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado
     * @param nombre Nuevo nombre para el empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return El sueldo del empleado
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Establece el sueldo del empleado
     * @param sueldo Nuevo sueldo para el empleado
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
