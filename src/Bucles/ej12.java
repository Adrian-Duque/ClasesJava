package Bucles;

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
//        tenemos los datos de las temperaturas, debe surgerir ropa para usar dependiendo de temperatura
//        si temp menor de 10 abrigo
//        si temp entre [10 y 15) sudadera
//        si temp [15 y 19] sudadera fina
//        si temp (20 y 26] camiseta corta
//        si temp mayor 26 bañador

//        int[] temp = {14,9,18,23,31,40,2};
        int[] temp = new int[7];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < temp.length; i++){
            System.out.print("Temperatura " + (i+1) +": ");
            temp[i] = input.nextInt();
        }

        for(int i = 0; i < temp.length; i++){
            switch(temp[i]/5){
                case 0,1:
                    System.out.println("Con " + temp[i] + "ºC ponte un abrigo.");
                    break;
                case 2:
                    System.out.println("Con " + temp[i] + "ºC ponte una sudadera gorda.");
                    break;
                case 3:
                    System.out.println("Con " + temp[i] + "ºC ponte una sudadera fina.");
                    break;
                case 4:
                    System.out.println("Con " + temp[i] + "ºC ponte una camiseta.");
                    break;
                default:
                    System.out.println("Con " + temp[i] + "ºC ponte un bañador.");
            }
        }

    }
}
