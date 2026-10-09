package Ejercicio2_1;

//Creación de la clase Persona.
public class Persona {

    //Sección para declaración de atributos.
    String Nombre;
    String Apellidos;
    String NumeroDocumentoIdentidad;
    int AnioNacimiento;
    String PaisNacimiento;
    char Genero; //'H' para hombre y 'M' para mujer.

    //Creamos el constructor que inicializa los atributos de la persona.
    public Persona(String Nombre, String Apellidos, String NumeroDocumentoIdentidad, int AnioNacimiento, String PaisNacimiento, char Genero){

        //Asignamos los valores recibidos a los atributos.
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.NumeroDocumentoIdentidad = NumeroDocumentoIdentidad;
        this.AnioNacimiento = AnioNacimiento;
        this.PaisNacimiento = PaisNacimiento;
        this.Genero = Genero;
    }

    //Creamos un método get para el nombre.
    public String GetNombre(){

        //Retornamos el nombre.
        return Nombre;
    }

    //Creamos un método get para los apellidos.
    public String GetApellidos(){

        //Retornamos los apellidos.
        return Apellidos;
    }

    //Creamos un método get para el número de documento de identidad.
    public String GetNumeroDocumentoIdentidad(){

        //Retornamos el número de documento de identidad.
        return NumeroDocumentoIdentidad;
    }

    //Creamos un método get para el año de nacimiento.
    public int GetAnioNacimiento(){

        //Retornamos el año de nacimiento.
        return AnioNacimiento;
    }

    //Creamos un método get para el país de nacimiento.
    public String GetPaisNacimiento(){

        //Retornamos el país de nacimiento.
        return PaisNacimiento;
    }

    //Creamos un método get para el género.
    public char GetGenero(){

        //Retornamos el género.
        return Genero;
    }

    //Creamos un método set para el nombre.
    public void SetNombre(String Nombre){

        //Asignamos el nuevo nombre.
        this.Nombre = Nombre;
    }

    //Creamos un método set para los apellidos.
    public void SetApellidos(String Apellidos){

        //Asignamos los nuevos apellidos.
        this.Apellidos = Apellidos;
    }

    //Creamos un método set para el número de documento de identidad.
    public void SetNumeroDocumentoIdentidad(String NumeroDocumentoIdentidad){

        //Asignamos el nuevo número de documento de identidad.
        this.NumeroDocumentoIdentidad = NumeroDocumentoIdentidad;
    }

    //Creamos un método set para el año de nacimiento.
    public void SetAnioNacimiento(int AnioNacimiento){

        //Asignamos el nuevo año de nacimiento.
        this.AnioNacimiento = AnioNacimiento;
    }

    //Creamos un método set para el país de nacimiento.
    public void SetPaisNacimiento(String PaisNacimiento){

        //Asignamos el nuevo país de nacimiento.
        this.PaisNacimiento = PaisNacimiento;
    }

    //Creamos un método set para el género.
    public void SetGenero(char Genero){

        //Asignamos el nuevo género.
        this.Genero = Genero;
    }

    //Creamos un método para imprimir en pantalla los datos de la persona.
    public void Imprimir(){

        //Impresión de los atributos de la persona.
        System.out.println("Nombre = " + Nombre);
        System.out.println("Apellidos = " + Apellidos);
        System.out.println("Número de documento de identidad = " + NumeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + AnioNacimiento);
        System.out.println("País de nacimiento = " + PaisNacimiento);
        System.out.println("Género = " + Genero);
        System.out.println();
    }
}
