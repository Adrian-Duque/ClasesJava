package Bucles;

import java.util.Scanner;

//calcular el numero pi/4 en base a la sumatoria
public class ej10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dígame hasta que n sumo: ");
        int n = input.nextInt();
        double suma = 0.0;
        for (int i = 0; i <= n; i++) {
            suma = suma + (Math.pow((-1),i))/(2*i+1);
        }
        System.out.println("Suma: "+suma);
    }
}
