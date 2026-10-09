package Ejercicio2_3;

//Creación de la clase Automovil.
public class Automovil {

    //Creamos los enumerados para el tipo de combustible, el tipo de automóvil y el color.
    enum TipoCom {GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL}
    enum TipoA {CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV}
    enum TipoColor {BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA}

    //Sección para declaración de atributos.
    String Marca;
    int Modelo; //Año de fabricación.
    int Motor; //Volumen en litros del cilindraje.
    TipoCom TipoCombustible;
    TipoA TipoAutomovil;
    int NumeroPuertas;
    int CantidadAsientos;
    int VelocidadMaxima; //En km/h.
    TipoColor Color;
    int VelocidadActual = 0; //En km/h.
    boolean EsAutomatico;
    int CantidadMultas = 0;

    //Valor de cada multa por intentar superar la velocidad máxima.
    static final double ValorMulta = 500000;

    //Creamos el constructor que inicializa los atributos del automóvil.
    public Automovil(String Marca, int Modelo, int Motor, TipoCom TipoCombustible, TipoA TipoAutomovil, int NumeroPuertas, int CantidadAsientos, int VelocidadMaxima, TipoColor Color, boolean EsAutomatico){

        //Asignamos los valores recibidos a los atributos.
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Motor = Motor;
        this.TipoCombustible = TipoCombustible;
        this.TipoAutomovil = TipoAutomovil;
        this.NumeroPuertas = NumeroPuertas;
        this.CantidadAsientos = CantidadAsientos;
        this.VelocidadMaxima = VelocidadMaxima;
        this.Color = Color;
        this.EsAutomatico = EsAutomatico;
    }

    //Creamos un método get para la marca.
    public String GetMarca(){

        //Retornamos la marca.
        return Marca;
    }

    //Creamos un método get para el modelo.
    public int GetModelo(){

        //Retornamos el modelo.
        return Modelo;
    }

    //Creamos un método get para el motor.
    public int GetMotor(){

        //Retornamos el motor.
        return Motor;
    }

    //Creamos un método get para el tipo de combustible.
    public TipoCom GetTipoCombustible(){

        //Retornamos el tipo de combustible.
        return TipoCombustible;
    }

    //Creamos un método get para el tipo de automóvil.
    public TipoA GetTipoAutomovil(){

        //Retornamos el tipo de automóvil.
        return TipoAutomovil;
    }

    //Creamos un método get para el número de puertas.
    public int GetNumeroPuertas(){

        //Retornamos el número de puertas.
        return NumeroPuertas;
    }

    //Creamos un método get para la cantidad de asientos.
    public int GetCantidadAsientos(){

        //Retornamos la cantidad de asientos.
        return CantidadAsientos;
    }

    //Creamos un método get para la velocidad máxima.
    public int GetVelocidadMaxima(){

        //Retornamos la velocidad máxima.
        return VelocidadMaxima;
    }

    //Creamos un método get para el color.
    public TipoColor GetColor(){

        //Retornamos el color.
        return Color;
    }

    //Creamos un método get para la velocidad actual.
    public int GetVelocidadActual(){

        //Retornamos la velocidad actual.
        return VelocidadActual;
    }

    //Creamos un método get para saber si es automático.
    public boolean GetEsAutomatico(){

        //Retornamos si es automático.
        return EsAutomatico;
    }

    //Creamos un método get para la cantidad de multas.
    public int GetCantidadMultas(){

        //Retornamos la cantidad de multas.
        return CantidadMultas;
    }

    //Creamos un método get para el valor de cada multa.
    public static double GetValorMulta(){

        //Retornamos el valor de cada multa.
        return ValorMulta;
    }

    //Creamos un método set para la marca.
    public void SetMarca(String Marca){

        //Asignamos la nueva marca.
        this.Marca = Marca;
    }

    //Creamos un método set para el modelo.
    public void SetModelo(int Modelo){

        //Asignamos el nuevo modelo.
        this.Modelo = Modelo;
    }

    //Creamos un método set para el motor.
    public void SetMotor(int Motor){

        //Asignamos el nuevo motor.
        this.Motor = Motor;
    }

    //Creamos un método set para el tipo de combustible.
    public void SetTipoCombustible(TipoCom TipoCombustible){

        //Asignamos el nuevo tipo de combustible.
        this.TipoCombustible = TipoCombustible;
    }

    //Creamos un método set para el tipo de automóvil.
    public void SetTipoAutomovil(TipoA TipoAutomovil){

        //Asignamos el nuevo tipo de automóvil.
        this.TipoAutomovil = TipoAutomovil;
    }

    //Creamos un método set para el número de puertas.
    public void SetNumeroPuertas(int NumeroPuertas){

        //Asignamos el nuevo número de puertas.
        this.NumeroPuertas = NumeroPuertas;
    }

    //Creamos un método set para la cantidad de asientos.
    public void SetCantidadAsientos(int CantidadAsientos){

        //Asignamos la nueva cantidad de asientos.
        this.CantidadAsientos = CantidadAsientos;
    }

    //Creamos un método set para la velocidad máxima.
    public void SetVelocidadMaxima(int VelocidadMaxima){

        //Asignamos la nueva velocidad máxima.
        this.VelocidadMaxima = VelocidadMaxima;
    }

