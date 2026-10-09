package Ejercicio2_3;

//Creación clase Main.
public class Main {
    public static void main(String[] args){

        //Creación del automóvil.
        Automovil Auto1 = new Automovil("Ford", 2018, 3, Automovil.TipoCom.DIESEL, Automovil.TipoA.EJECUTIVO, 5, 6, 250, Automovil.TipoColor.NEGRO, true);

        //Impresión de los datos del automóvil.
        Auto1.Imprimir();

        //Colocamos la velocidad actual en 100 km/h.
        Auto1.SetVelocidadActual(100);
        System.out.println("Velocidad actual = " + Auto1.GetVelocidadActual());

        //Aumentamos la velocidad en 20 km/h.
        Auto1.Acelerar(20);
        System.out.println("Velocidad actual = " + Auto1.GetVelocidadActual());

        //Disminuimos la velocidad en 50 km/h.
        Auto1.Desacelerar(50);
        System.out.println("Velocidad actual = " + Auto1.GetVelocidadActual());

        //Tiempo estimado para recorrer 140 km a la velocidad actual.
        System.out.println("Tiempo de llegada (horas) = " + Auto1.CalcularTiempoLlegada(140));

        //Frenamos el automóvil.
        Auto1.Frenar();
        System.out.println("Velocidad actual = " + Auto1.GetVelocidadActual());

        //Intento de desacelerar con el automóvil detenido.
        Auto1.Desacelerar(20);

        //Intentos de acelerar y desacelerar con valores negativos.
        Auto1.Acelerar(-30);
        Auto1.Desacelerar(-400);
        System.out.println("Velocidad actual = " + Auto1.GetVelocidadActual());

        //Revisión de multas antes de superar la velocidad máxima.
        System.out.println("Tiene multas = " + Auto1.TieneMultas());

        //Dos intentos de superar la velocidad máxima (cada uno genera una multa).
        Auto1.Acelerar(300);
        Auto1.SetVelocidadActual(260);

        //Revisión de multas después de superar la velocidad máxima.
        System.out.println("Tiene multas = " + Auto1.TieneMultas());
        System.out.println("Valor total de multas = " + Auto1.CalcularValorTotalMultas());

    }
}
