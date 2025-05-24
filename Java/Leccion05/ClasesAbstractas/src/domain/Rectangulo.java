package domain;

/**
 * Clase concreta que representa un Rectángulo, heredando de FiguraGeometrica.
 * 
 * Ejemplo de herencia en Java, donde Rectangulo es una subclase de FiguraGeometrica
 * y debe implementar todos sus métodos abstractos.
 */
public class Rectangulo extends FiguraGeometrica {

    /**
     * Constructor para crear una instancia de Rectangulo.
     * @param tipoFigura Tipo de figura geométrica (en este caso "Rectángulo")
     */
    public Rectangulo(String tipoFigura){
        super(tipoFigura); // Llama al constructor de la clase padre
    }

    /**
     * Implementación concreta del método dibujar() para Rectángulo.
     * 
     * Aquí se aplica el polimorfismo - este método anula (override) la versión
     * abstracta de la clase padre, proporcionando comportamiento específico.
     */
    @Override
    public void dibujar() {
        // Usa reflexión para obtener el nombre simple de la clase
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());
    }
}
