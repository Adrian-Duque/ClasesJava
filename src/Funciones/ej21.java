package Funciones;

import java.util.Scanner;


public class ej21 { //Sumar los múltiplos de 3 y 5 que estén por debajo de n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dígame un numero Máximo: ");
        int num = sc.nextInt();
        System.out.print("La suma da: " + suma(num));
    }

    public static int suma(int n) {
        int suma = 0;
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;
            }
        }
        return suma;
    }
}
