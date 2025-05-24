package test;

import domain.FiguraGeometrica;
import domain.Rectangulo;

/**
 * Clase de prueba para demostrar el uso de clases abstractas y polimorfismo.
 * 
 * Este test muestra el principio de sustitución de Liskov (LSP), donde podemos
 * tratar una instancia de Rectangulo como una FiguraGeometrica.
 */
public class TestAbstractas {

    /**
     * Método principal que ejecuta la prueba.
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Polimorfismo: La variable es de tipo FiguraGeometrica pero contiene un Rectangulo
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        
        // Llamada polimórfica - en tiempo de ejecución se decide qué versión de dibujar() ejecutar
        figura.dibujar();
    }
}