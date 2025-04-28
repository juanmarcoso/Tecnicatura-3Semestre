class Empleado {
    
    constructor(nombre, sueldo) {
        this._nombre = nombre; 
        this._sueldo = sueldo  
    }
    
    // Agregamos la sobrescritura
    obtenerDetalles() {
        return `Empleado: nombre: ${this._nombre}, 
        Sueldo: ${this._sueldo}`;
    }
}

class Gerente extends Empleado {

    constructor(nombre, sueldo, departamento) {
        super(nombre, sueldo);
        this._departamento = departamento;
    }

    obtenerDetalles() {
        return `Gerente: ${super.obtenerDetalles()} depto: ${this._departamento}`;
    }
}

function imprimir( tipo ){
    console.log(tipo.obtenerDetalles())
}

let gerente1 = new Gerente("Carlos", 5000, "Sistemas");
console.log(gerente1);

let empleado1 = new Empleado("Juan", 3000);
console.log(empleado1);

imprimir(gerente1);
imprimir(empleado1);