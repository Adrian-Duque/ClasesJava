package Funciones;

import java.util.Scanner;

public class ej19 {
    public static void imprimeMatriz(int[][]M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.println(M[i][j]);
            }
        }
    }

    public static int[][] pideMatriz() {
        Scanner input = new Scanner(System.in);
        int[][] M = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("M [" + i + "][" + j + "]: ");
                M[i][j] = input.nextInt();
            }
        }
        return M;
    }
    public static void main(String[] args) {
        imprimeMatriz(pideMatriz());
    }
}
