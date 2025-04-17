/**
 * Este paquete contiene enumeraciones relacionadas con días de la semana.
 * Las enumeraciones en Java son tipos especiales que representan un conjunto
 * de constantes nombradas.
 */
package enumeraciones;

/**
 * La enumeración Dias define los 7 días de la semana como constantes enumeradas.
 * 
 * Características principales:
 * - Cada valor es una instancia pública, estática y final (constante) de la enumeración
 * - Proporciona type-safety (seguridad de tipos)
 * - Puede usarse en switch statements
 * - Puede contener métodos, constructores y campos adicionales
 */
public enum Dias {
    
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO;
    
    // Nota: El punto y coma al final es opcional cuando no hay métodos o campos adicionales
    
    /**
     * Ejemplo de cómo podríamos añadir funcionalidad adicional:
     * 
     * public boolean esFinDeSemana() {
     *     return this == SABADO || this == DOMINGO;
     * }
     */
}