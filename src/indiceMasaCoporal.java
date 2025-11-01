package Introduccion;

import java.util.Scanner;

public class indiceMasaCoporal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double peso;
		double altura;
		double IMC;
		
		System.out.print("Dime tu peso en KG: ");
		peso = in.nextDouble();
		System.out.print("Dime tu altura en M: ");
		altura = in.nextDouble();
		IMC = peso/Math.pow(altura, 2);
		IMC = Math.round(IMC*100)/100.0;
		System.out.print("Tu IMC es de: " + IMC);

	}

}
