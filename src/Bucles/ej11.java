package Bucles;

import java.util.Random;
import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        final int numero = rand.nextInt(10)+1;
        int intento;
        System.out.println("Aleatorio" + numero);
        do {
            System.out.print("Adivina el numero del 0 al 10: ");
            intento = input.nextInt();

        } while (intento != numero);
        System.out.println("Enhorabuena, acertaste el numero");
    }
}
