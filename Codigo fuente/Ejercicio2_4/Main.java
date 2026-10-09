package Ejercicio2_4;

//Creación clase Main.
public class Main {
    public static void main(String[] args){

        //Creación de las figuras geométricas.
        Circulo Figura1 = new Circulo(2);
        Rectangulo Figura2 = new Rectangulo(1, 2);
        Cuadrado Figura3 = new Cuadrado(3);
        TrianguloRectangulo Figura4 = new TrianguloRectangulo(3, 5);
        Rombo Figura5 = new Rombo(8, 6);
        Trapecio Figura6 = new Trapecio(10, 4, 4, 5, 5);

        //Impresión del área y el perímetro del círculo.
        System.out.println("El área del círculo es = " + Figura1.CalcularArea());
        System.out.println("El perímetro del círculo es = " + Figura1.CalcularPerimetro());
        System.out.println();

        //Impresión del área y el perímetro del rectángulo.
        System.out.println("El área del rectángulo es = " + Figura2.CalcularArea());
        System.out.println("El perímetro del rectángulo es = " + Figura2.CalcularPerimetro());
        System.out.println();

        //Impresión del área y el perímetro del cuadrado.
        System.out.println("El área del cuadrado es = " + Figura3.CalcularArea());
        System.out.println("El perímetro del cuadrado es = " + Figura3.CalcularPerimetro());
        System.out.println();

        //Impresión del área, el perímetro, la hipotenusa y el tipo del triángulo rectángulo.
        System.out.println("El área del triángulo es = " + Figura4.CalcularArea());
        System.out.println("El perímetro del triángulo es = " + Figura4.CalcularPerimetro());
        System.out.println("La hipotenusa del triángulo es = " + Figura4.CalcularHipotenusa());
        Figura4.DeterminarTipoTriangulo();
        System.out.println();

        //Impresión del área y el perímetro del rombo.
        System.out.println("El área del rombo es = " + Figura5.CalcularArea());
        System.out.println("El perímetro del rombo es = " + Figura5.CalcularPerimetro());
        System.out.println();

        //Impresión del área y el perímetro del trapecio.
        System.out.println("El área del trapecio es = " + Figura6.CalcularArea());
        System.out.println("El perímetro del trapecio es = " + Figura6.CalcularPerimetro());

    }
}
