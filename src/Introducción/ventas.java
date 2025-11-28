package Introducción;
import java.util.Scanner;

public class ventas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double S1;
		double S2;
		double S3;
		double S4;
		double averedge;
		
		System.out.print("Week 1 Profit: ");
		S1 = in.nextDouble();
		
		System.out.print("Week 2 Profit: ");
		S2 = in.nextDouble();
		
		System.out.print("Week 3 Profit: ");
		S3 = in.nextDouble();
		
		System.out.print("Week 4 Profit: ");
		S4 = in.nextDouble();
		
		averedge = (S1+S2+S3+S4)/4;
		
		System.out.print("You everedge profit per week is: " + averedge);

	}

}
