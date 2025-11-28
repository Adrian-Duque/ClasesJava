package Introducción;
import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =  new Scanner(System.in);

	    System.out.println("Dame los valores de la ecuación de segundo grado");
	    System.out.print("a: ");
	    double a = in.nextDouble();
	    System.out.print("b: ");
	    double b = in.nextDouble();
	    System.out.print("c: ");
	    double c = in.nextDouble();

	    double solucion1 = (-1*b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
	    System.out.println(a);
	    double solucion2 = (-1*b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
	    System.out.print("Solucion x=" + solucion1 + " x="+ solucion2);
	}

}
