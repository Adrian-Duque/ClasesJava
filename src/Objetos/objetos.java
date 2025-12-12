package Objetos;

public class objetos {
    public String nombre;
    public String apellido;
    public String dni;
    public int edad;

    // Constructor Array
    public objetos(String nombre, String apellido, String dni, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    // Constructor Por Defecto
    public objetos(){
        this.nombre = "";
        this.apellido = "";
        this.dni = "";
        this.edad = 0;
    }

    // Mostrar Datos
    public void mostrarDatos(){
        System.out.println(this.nombre+"\n"+this.apellido+"\n"+this.dni+"\n"+this.edad);
    }
}
