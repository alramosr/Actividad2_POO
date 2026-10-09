package Ejercicio2_2;

//Creación de la clase Planeta.
public class Planeta {

    //Creamos el enumerado con los tipos de planeta de acuerdo con su tamaño.
    enum TipoPlaneta {GASEOSO, TERRESTRE, ENANO}

    //Sección para declaración de atributos con sus valores iniciales.
    String Nombre = null;
    int CantidadSatelites = 0;
    double Masa = 0; //En kilogramos.
    double Volumen = 0; //En kilómetros cúbicos.
    int Diametro = 0; //En kilómetros.
    double DistanciaSol = 0; //En millones de kilómetros.
    TipoPlaneta Tipo;
    boolean EsObservable = false;
    double PeriodoOrbital = 0; //En años.
    double PeriodoRotacion = 0; //En días.

    //Creamos el constructor que inicializa los atributos del planeta.
    public Planeta(String Nombre, int CantidadSatelites, double Masa, double Volumen, int Diametro, double DistanciaSol, TipoPlaneta Tipo, boolean EsObservable, double PeriodoOrbital, double PeriodoRotacion){

        //Asignamos los valores recibidos a los atributos.
        this.Nombre = Nombre;
        this.CantidadSatelites = CantidadSatelites;
        this.Masa = Masa;
        this.Volumen = Volumen;
        this.Diametro = Diametro;
        this.DistanciaSol = DistanciaSol;
        this.Tipo = Tipo;
        this.EsObservable = EsObservable;
        this.PeriodoOrbital = PeriodoOrbital;
        this.PeriodoRotacion = PeriodoRotacion;
    }

    //Creamos un método get para el nombre.
    public String GetNombre(){

        //Retornamos el nombre.
        return Nombre;
    }

    //Creamos un método get para la cantidad de satélites.
    public int GetCantidadSatelites(){

        //Retornamos la cantidad de satélites.
        return CantidadSatelites;
    }

    //Creamos un método get para la masa.
    public double GetMasa(){

        //Retornamos la masa.
        return Masa;
    }

    //Creamos un método get para el volumen.
    public double GetVolumen(){

        //Retornamos el volumen.
        return Volumen;
    }

    //Creamos un método get para el diámetro.
    public int GetDiametro(){

        //Retornamos el diámetro.
        return Diametro;
    }

    //Creamos un método get para la distancia al sol.
    public double GetDistanciaSol(){

        //Retornamos la distancia al sol.
        return DistanciaSol;
    }

    //Creamos un método get para el tipo de planeta.
    public TipoPlaneta GetTipo(){

        //Retornamos el tipo de planeta.
        return Tipo;
    }

    //Creamos un método get para saber si es observable.
    public boolean GetEsObservable(){

        //Retornamos si es observable.
        return EsObservable;
    }

    //Creamos un método get para el periodo orbital.
    public double GetPeriodoOrbital(){

        //Retornamos el periodo orbital.
        return PeriodoOrbital;
    }

    //Creamos un método get para el periodo de rotación.
    public double GetPeriodoRotacion(){

        //Retornamos el periodo de rotación.
        return PeriodoRotacion;
    }

    //Creamos un método set para el nombre.
    public void SetNombre(String Nombre){

        //Asignamos el nuevo nombre.
        this.Nombre = Nombre;
    }

    //Creamos un método set para la cantidad de satélites.
    public void SetCantidadSatelites(int CantidadSatelites){

        //Asignamos la nueva cantidad de satélites.
        this.CantidadSatelites = CantidadSatelites;
    }

    //Creamos un método set para la masa.
    public void SetMasa(double Masa){

        //Asignamos la nueva masa.
        this.Masa = Masa;
    }

    //Creamos un método set para el volumen.
    public void SetVolumen(double Volumen){

        //Asignamos el nuevo volumen.
        this.Volumen = Volumen;
    }

    //Creamos un método set para el diámetro.
    public void SetDiametro(int Diametro){

        //Asignamos el nuevo diámetro.
        this.Diametro = Diametro;
    }

    //Creamos un método set para la distancia al sol.
    public void SetDistanciaSol(double DistanciaSol){

        //Asignamos la nueva distancia al sol.
        this.DistanciaSol = DistanciaSol;
    }

    //Creamos un método set para el tipo de planeta.
    public void SetTipo(TipoPlaneta Tipo){

        //Asignamos el nuevo tipo de planeta.
        this.Tipo = Tipo;
    }

    //Creamos un método set para saber si es observable.
    public void SetEsObservable(boolean EsObservable){

        //Asignamos si es observable.
        this.EsObservable = EsObservable;
    }

    //Creamos un método set para el periodo orbital.
    public void SetPeriodoOrbital(double PeriodoOrbital){

        //Asignamos el nuevo periodo orbital.
        this.PeriodoOrbital = PeriodoOrbital;
    }

    //Creamos un método set para el periodo de rotación.
    public void SetPeriodoRotacion(double PeriodoRotacion){

        //Asignamos el nuevo periodo de rotación.
        this.PeriodoRotacion = PeriodoRotacion;
    }

    //Creamos un método para imprimir en pantalla los datos del planeta.
    public void Imprimir(){

        //Impresión de los atributos del planeta.
        System.out.println("Nombre del planeta = " + Nombre);
        System.out.println("Cantidad de satélites = " + CantidadSatelites);
        System.out.println("Masa del planeta = " + Masa);
        System.out.println("Volumen del planeta = " + Volumen);
        System.out.println("Diámetro del planeta = " + Diametro);
        System.out.println("Distancia al sol (millones de km) = " + DistanciaSol);
        System.out.println("Tipo de planeta = " + Tipo);
        System.out.println("Es observable = " + EsObservable);
        System.out.println("Periodo orbital (años) = " + PeriodoOrbital);
        System.out.println("Periodo de rotación (días) = " + PeriodoRotacion);
    }

    //Creamos un método para calcular la densidad del planeta.
    public double CalcularDensidad(){

        //Inicializamos una variable para guardar el cálculo de la densidad (masa / volumen).
        double Densidad = Masa / Volumen;

        //Retornamos la densidad.
        return Densidad;
    }

    //Creamos un método para determinar si el planeta es exterior.
    public boolean EsPlanetaExterior(){

        //Declaramos la unidad astronómica en millones de kilómetros (149597870 Km).
        double UnidadAstronomica = 149.59787;

        //Calculamos dónde termina el cinturón de asteroides (3.4 UA).
        double Limite = UnidadAstronomica * 3.4;

        //Un planeta exterior está situado más allá del cinturón de asteroides.
        boolean EsExterior = DistanciaSol > Limite;

        //Retornamos si el planeta es exterior.
        return EsExterior;
    }
}
