package domain;

public class Persona {

    private final int idPersona;
    private static int contadorPersona;
    
    static{ //Bloque de inicializacion estatico
        System.out.println("Ejecucion del bloque estatico");
        ++Persona.contadorPersona;
    }
    
    //Bloque inicializador no estatico o contexto dinamico
    {
        System.out.println("Ejecucion del bloque no estatico");
        this.idPersona = Persona.contadorPersona++; //Incrementamos el atributo
    }
    
    // Los bloques de inicializacion se ejecutan antes del constructor
    
    public Persona(){
        System.out.println("Esta es la ejecucion del constructor");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }
    
}
