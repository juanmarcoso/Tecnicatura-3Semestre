package test;

import domain.Persona;

/**
 * @author juan orellana
 */
public class TestForEach {
    
    public static void main(String[] args) {
        int edades[] = {5, 6, 8, 9};
        //for (int i =0; i < edades.length; i++ );    

        for (int edad: edades) { //Sintaxis del ForEach
            System.out.println("edad = " + edad);
        }

        Persona personas[] = {new Persona("Juan"), new Persona("Carla"), new Persona("Beatriz")};

        // For each
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
}