package Funciones;

import java.util.Scanner;

public class ej23 {
    public static boolean primo(int n) { //Validar si es primo
        if (n <= 1)
            return false;     // 0, 1 y negativos NO son primos
        if (n == 2)
            return true;      // 2 SÍ es primo
        if (n % 2 == 0)
            return false; // si es par y no es 2, no es primo

        // probar solo hasta la raíz cuadrada
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int sumarPrimos(int n) { //sumar los n primeros primos
        int suma = 0;
        for (int i = 2; i < n; i++) {   // empezamos en 2, el primer primo
            if (primo(i)) {
                suma += i;
            }
        }
        return suma;
    }
    public static void main(String[] args){ //sumar los n primeros números primos
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int n = sc.nextInt();
        System.out.println("Suma de primos menores de " + n + " = " + sumarPrimos(n));
    }
}
