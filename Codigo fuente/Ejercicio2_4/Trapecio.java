package Ejercicio2_4;

//Creación de la clase Trapecio.
public class Trapecio {

    //Sección para declaración de atributos.
    int BaseMayor; //En centímetros.
    int BaseMenor; //En centímetros.
    int Altura; //En centímetros.
    int LadoIzquierdo; //Lado no paralelo, en centímetros.
    int LadoDerecho; //Lado no paralelo, en centímetros.

    //Creamos el constructor que inicializa las bases, la altura y los lados del trapecio.
    public Trapecio(int BaseMayor, int BaseMenor, int Altura, int LadoIzquierdo, int LadoDerecho){

        //Asignamos los valores recibidos a los atributos.
        this.BaseMayor = BaseMayor;
        this.BaseMenor = BaseMenor;
        this.Altura = Altura;
        this.LadoIzquierdo = LadoIzquierdo;
        this.LadoDerecho = LadoDerecho;
    }

    //Creamos un método get para la base mayor.
    public int GetBaseMayor(){

        //Retornamos la base mayor.
        return BaseMayor;
    }

    //Creamos un método get para la base menor.
    public int GetBaseMenor(){

        //Retornamos la base menor.
        return BaseMenor;
    }

    //Creamos un método get para la altura.
    public int GetAltura(){

        //Retornamos la altura.
        return Altura;
    }

    //Creamos un método get para el lado izquierdo.
    public int GetLadoIzquierdo(){

        //Retornamos el lado izquierdo.
        return LadoIzquierdo;
    }

    //Creamos un método get para el lado derecho.
    public int GetLadoDerecho(){

        //Retornamos el lado derecho.
        return LadoDerecho;
    }

    //Creamos un método set para la base mayor.
    public void SetBaseMayor(int BaseMayor){

        //Asignamos la nueva base mayor.
        this.BaseMayor = BaseMayor;
    }

    //Creamos un método set para la base menor.
    public void SetBaseMenor(int BaseMenor){

        //Asignamos la nueva base menor.
        this.BaseMenor = BaseMenor;
    }

    //Creamos un método set para la altura.
    public void SetAltura(int Altura){

        //Asignamos la nueva altura.
        this.Altura = Altura;
    }

    //Creamos un método set para el lado izquierdo.
    public void SetLadoIzquierdo(int LadoIzquierdo){

        //Asignamos el nuevo lado izquierdo.
        this.LadoIzquierdo = LadoIzquierdo;
    }

    //Creamos un método set para el lado derecho.
    public void SetLadoDerecho(int LadoDerecho){

        //Asignamos el nuevo lado derecho.
        this.LadoDerecho = LadoDerecho;
    }

    //Creamos un método para calcular el área del trapecio.
    public double CalcularArea(){

        //Inicializamos una variable para guardar el cálculo del área ((base mayor + base menor) * altura / 2).
        double Area = ((BaseMayor + BaseMenor) * Altura) / 2.0;

        //Retornamos la variable.
        return Area;
    }

    //Creamos un método para calcular el perímetro del trapecio.
    public double CalcularPerimetro(){

        //Inicializamos una variable para guardar el cálculo del perímetro (suma de sus cuatro lados).
        double Perimetro = BaseMayor + BaseMenor + LadoIzquierdo + LadoDerecho;

        //Retornamos la variable.
        return Perimetro;
    }
}
