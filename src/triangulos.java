package Introduccion;

import java.util.Scanner;

public class triangulos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dime el lado 1: ");
        int lado1 = input.nextInt();
        System.out.print("Dime el lado 2: ");
        int lado2 = input.nextInt();
        System.out.print("Dime el lado 3: ");
        int lado3 = input.nextInt();
        if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)) { //Si se cumple es un triangulo
            //Valoramos tipo de triangulo
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("El triangulo es equilatero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triangulo es isosceles");
            } else {
                System.out.println("El triangulo es escaleno");
            }
        } else {
            System.out.println("El triangulo no es valido");
        }
    }
}
