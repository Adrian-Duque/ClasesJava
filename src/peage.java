package Introduccion; // Cambie el package acorde con mi directorio en el ordenador

import java.util.Scanner;

public class peage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Seleccione tu tipo de vehiculo\nC Coche\nM Moto\nT Camión\n");        //he añadido un \n al final para que quede más bonito :)
        String tipo = input.nextLine();         //Puse la S de string en Mayúscula
        System.out.print("Indica el dia de la semana\n1. Lunes\n2. Martes\n3. Miércoles\n4. Jueves\n5. Viernes\n6. Sábado\n7. Domingo\n");          //he añadido un \n al final para que quede más bonito :)
        int dia = input.nextInt();
        double descuento = 0; //añado un valor a descuento para que no falle
        switch(dia){                //He tenido que cambiar select por switch, ya que me equivoque en la hoja
            case 1,3,5:
                descuento=1;
                break;
            case 2,4:
                descuento=0.85;
                break;
            case 6,7:
                descuento=1.2;
                break;
            default:
                System.out.println("Introduce un dia valido");
        }
        switch(tipo) {                //He tenido que cambiar select por switch, ya que me equivoque en la hoja
            case "C","c":
                System.out.println("Debe pagar "+5*descuento+"€");
                break;
            case "M","m":
                System.out.println("Debe pagar "+3*descuento+"€");
                break;
            case "T","t":
                System.out.println("Debe pagar "+8*descuento+"€");
                break;
            default:
                System.out.println("Introduce una letra valida");
        }
    }
}