    //Creamos un método set para el color.
    public void SetColor(TipoColor Color){

        //Asignamos el nuevo color.
        this.Color = Color;
    }

    //Creamos un método set para la velocidad actual (no puede ser negativa ni superar la máxima).
    public void SetVelocidadActual(int VelocidadActual){

        //Revisamos que la velocidad no sea negativa.
        if (VelocidadActual < 0){
            System.out.println("No se puede asignar una velocidad negativa.");
        }

        //Revisamos que la velocidad no supere la máxima, si la supera se genera una multa.
        else if (VelocidadActual > VelocidadMaxima){
            System.out.println("No se puede asignar una velocidad superior a la máxima del automóvil.");
            GenerarMulta();
        }

        //Si la velocidad es válida la asignamos.
        else {
            this.VelocidadActual = VelocidadActual;
        }
    }

    //Creamos un método set para saber si es automático.
    public void SetEsAutomatico(boolean EsAutomatico){

        //Asignamos si es automático.
        this.EsAutomatico = EsAutomatico;
    }

    //Creamos un método set para la cantidad de multas.
    public void SetCantidadMultas(int CantidadMultas){

        //Asignamos la nueva cantidad de multas.
        this.CantidadMultas = CantidadMultas;
    }

    //Creamos un método para acelerar, si se intenta superar la velocidad máxima se genera una multa.
    public void Acelerar(int IncrementoVelocidad){

        //Revisamos que el incremento sea mayor que cero.
        if (IncrementoVelocidad <= 0){
            System.out.println("El incremento de velocidad debe ser mayor que cero.");
        }

        //Si el incremento no supera la velocidad máxima, aumentamos la velocidad.
        else if (VelocidadActual + IncrementoVelocidad <= VelocidadMaxima){
            VelocidadActual = VelocidadActual + IncrementoVelocidad;
        }

        //De otra manera no se puede incrementar la velocidad y se genera una multa.
        else {
            System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil.");
            GenerarMulta();
        }
    }

    //Creamos un método para desacelerar sin llegar a una velocidad negativa.
    public void Desacelerar(int DecrementoVelocidad){

        //Revisamos que el decremento sea mayor que cero.
        if (DecrementoVelocidad <= 0){
            System.out.println("El decremento de velocidad debe ser mayor que cero.");
        }

        //Si la velocidad no queda negativa, disminuimos la velocidad.
        else if (VelocidadActual - DecrementoVelocidad >= 0){
            VelocidadActual = VelocidadActual - DecrementoVelocidad;
        }

        //De otra manera no se puede decrementar la velocidad.
        else {
            System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }

    //Creamos un método para frenar (coloca la velocidad actual en cero).
    public void Frenar(){

        //Colocamos la velocidad actual en cero.
        VelocidadActual = 0;
    }

    //Creamos un método para generar una multa por intentar superar la velocidad máxima.
    public void GenerarMulta(){

        //Aumentamos en uno la cantidad de multas.
        CantidadMultas = CantidadMultas + 1;

        //Impresión de la multa generada.
        System.out.println("Se ha generado una multa de $" + ValorMulta + ". Multas acumuladas = " + CantidadMultas);
    }

    //Creamos un método para determinar si el automóvil tiene multas.
    public boolean TieneMultas(){

        //Inicializamos una variable para guardar si hay al menos una multa.
        boolean TieneMultas = CantidadMultas > 0;

        //Retornamos la variable.
        return TieneMultas;
    }

    //Creamos un método para calcular el valor total de las multas.
    public double CalcularValorTotalMultas(){

        //Inicializamos una variable para guardar el cálculo del valor total (cantidad * valor de cada multa).
        double ValorTotal = CantidadMultas * ValorMulta;

        //Retornamos la variable.
        return ValorTotal;
    }

    //Creamos un método para calcular el tiempo de llegada en horas (distancia / velocidad actual).
    public double CalcularTiempoLlegada(int Distancia){

        //Si el automóvil está detenido no se puede calcular el tiempo de llegada.
        if (VelocidadActual == 0){
            System.out.println("El automóvil está detenido, no es posible calcular el tiempo de llegada.");

            //Retornamos -1 para indicar que no se puede calcular.
            return -1;
        }

        //Inicializamos una variable para guardar el cálculo del tiempo de llegada.
        double TiempoLlegada = (double) Distancia / VelocidadActual;

        //Retornamos la variable.
        return TiempoLlegada;
    }

    //Creamos un método para imprimir en pantalla los datos del automóvil.
    public void Imprimir(){

        //Impresión de los atributos del automóvil.
        System.out.println("Marca = " + Marca);
        System.out.println("Modelo = " + Modelo);
        System.out.println("Motor = " + Motor);
        System.out.println("Tipo de combustible = " + TipoCombustible);
        System.out.println("Tipo de automóvil = " + TipoAutomovil);
        System.out.println("Número de puertas = " + NumeroPuertas);
        System.out.println("Cantidad de asientos = " + CantidadAsientos);
        System.out.println("Velocidad máxima = " + VelocidadMaxima);
        System.out.println("Color = " + Color);
        System.out.println("Es automático = " + EsAutomatico);
    }
}
