package test;

public class TestArgumentosVariables {
    
    public static void main(String[] args) {
        
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1, 2);
        variosParametros("Juan", "Perez", 7, 8, 9);
        
    }
    
    private static void variosParametros(String nombre, String apellido, int ...numeros){
        
        System.out.println("Nombre: "+nombre+", Apellido: "+apellido);
        //System.out.println("Apellido: "+apellido);
        imprimirNumeros(numeros); // Siempre se declara al final
        
    }
    
    // ...numeros quiere decir que vamos a recibir una cantidad indefinida  de variables
    // Se va a convertir en un arreglo
    private static void imprimirNumeros(int ...numeros){
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos: "+numeros[i]);
        }
    }
    
}
