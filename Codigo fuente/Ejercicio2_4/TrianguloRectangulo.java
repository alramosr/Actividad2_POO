package Ejercicio2_4;

//Creación de la clase TrianguloRectangulo.
public class TrianguloRectangulo {

    //Sección para declaración de atributos.
    int Base; //En centímetros.
    int Altura; //En centímetros.

    //Margen de error para comparar los lados con la hipotenusa (que no siempre es un número entero).
    static final double Tolerancia = 0.000000001;

    //Creamos el constructor que inicializa la base y la altura del triángulo.
    public TrianguloRectangulo(int Base, int Altura){

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

    //Creamos un método get para la tolerancia.
    public static double GetTolerancia(){

        //Retornamos la tolerancia.
        return Tolerancia;
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

    //Creamos un método para calcular el área del triángulo.
    public double CalcularArea(){

        //Inicializamos una variable para guardar el cálculo del área (base * altura / 2).
        double Area = (Base * Altura) / 2.0;

        //Retornamos la variable.
        return Area;
    }

    //Creamos un método para calcular el perímetro del triángulo.
    public double CalcularPerimetro(){

        //Inicializamos una variable para guardar el cálculo del perímetro (base + altura + hipotenusa).
        double Perimetro = Base + Altura + CalcularHipotenusa();

        //Retornamos la variable.
        return Perimetro;
    }

    //Creamos un método para calcular la hipotenusa con el teorema de Pitágoras.
    public double CalcularHipotenusa(){

        //Inicializamos una variable para guardar el cálculo de la hipotenusa (raíz de base al cuadrado + altura al cuadrado).
        double Hipotenusa = Math.sqrt(Math.pow(Base, 2) + Math.pow(Altura, 2));

        //Retornamos la variable.
        return Hipotenusa;
    }

    //Creamos un método para determinar qué tipo de triángulo es (no retorna ningún valor).
    public void DeterminarTipoTriangulo(){

        //Calculamos la hipotenusa, que es el tercer lado del triángulo.
        double Hipotenusa = CalcularHipotenusa();

        //Comparamos los lados entre sí teniendo en cuenta la tolerancia.
        boolean BaseIgualAltura = Math.abs(Base - Altura) < Tolerancia;
        boolean BaseIgualHipotenusa = Math.abs(Base - Hipotenusa) < Tolerancia;
        boolean AlturaIgualHipotenusa = Math.abs(Altura - Hipotenusa) < Tolerancia;

        //Equilátero: todos sus lados son iguales.
        if (BaseIgualAltura && BaseIgualHipotenusa && AlturaIgualHipotenusa){
            System.out.println("Es un triángulo equilátero");
        }

        //Escaleno: todos sus lados son diferentes.
        else if (!BaseIgualAltura && !BaseIgualHipotenusa && !AlturaIgualHipotenusa){
            System.out.println("Es un triángulo escaleno");
        }

        //Isósceles: tiene dos lados iguales.
        else {
            System.out.println("Es un triángulo isósceles");
        }
    }
}
