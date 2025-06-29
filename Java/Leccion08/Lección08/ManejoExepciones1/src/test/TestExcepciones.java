package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {

    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(10, 0);
        } catch (OperacionExcepcion e) {
            System.out.println("Ocurrió un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error general");
            e.printStackTrace(System.out); // Muestra la pila de errores
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Se revisó la división entre cero");
        }
        System.out.println("La variable resultado tiene como valor: " + resultado);
    }
}

