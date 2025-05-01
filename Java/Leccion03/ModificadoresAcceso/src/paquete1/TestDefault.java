package paquete1;

import paquete2.Clase4;

/*
 * Clase de prueba que demuestra el acceso a miembros default:
 * - Crea una instancia de ClaseHija2
 * - Accede y modifica su atributo default (heredado de Clase2)
 * - Muestra que el modificador default permite el acceso desde
 *   cualquier clase del mismo paquete
 */
public class TestDefault {
    public static void main(String[] args) {
        // Creación de instancia (el constructor es público)
        ClaseHija2 claseH2 = new ClaseHija2();
        
        // Modificación directa del atributo default (permitido por estar en mismo paquete)
        claseH2.atributoDefault = "Cambio desde la prueba";
        
        System.out.println("Clase Hija 2 del atributo Default: " + claseH2.atributoDefault);

        // --- TESTEO DE MIEMBROS PRIVADOS DE Clase4 ---
        // 1. Creación de instancia usando el constructor público
        Clase4 clase4 = new Clase4("Publico"); // ✅ Permitido (constructor es público)

        // 2. Acceso INDIRECTO al atributo private mediante getter
        System.out.println(clase4.getAtributoPrivate()); // ✅ Usamos getter (atributoPrivate es private)

        // 3. Modificación INDIRECTA del atributo private mediante setter
        clase4.setAtributoPrivate("Cambio"); // ✅ Usamos setter (no se puede acceder directamente)

        // 4. Verificación del cambio
        System.out.println("Clase 4: " + clase4.getAtributoPrivate()); // ✅ Nuevamente con getter

        // --- INTENTOS FALLIDOS (comentados como ejemplo) ---
        // System.out.println(clase4.atributoPrivate); // ❌ Error: atributoPrivate es private
        // clase4.metodoPrivado(); // ❌ Error: metodoPrivado() es private
    }
}
