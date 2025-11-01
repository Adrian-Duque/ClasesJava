package Introduccion;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Calculadora\nEscribe para realizar las siguientes operaciones\nA para hacer una suma\nB para hacer una resta\nC para hacer una multiplicación\nD para hacer una división\nE para salir\nIntroduce la letra: ");
        char opcion = input.next().toUpperCase().charAt(0);
        System.out.print("Introduce el primer valor: ");
        double n1 = input.nextDouble();
        System.out.print("Introduce el segundo valor: ");
        double n2 = input.nextDouble();
        double answer;

        switch (opcion) {
            case 'A':
                System.out.print("La solución es " + (n1 + n2));
                break;
            case 'B':
                System.out.print("La solución es " + (n1 - n2));
                break;
            case 'C':
                System.out.print("La solución es " + (n1 * n2));
                break;
            case 'D':
                if (n1 == 0 || n2 == 0) {
                    System.out.println("Si tienes 0 amigo y 0 galletas, cuantas galletas le tocan a cada amigo?\nExacto, no tiene sentido, por que no tienes amigos y no tienes galletas");
                } else {
                    System.out.print("La solución es " + (n1 / n2));
                }
                break;
        }

    }
}