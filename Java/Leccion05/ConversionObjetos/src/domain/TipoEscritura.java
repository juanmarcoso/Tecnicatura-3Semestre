package domain;

/**
 * Enumeración que representa los tipos de escritura posibles.
 * Cada tipo tiene una descripción asociada.
 */
public enum TipoEscritura {

    CLASICO("Escritura a mano"),    // Tipo de escritura clásica (mano)
    MODERNO("Escritura digital");   // Tipo de escritura moderna (digital)

    private final String descripcion;  // Descripción del tipo de escritura

    /**
     * Constructor privado para la enumeración.
     * @param descripcion Descripción del tipo de escritura
     */
    private TipoEscritura(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la descripción del tipo de escritura.
     * @return La descripción del tipo de escritura
     */
    public String getDescripcion() {
        return this.descripcion;
    }
}
