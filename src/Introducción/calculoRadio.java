package Introducción;

import java.util.Scanner;

public class calculoRadio {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double radio;
		double area;
		
		System.out.print("Dime el radio de la circunferencia: ");
		radio = in.nextDouble();
		area = Math.PI*Math.pow(radio, 2);
		area = Math.round(area*100)/100.0;
		System.out.print("El area de tu circunferencia es de: " + area);
	}
}
