package Ejercicio2_4;

//Creación de la clase Rombo.
public class Rombo {

    //Sección para declaración de atributos.
    int DiagonalMayor; //En centímetros.
    int DiagonalMenor; //En centímetros.

    //Creamos el constructor que inicializa las diagonales del rombo.
    public Rombo(int DiagonalMayor, int DiagonalMenor){

        //Asignamos los valores recibidos a los atributos.
        this.DiagonalMayor = DiagonalMayor;
        this.DiagonalMenor = DiagonalMenor;
    }

    //Creamos un método get para la diagonal mayor.
    public int GetDiagonalMayor(){

        //Retornamos la diagonal mayor.
        return DiagonalMayor;
    }

    //Creamos un método get para la diagonal menor.
    public int GetDiagonalMenor(){

        //Retornamos la diagonal menor.
        return DiagonalMenor;
    }

    //Creamos un método set para la diagonal mayor.
    public void SetDiagonalMayor(int DiagonalMayor){

        //Asignamos la nueva diagonal mayor.
        this.DiagonalMayor = DiagonalMayor;
    }

    //Creamos un método set para la diagonal menor.
    public void SetDiagonalMenor(int DiagonalMenor){

        //Asignamos la nueva diagonal menor.
        this.DiagonalMenor = DiagonalMenor;
    }

    //Creamos un método para calcular el área del rombo.
    public double CalcularArea(){

        //Inicializamos una variable para guardar el cálculo del área (diagonal mayor * diagonal menor / 2).
        double Area = (DiagonalMayor * DiagonalMenor) / 2.0;

        //Retornamos la variable.
        return Area;
    }

    //Creamos un método para calcular el lado del rombo con el teorema de Pitágoras (las diagonales se cortan por la mitad).
    public double CalcularLado(){

        //Inicializamos una variable para guardar el cálculo del lado.
        double Lado = Math.sqrt(Math.pow(DiagonalMayor / 2.0, 2) + Math.pow(DiagonalMenor / 2.0, 2));

        //Retornamos la variable.
        return Lado;
    }

    //Creamos un método para calcular el perímetro del rombo.
    public double CalcularPerimetro(){

        //Inicializamos una variable para guardar el cálculo del perímetro (4 * lado).
        double Perimetro = 4 * CalcularLado();

        //Retornamos la variable.
        return Perimetro;
    }
}
