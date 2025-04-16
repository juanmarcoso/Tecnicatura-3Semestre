class Empleado {

    constructor(nombre, sueldo){
        this._nombre = nombre;
        this._sueldo = sueldo;
    }
    
    obtenerDetalles(){
        return `Empleado: nombre: ${this._nombre}, 
        Sueldo: ${this._sueldo}`;
    }

}

class Gerente extends Empleado {

    constructor(nombre, sueldo, departamento){
        super(nombre, sueldo);
        this._departamento = departamento;
    }

    //Agregamos la sobreescritura
    obtenerDetalles(){
        return `Gerente: ${super.obtenerDetalles()} depto: ${this._departamento}`;
    }
}

let gerente1 = new Gerente("Carlos", 5000, "Sistemas") //Objeto de la clase hija
console.log(gerente1);

let empleado1 = new Empleado("Juan", 3000); // Objeto de la clase padre
console.log(empleado1);