package Ejercicio2_4;

//Creación de la clase Cuadrado.
public class Cuadrado {

    //Sección para declaración de atributos.
    int Lado; //En centímetros.

    //Creamos el constructor que inicializa el lado del cuadrado.
    public Cuadrado(int Lado){

        //Asignamos el valor recibido al atributo.
        this.Lado = Lado;
    }

    //Creamos un método get para el lado.
    public int GetLado(){

        //Retornamos el lado.
        return Lado;
    }

    //Creamos un método set para el lado.
    public void SetLado(int Lado){

        //Asignamos el nuevo lado.
        this.Lado = Lado;
    }

    //Creamos un método para calcular el área del cuadrado.
    public double CalcularArea(){

        //Inicializamos una variable para guardar el cálculo del área (lado * lado).
        double Area = Lado * Lado;

        //Retornamos la variable.
        return Area;
    }

    //Creamos un método para calcular el perímetro del cuadrado.
    public double CalcularPerimetro(){

        //Inicializamos una variable para guardar el cálculo del perímetro (4 * lado).
        double Perimetro = 4 * Lado;

        //Retornamos la variable.
        return Perimetro;
    }
}
