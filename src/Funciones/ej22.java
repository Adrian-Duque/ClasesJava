package Funciones;

import java.util.Scanner;

public class ej22 {
    public static long sumaFibonacciParesInt(int n) {
        long a = 1;
        long b = 2;
        long suma = 0;

        for (int i = 1; i <= n; i++) {
            if (a % 2 == 0) {
                suma += a;
            }
            long temp = a + b;
            a = b;
            b = temp;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sumaFibonacciParesInt(num));
    }
}
