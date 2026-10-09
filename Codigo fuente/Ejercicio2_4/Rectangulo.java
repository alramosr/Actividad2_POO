package Ejercicio2_4;

//Creación de la clase Rectangulo.
public class Rectangulo {

    //Sección para declaración de atributos.
    int Base; //En centímetros.
    int Altura; //En centímetros.

    //Creamos el constructor que inicializa la base y la altura del rectángulo.
    public Rectangulo(int Base, int Altura){

        //Asignamos los valores recibidos a los atributos.
        this.Base = Base;
        this.Altura = Altura;
    }

    //Creamos un método get para la base.
    public int GetBase(){

        //Retornamos la base.
        return Base;
    }

    //Creamos un método get para la altura.
    public int GetAltura(){

        //Retornamos la altura.
        return Altura;
    }

    //Creamos un método set para la base.
    public void SetBase(int Base){

        //Asignamos la nueva base.
        this.Base = Base;
    }

    //Creamos un método set para la altura.
    public void SetAltura(int Altura){

        //Asignamos la nueva altura.
        this.Altura = Altura;
    }

    //Creamos un método para calcular el área del rectángulo.
    public double CalcularArea(){

        //Inicializamos una variable para guardar el cálculo del área (base * altura).
        double Area = Base * Altura;

        //Retornamos la variable.
        return Area;
    }

    //Creamos un método para calcular el perímetro del rectángulo.
    public double CalcularPerimetro(){

        //Inicializamos una variable para guardar el cálculo del perímetro ((2 * base) + (2 * altura)).
        double Perimetro = (2 * Base) + (2 * Altura);

        //Retornamos la variable.
        return Perimetro;
    }
}
