import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        //pedir matriz e imprimir matriz
        final int FILAS = 3;
        final int COLUMNAS = 3;
        int numeros[][] = new int[FILAS][COLUMNAS];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("Dime el valor para la posición [" + i + "." + j + "] ");
                numeros[i][j] = input.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
