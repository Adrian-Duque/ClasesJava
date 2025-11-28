package Arrays;

import java.util.Scanner;

public class ej18 {
    public static void main(String[] args) {
        //verificar Arrays.matriz identidad

        final int FILAS = 3;
        final int COLUMNAS = 3;
        int numeros[][] = new int[FILAS][COLUMNAS];
        Scanner input = new Scanner(System.in);
        boolean identidad = true;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("Dime el valor para la posición [" + i + "." + j + "] ");
                numeros[i][j] = input.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (i == j) {
                    if (numeros[i][j] != 1) {
                        identidad = false;
                    }
                } else {
                    if (numeros[i][j] != 0) {
                        identidad = false;
                    }
                }
                if (!identidad) {
                    j = numeros[i].length - 1;
                    i = numeros.length - 1;
                }
            }
        }
        if (identidad) {
            System.out.println("La Arrays.matriz es identidad");
        } else {
            System.out.println("La Arrays.matriz no es identidad");
        }
    }
}
