package Introduccion;

import java.util.Scanner;

//sumar los n primeros números
public class ej8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite hasta el numero que quieres sumar: ");
        int n = input.nextInt();
        int suma = 0;
        for (int i = 0; i <= n; i++) {
            suma += i;
        }
        System.out.println(suma);
    }
}
