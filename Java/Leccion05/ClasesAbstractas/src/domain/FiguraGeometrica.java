package domain;

/**
 * Clase abstracta que representa una figura geométrica genérica.
 * 
 * <p>En programación orientada a objetos, las clases abstractas sirven como plantillas
 * para otras clases y no pueden ser instanciadas directamente. Contienen métodos abstractos
 * (sin implementación) que las clases hijas deben implementar.</p>
 * 
 * <p>Principio SOLID aplicado:
 * - Principio de Abierto/Cerrado (OCP): Esta clase está abierta para extensión (pueden crearse
 *   nuevas figuras) pero cerrada para modificación.</p>
 */
public abstract class FiguraGeometrica {

    protected String tipoFigura; // Atributo protegido para permitir herencia

    /**
     * Constructor protegido para la clase base FiguraGeometrica.
     * @param tipoFigura Descripción del tipo de figura geométrica
     */
    protected FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    /**
     * Método abstracto para dibujar la figura.
     * 
     * El polimorfismo permite que cada subclase proporcione su propia implementación
     * de este método, mostrando comportamiento específico para cada tipo de figura.
     */
    public abstract void dibujar();

    // Getter para tipoFigura - Encapsulamiento (principio OOP)
    public String getTipoFigura() {
        return tipoFigura;
    }

    // Setter para tipoFigura - Encapsulamiento (principio OOP)
    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    /**
     * Sobrescribe el método toString() de la clase Object.
     * @return Representación en String del objeto FiguraGeometrica
     */
    @Override
    public String toString() {
        return "FiguraGeometrica: ( "+ "tipoFigura = " + tipoFigura + ')';
    }
}