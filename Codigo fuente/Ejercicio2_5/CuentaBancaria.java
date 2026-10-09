package Ejercicio2_5;

//Creación de la clase CuentaBancaria.
public class CuentaBancaria {

    //Creamos el enumerado con los tipos de cuenta bancaria.
    enum Tipo {AHORROS, CORRIENTE}

    //Sección para declaración de atributos.
    String NombresTitular;
    String ApellidosTitular;
    int NumeroCuenta;
    Tipo TipoCuenta;
    double Saldo = 0; //El saldo inicial es cero.
    double PorcentajeInteresMensual; //Por ejemplo 1.5 significa 1.5 % mensual.

    //Creamos el constructor que inicializa los atributos (el saldo no se pasa porque inicia en cero).
    public CuentaBancaria(String NombresTitular, String ApellidosTitular, int NumeroCuenta, Tipo TipoCuenta, double PorcentajeInteresMensual){

        //Asignamos los valores recibidos a los atributos.
        this.NombresTitular = NombresTitular;
        this.ApellidosTitular = ApellidosTitular;
        this.NumeroCuenta = NumeroCuenta;
        this.TipoCuenta = TipoCuenta;
        this.PorcentajeInteresMensual = PorcentajeInteresMensual;
    }

    //Creamos un método get para los nombres del titular.
    public String GetNombresTitular(){

        //Retornamos los nombres del titular.
        return NombresTitular;
    }

    //Creamos un método get para los apellidos del titular.
    public String GetApellidosTitular(){

        //Retornamos los apellidos del titular.
        return ApellidosTitular;
    }

    //Creamos un método get para el número de cuenta.
    public int GetNumeroCuenta(){

        //Retornamos el número de cuenta.
        return NumeroCuenta;
    }

    //Creamos un método get para el tipo de cuenta.
    public Tipo GetTipoCuenta(){

        //Retornamos el tipo de cuenta.
        return TipoCuenta;
    }

    //Creamos un método get para el saldo.
    public double GetSaldo(){

        //Retornamos el saldo.
        return Saldo;
    }

    //Creamos un método get para el porcentaje de interés mensual.
    public double GetPorcentajeInteresMensual(){

        //Retornamos el porcentaje de interés mensual.
        return PorcentajeInteresMensual;
    }

    //Creamos un método set para los nombres del titular.
    public void SetNombresTitular(String NombresTitular){

        //Asignamos los nuevos nombres del titular.
        this.NombresTitular = NombresTitular;
    }

    //Creamos un método set para los apellidos del titular.
    public void SetApellidosTitular(String ApellidosTitular){

        //Asignamos los nuevos apellidos del titular.
        this.ApellidosTitular = ApellidosTitular;
    }

    //Creamos un método set para el número de cuenta.
    public void SetNumeroCuenta(int NumeroCuenta){

        //Asignamos el nuevo número de cuenta.
        this.NumeroCuenta = NumeroCuenta;
    }

    //Creamos un método set para el tipo de cuenta.
    public void SetTipoCuenta(Tipo TipoCuenta){

        //Asignamos el nuevo tipo de cuenta.
        this.TipoCuenta = TipoCuenta;
    }

    //Creamos un método set para el saldo.
    public void SetSaldo(double Saldo){

        //Asignamos el nuevo saldo.
        this.Saldo = Saldo;
    }

    //Creamos un método set para el porcentaje de interés mensual.
    public void SetPorcentajeInteresMensual(double PorcentajeInteresMensual){

        //Asignamos el nuevo porcentaje de interés mensual.
        this.PorcentajeInteresMensual = PorcentajeInteresMensual;
    }

    //Creamos un método para imprimir en pantalla los datos de la cuenta bancaria.
    public void Imprimir(){

        //Impresión de los atributos de la cuenta bancaria.
        System.out.println("Nombres del titular = " + NombresTitular);
        System.out.println("Apellidos del titular = " + ApellidosTitular);
        System.out.println("Número de cuenta = " + NumeroCuenta);
        System.out.println("Tipo de cuenta = " + TipoCuenta);
        System.out.println("Saldo = " + Saldo);
        System.out.println("Porcentaje de interés mensual = " + PorcentajeInteresMensual + " %");
    }

    //Creamos un método para imprimir en pantalla el saldo actual.
    public void ConsultarSaldo(){

        //Impresión del saldo actual.
        System.out.println("El saldo actual es = " + Saldo);
    }

    //Creamos un método para consignar un valor en la cuenta (el valor debe ser mayor que cero).
    public boolean Consignar(double Valor){

        //Revisamos que el valor a consignar sea mayor que cero.
        if (Valor <= 0){
            System.out.println("El valor a consignar debe ser mayor que cero.");

            //Retornamos falso porque no se pudo consignar.
            return false;
        }

        //Actualizamos el saldo con el valor consignado.
        Saldo = Saldo + Valor;
        System.out.println("Se ha consignado $" + Valor + " en la cuenta. El nuevo saldo es $" + Saldo);

        //Retornamos verdadero porque se pudo consignar.
        return true;
    }

    //Creamos un método para retirar un valor de la cuenta (no puede superar el saldo actual).
    public boolean Retirar(double Valor){

        //Revisamos que el valor a retirar sea mayor que cero.
        if (Valor <= 0){
            System.out.println("El valor a retirar debe ser mayor que cero.");

            //Retornamos falso porque no se pudo retirar.
            return false;
        }

        //Revisamos que el valor a retirar no supere el saldo actual.
        if (Valor > Saldo){
            System.out.println("No se puede retirar $" + Valor + " porque supera el saldo actual de $" + Saldo);

            //Retornamos falso porque no se pudo retirar.
            return false;
        }

        //Actualizamos el saldo con el valor retirado.
        Saldo = Saldo - Valor;
        System.out.println("Se ha retirado $" + Valor + " de la cuenta. El nuevo saldo es $" + Saldo);

        //Retornamos verdadero porque se pudo retirar.
        return true;
    }

    //Creamos un método para calcular el nuevo saldo aplicando el interés mensual.
    public double AplicarInteresMensual(){

        //Inicializamos una variable para guardar el cálculo del interés (saldo * porcentaje / 100).
        double Interes = Saldo * PorcentajeInteresMensual / 100;

        //Actualizamos el saldo sumándole el interés.
        Saldo = Saldo + Interes;
        System.out.println("Se aplicó un interés de $" + Interes + ". El nuevo saldo es $" + Saldo);

        //Retornamos el nuevo saldo.
        return Saldo;
    }
}
