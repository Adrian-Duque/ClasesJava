package Objetos;

import java.util.Scanner;

public class EjemploPersona {
    public static objetos pedirDatos(){
        objetos p = new  objetos();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        p.nombre = sc.nextLine();
        //System.out.print("Apellido: ");
        //p.apellido = sc.nextLine();
        //System.out.print("DNI: ");
        //p.dni = sc.next();
        System.out.print("Edad: ");
        p.edad = sc.nextInt();
        return p;
    }

    public static void main(String[] args) {
        objetos [] p = new objetos[5];
        for(int i = 0; i < p.length; i++) {
            p[i] = pedirDatos();
        }
        int menor = p[0].edad;
        String nomMeno = "";
        for(int i = 1; i < p.length; i++) {
            if (p[i].edad < menor) {
                menor = p[i].edad;
                nomMeno = p[i].nombre;
            }
        }
        System.out.print("Nombre: " + nomMeno + " \nEdad: " + menor );
    }
}
