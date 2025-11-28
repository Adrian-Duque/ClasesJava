package Bucles;

import java.util.Scanner;

public class ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean iguales = false;
        System.out.println("Ingrese la palabra 1: ");
        String palabra1 = sc.nextLine();
        for (int i = 0; i < palabra1.length(); i++) {
            System.out.println(palabra1.charAt(i));
        }
        System.out.println("Ingrese la palabra 2: ");
        String palabra2 = sc.nextLine();
        for (int i = 0; i < palabra2.length(); i++) {
            System.out.println(palabra2.charAt(i));
        }
        if (palabra1.equals(palabra2)) {
            iguales = true;
        }
        System.out.println("La palabra " + palabra1 + " y la palabra " + palabra2 + " la igualdad es " + iguales);
    }
}