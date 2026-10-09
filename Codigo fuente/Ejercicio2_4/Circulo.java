package Ejercicio2_4;

//Creación de la clase Circulo.
public class Circulo {

    //Sección para declaración de atributos.
    int Radio; //En centímetros.

    //Creamos el constructor que inicializa el radio del círculo.
    public Circulo(int Radio){

        //Asignamos el valor recibido al atributo.
        this.Radio = Radio;
    }

    //Creamos un método get para el radio.
    public int GetRadio(){

        //Retornamos el radio.
        return Radio;
    }

    //Creamos un método set para el radio.
    public void SetRadio(int Radio){

        //Asignamos el nuevo radio.
        this.Radio = Radio;
    }

    //Creamos un método para calcular el área del círculo.
    public double CalcularArea(){

        //Inicializamos una variable para guardar el cálculo del área (pi * radio al cuadrado).
        double Area = Math.PI * Math.pow(Radio, 2);

        //Retornamos la variable.
        return Area;
    }

    //Creamos un método para calcular el perímetro del círculo.
    public double CalcularPerimetro(){

        //Inicializamos una variable para guardar el cálculo del perímetro (2 * pi * radio).
        double Perimetro = 2 * Math.PI * Radio;

        //Retornamos la variable.
        return Perimetro;
    }
}
