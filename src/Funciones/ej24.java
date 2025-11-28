package Funciones;

import java.util.Scanner;

public class ej24 {
    public static String numeroEnPalabras(int n) { //devolvemos el numero en palabra

        // palabras base
        String[] unidades = {
                "cero", "uno", "dos", "tres", "cuatro",
                "cinco", "seis", "siete", "ocho", "nueve"
        };

        String[] especiales = {
                "", "", "diez", "once", "doce", "trece",
                "catorce", "quince", "dieciseis", "diecisiete",
                "dieciocho", "diecinueve"
        };

        String[] decenas = {
                "", "", "veinte", "treinta", "cuarenta",
                "cincuenta", "sesenta", "setenta", "ochenta",
                "noventa"
        };

        // Casos directos
        if (n < 10) {
            return unidades[n];
        }

        if (n < 20) {
            return especiales[n - 8]; // mapeo 10–19
        }

        if (n == 20) {
            return "veinte";
        }

        if (n == 100) {
            return "cien";
        }

        // Para 21–99
        int d = n / 10;  // decena
        int u = n % 10;  // unidad

        if (u == 0) {
            return decenas[d];
        }

        return decenas[d] + " y " + unidades[u];
    }

    public static void main(String[] args) { //contar las letras de un numero
        Scanner sc = new Scanner(System.in);
        System.out.print("Dígame un numero: ");
        int n = sc.nextInt();
        System.out.println("Total de letras: " + numeroEnPalabras(n).length());
    }
}
