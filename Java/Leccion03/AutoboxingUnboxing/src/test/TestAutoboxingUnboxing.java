package test;

/**
 * Esta clase demuestra el concepto de Autoboxing y Unboxing en Java.
 * Autoboxing es la conversión automática de un tipo primitivo a su clase envolvente (Wrapper).
 * Unboxing es la conversión automática de una clase envolvente a su tipo primitivo.
 */
public class TestAutoboxingUnboxing {

    public static void main(String[] args) {
        // Clases envolventes o Wrapper
        /*
         * Clases envolventes de tipos primitivos:
         * 
         * int = la clase envolvente es "Integer"
         * long = la clase envolvente es "Long"
         * float = la clase envolvente es "Float"
         * double = la clase envolvente es "Double"
         * boolean = la clase envolvente es "Boolean"
         * byte = la clase envolvente es "Byte"
         * char = la clase envolvente es "Character"
         * short = la clase envolvente es "Short"
         */

        int enteroPrim = 10; // Tipo primitivo 'int' con valor 10
        System.out.println("EnteroPrim = " + enteroPrim); // Muestra el valor primitivo

        Integer entero = 10; // Autoboxing: conversión automática de 'int' a 'Integer' (objeto)
        // System.out.println("Entero = "+ entero.toString()); // Opcional: muestra el valor como String
        System.out.println("Entero = " + entero.doubleValue()); // Muestra el valor como 'double' (método de la clase Integer)

        int entero2 = entero; // Unboxing: conversión automática de 'Integer' a 'int' (primitivo)
        System.out.println("Entero2 = " + entero2); // Muestra el valor primitivo después del Unboxing
    }
}