package test;

/**
 * Esta clase demuestra el uso de argumentos variables en Java (varargs).
 * Los varargs permiten pasar un número variable de argumentos a un método.
 */
public class TestArgumentosVariables {
    
    public static void main(String[] args) {
        // Llamadas al método con diferente cantidad de argumentos
        imprimirNumeros(3, 4, 5);  // Pasa 3 números
        imprimirNumeros(1, 2);     // Pasa 2 números
        variosParametros("Juan", "Perez", 7, 8, 9); // Pasa 2 Strings + 3 números
    }
    
    /**
     * Método que acepta parámetros fijos (nombre, apellido) y variables (numeros)
     * @param nombre Primer nombre (String)
     * @param apellido Apellido (String)
     * @param numeros Números variables (int varargs)
     * 
     * Nota: Los parámetros varargs deben ser siempre los últimos en la lista
     */
    private static void variosParametros(String nombre, String apellido, int ...numeros){
        System.out.println("Nombre: "+nombre+", Apellido: "+apellido);
        imprimirNumeros(numeros); // Pasamos el array de números al método imprimir
    }
    
    /**
     * Método que imprime una cantidad variable de números enteros
     * @param numeros Array de enteros creado automáticamente por Java
     * 
     * El parámetro 'int ...numeros' se convierte internamente en un array int[]
     * Puede recibir 0 o más valores enteros
     */
    private static void imprimirNumeros(int ...numeros){
        // Iteramos a través del array de números recibido
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos: "+numeros[i]);
        }
    }
}
