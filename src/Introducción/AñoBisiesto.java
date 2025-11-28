package Introducción;

import java.util.Scanner;

public class AñoBisiesto {
    public static void main(String[] args) {
        System.out.print("Digite un año: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        boolean bisiesto = false; //Condiciones para que sea bisiesto
        if (year % 4 == 0 && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("El año " + year + " es bisiesto");
        } else {
            System.out.println("El año " + year + " no es bisiesto");
        }
    }
}