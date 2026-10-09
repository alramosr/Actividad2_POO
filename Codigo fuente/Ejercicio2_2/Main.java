package Ejercicio2_2;

//Creación clase Main.
public class Main {
    public static void main(String[] args){

        //Creación de los dos planetas.
        Planeta Planeta1 = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150, Planeta.TipoPlaneta.TERRESTRE, true, 1, 1);
        Planeta Planeta2 = new Planeta("Júpiter", 79, 1.899E27, 1.4313E15, 139820, 750, Planeta.TipoPlaneta.GASEOSO, true, 11.86, 0.41);

        //Impresión de los datos, la densidad y si el primer planeta es exterior.
        Planeta1.Imprimir();
        System.out.println("Densidad del planeta = " + Planeta1.CalcularDensidad());
        System.out.println("Es planeta exterior = " + Planeta1.EsPlanetaExterior());
        System.out.println();

        //Impresión de los datos, la densidad y si el segundo planeta es exterior.
        Planeta2.Imprimir();
        System.out.println("Densidad del planeta = " + Planeta2.CalcularDensidad());
        System.out.println("Es planeta exterior = " + Planeta2.EsPlanetaExterior());

    }
}
