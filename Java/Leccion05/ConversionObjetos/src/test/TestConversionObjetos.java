package test;

import domain.*;

public class TestConversionObjetos {

    public static void main(String[] args) {
        
        Empleado empleado;
        empleado = new Escritor("Juan", 5000.00, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetalles()); //Si queremos acceder a metodos Escritor

        //Downcasting 
        //((Escritor)empleado).getTipoEscritura(); //Tenemos dos opciones esta es una
        Escritor escritor = (Escritor)empleado; // Esta es la segunda
        escritor.getTipoEscritura();

        //Upcasting 
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
        
    }

}
