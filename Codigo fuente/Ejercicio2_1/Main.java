package Ejercicio2_1;

//Creación clase Main.
public class Main {
    public static void main(String[] args){

        //Creación de las dos personas.
        Persona Persona1 = new Persona("Pedro", "Pérez", "1053121010", 1998, "Colombia", 'H');
        Persona Persona2 = new Persona("Luisa", "León", "1053223344", 2001, "Argentina", 'M');

        //Impresión de los datos de la primera persona.
        Persona1.Imprimir();

        //Impresión de los datos de la segunda persona.
        Persona2.Imprimir();

    }
}
