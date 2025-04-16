// Habilita el modo estricto para todo el script
// Esto activa mejores prácticas y prevención de errores comunes
"use strict";

// Ejemplo 1: Variables declaradas correctamente
// En modo estricto, las variables deben declararse con let, const o var
let x = 10;  // Declaración correcta usando let
console.log(x);  // Muestra 10 en consola

// Llamada a función declarada
miFuncion();

// Definición de función
function miFuncion() {
    // El modo estricto puede activarse dentro de funciones
    // En este caso está comentado: 
    // "use strict";
    
    // Variable declarada correctamente dentro del ámbito de la función
    let y = 10;  // y solo existe dentro de este bloque de función
    
    // En modo estricto, esto generaría error si y no estuviera declarada
    console.log(y);  // Mostraría 10 si estuviera descomentado
}

// Diferencias importantes:
// 1. Sin "use strict" podrías usar variablesno declaradas (creándolas implícitamente)
// 2. En modo estricto, esto generaría ReferenceError

// Ejemplo que fallaría en modo estricto:
// z = 15;  // ReferenceError: z is not defined
// console.log(z);

// Beneficios del modo estricto:
// - Previene el uso de variables no declaradas
// - Hace más fácil detectar errores comunes
// - Previene ciertas prácticas inseguras
// - Deshabilita características confusas o mal diseñadas de JavaScript