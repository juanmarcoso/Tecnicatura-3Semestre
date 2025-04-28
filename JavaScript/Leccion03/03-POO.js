// Definición de la clase base Empleado
class Empleado {
    
    constructor(nombre, sueldo) {
        this._nombre = nombre;  // Asigna el nombre al empleado
        this._sueldo = sueldo   // Asigna el sueldo al empleado
    }
    
    // Método que devuelve los detalles del empleado
    // Este método será sobrescrito en la clase hija (Gerente)
    obtenerDetalles() {
        return `Empleado: nombre: ${this._nombre}, 
        Sueldo: ${this._sueldo}`;
    }
}

// Definición de la clase Gerente que hereda de Empleado
class Gerente extends Empleado {

    constructor(nombre, sueldo, departamento) {
        super(nombre, sueldo);  // Llama al constructor de la clase padre (Empleado)
        this._departamento = departamento;  // Agrega propiedad específica de Gerente
    }

    // Sobrescritura del método obtenerDetalles()
    // Aquí vemos polimorfismo: el mismo método se comporta diferente según la clase
    obtenerDetalles() {
        return `Gerente: ${super.obtenerDetalles()} depto: ${this._departamento}`;
    }
}

// Función que demuestra polimorfismo y uso de instanceof
function imprimir(tipo) {
    // Llamada polimórfica: obtiene diferentes resultados según el tipo de objeto
    console.log(tipo.obtenerDetalles());
    
    // instanceof verifica si un objeto es instancia de una clase específica
    if(tipo instanceof Gerente) {
        console.log('Es un objeto de tipo Gerente');
        console.log(tipo._departamento);  // Accede a propiedad específica de Gerente
    }
    else if(tipo instanceof Empleado) {
        console.log('Es de tipo Empleado');
    }
    else if(tipo instanceof Object) {  // Object es la clase padre de todas las clases
        console.log('Es de tipo Object');
    }
    // El orden de las verificaciones es importante: debe ser de más específico a más general
}

// Creación de instancias
let gerente1 = new Gerente("Carlos", 5000, "Sistemas");
console.log(gerente1);

let empleado1 = new Empleado("Juan", 3000);
console.log(empleado1);

// Demostración de polimorfismo y instanceof
imprimir(gerente1);
imprimir(empleado1);