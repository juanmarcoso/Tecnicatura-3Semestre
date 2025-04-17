package test;

// Importamos la enumeración Dias que creamos anteriormente
import enumeraciones.Dias;

/**
 * Clase de prueba para demostrar el uso de enumeraciones en Java. Muestra cómo
 * declarar, pasar como parámetro y usar en estructuras switch.
 */
public class TestEnumeraciones {

    /**
     * Método principal que ejecuta las pruebas con la enumeración Dias.
     *
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Mostramos un día directamente desde la enumeración
        System.out.println("Dia 1: " + Dias.LUNES);

        // Llamamos al método que evalúa el día con un switch
        indicarDiaSemana(Dias.LUNES);

        /*
         * Nota importante:
         * Las enumeraciones NO son cadenas (String), son objetos de tipo Enum
         * No llevan comillas y se acceden mediante el operador de punto (.)
         * Proporcionan type-safety y validación en tiempo de compilación
         */
    }

    /**
     * Método que recibe un día de la semana y muestra su posición usando
     * switch.
     *
     * @param dias El día de la semana a evaluar (tipo Dias)
     *
     * Demuestra: 1. Cómo usar enumeraciones como parámetros 2. Cómo hacer
     * switch con enumeraciones 3. Buenas prácticas con break y default
     */
    private static void indicarDiaSemana(Dias dias) {
        // Switch tradicional con enumeraciones
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
            default:
                System.out.println("Dia no valido. Debe ser algun día de la semana.");
            /*
                 * Aunque aquí nunca se ejecutará el default porque la enumeración
                 * solo tiene esos valores, es buena práctica incluirlo
                 * por si en el futuro se modifica la enumeración
             */
        }

        /* 
         * Versión alternativa con switch expression (Java 14+):
         * 
         * String mensaje = switch(dias) {
         *     case LUNES -> "Primer dia de la semana";
         *     case MARTES -> "Segundo dia de la semana";
         *     // ... otros casos
         *     default -> "Dia no valido";
         * };
         * System.out.println(mensaje);
         */
    }
}
