package Introducción;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Mes: ");
        int month = input.nextInt();
        input.close();

        if ((month >= 1) && (month <= 12)) { //Validar mes
            int maxDays = 30;
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    maxDays = 31;
                    break;
                case 2:
                    maxDays = 28;
                    break;
            }
            System.out.println("El mes " + month + " tiene " + maxDays + " Dias");
        } else {
            System.out.println("El mes es Incorrecto");
        }
    }
}