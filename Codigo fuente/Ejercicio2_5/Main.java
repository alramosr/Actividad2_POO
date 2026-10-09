package Ejercicio2_5;

//Creación clase Main.
public class Main {
    public static void main(String[] args){

        //Creación de la cuenta bancaria.
        CuentaBancaria Cuenta = new CuentaBancaria("Pedro", "Pérez", 123456789, CuentaBancaria.Tipo.AHORROS, 1.5);

        //Impresión de los datos de la cuenta bancaria.
        Cuenta.Imprimir();

        //Operaciones de consignar y retirar sobre la cuenta.
        Cuenta.Consignar(200000);
        Cuenta.Consignar(300000);
        Cuenta.Retirar(400000);

        //Consulta del saldo actual.
        Cuenta.ConsultarSaldo();

        //Intento de retirar más dinero del que hay en la cuenta.
        Cuenta.Retirar(500000);

        //Aplicación del interés mensual sobre el saldo.
        Cuenta.AplicarInteresMensual();

    }
}
