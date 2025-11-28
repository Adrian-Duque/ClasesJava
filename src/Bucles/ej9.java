package Bucles;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entrada, total = 0;
        do {
            System.out.print("Dame un numero para sumar:");
            entrada = input.nextInt();
            total = total + entrada;
            if (entrada > 0) {
                System.out.println("Solución: " + total);
            }
        } while (entrada > 0);
    }
}