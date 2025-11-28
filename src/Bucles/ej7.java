package Bucles;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean valido = true;
        while (valido) {
            System.out.print("Dime una tabla de sumar que quieres que te diga: ");
            final int NUMERO = input.nextInt();
            if (NUMERO >= 1 && NUMERO <= 10) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(NUMERO + "+" + i + "=" + (NUMERO + i));
                }
                valido = false;
            } else {
                System.out.println("ERROR, Dime un numero entre 1 y 10\n");
            }
        }
    }
}
