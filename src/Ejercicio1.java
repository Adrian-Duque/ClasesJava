package Introduccion;
import java.util.Scanner;

//Este ejercicio pasa de grados celsius a grados farenheit

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double temperatura;
		double solucion;
		
		System.out.print("Dime la temperatura: ");
		temperatura = in.nextDouble();
		
		solucion = ((temperatura*9)/5)+32;
		System.out.print("Solución: "+solucion);

	}

}
