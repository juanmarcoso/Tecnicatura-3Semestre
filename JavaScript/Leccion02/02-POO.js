// Definición de la clase base Empleado
class Empleado {
    // Constructor de la clase Empleado
    constructor(nombre, sueldo) {
        // Convención: _nombre indica que es una propiedad "privada" (aunque en JS realmente no existen propiedades privadas en este contexto)
        this._nombre = nombre;    // Asigna el nombre recibido al atributo _nombre
        this._sueldo = sueldo;   // Asigna el sueldo recibido al atributo _sueldo
    }
    
    // Método para obtener los detalles del empleado
    obtenerDetalles() {
        // Devuelve un string con la información del empleado
        return `Empleado: nombre: ${this._nombre}, 
        Sueldo: ${this._sueldo}`;
    }
}

// Definición de la clase Gerente que hereda de Empleado
class Gerente extends Empleado {
    // Constructor de la clase Gerente
    constructor(nombre, sueldo, departamento) {
        // Llama al constructor de la clase padre (Empleado)
        super(nombre, sueldo);
        // Atributo adicional específico de Gerente
        this._departamento = departamento;
    }

    // Sobreescritura del método obtenerDetalles()
    obtenerDetalles() {
        // Reutiliza el método de la clase padre y añade información del departamento
        return `Gerente: ${super.obtenerDetalles()} depto: ${this._departamento}`;
    }
}

// Creación de un objeto Gerente (clase hija)
let gerente1 = new Gerente("Carlos", 5000, "Sistemas");
// Mostrará el objeto gerente1 con todos sus atributos
console.log(gerente1);

// Creación de un objeto Empleado (clase padre)
let empleado1 = new Empleado("Juan", 3000);
// Mostrará el objeto empleado1 con sus atributos (nombre y sueldo)
console.log(empleado1);

// Conceptos importantes demostrados:
// 1. Herencia (extends)
// 2. Llamada al constructor padre (super)
// 3. Sobreescritura de métodos (polimorfismo)
// 4. Encapsulamiento (uso de _ para indicar propiedades "protegidas")
// 5. Reutilización de código (super.obtenerDetalles())