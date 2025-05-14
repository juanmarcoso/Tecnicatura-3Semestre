// Llamando a la funcion antes de ser declaradas es un ejemplo de hosting
miFuncion1()
miFuncion2()

/*
 * Declaración de miFuncion1
 * Imprime 'Funcion 1' en la consola
 */
function miFuncion1(){
    console.log('Funcion 1');
}

/*
 * Declaración de miFuncion2
 * Imprime 'Funcion 2' en la consola
 */
function miFuncion2(){
    console.log('Funcion 2')
}

//Funcion de tipo callback asignada a una variable
let impr = function imprimir(mensaje){
    console.log( mensaje )
}

/*
 * Función que suma dos operandos y usa un callback para mostrar el resultado
 * @param {number} op1 - Primer operando
 * @param {number} op2 - Segundo operando
 * @param {function} funcionCallBack - Función callback que recibe el resultado
 */
function sumar (op1, op2, funcionCallBack){
    let res = op1 + op2
    funcionCallBack(`Resultado: ${res}`)
}

// Llamada a la función sumar pasando 5, 3 y la función impr como callback
sumar(5, 3, impr);

//Llamadas asincronas con uso de setTimeout
function miFuncionCallback(){
    console.log('Saludo asincrono despues de 3 segundos')
}

setTimeout(miFuncionCallback, 3000); //En milisegundos decimos que queremos que aparezca en 3 segundos

setTimeout(function(){ console.log("Saludo asincrono 2 despues de 5 segundos")}, 5000);

setTimeout( () => console.log('Saludo asincrono 3 despues de 9 segundos'), 9000);