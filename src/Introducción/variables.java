package Introducción;
import java.util.Scanner;

public class variables {

	public static void main(String[] args) {
		System.out.println("¡Hola!");
		System.out.println("¿Como te llamas?");
		
		/* Con la clase Scanner podemos leer datos desde teclado 
		 * El parámetro System.in le dice a Scanner que queremos los datos desde el teclado desde el teclado.
		 */
		Scanner in = new Scanner(System.in);
		
		//Creamos una variable String para guardar el nombre nextLine() es la función para leer un dato tipo String.
		String nombre = in.nextLine();
		
		System.out.println("Hola " + nombre);
		System.out.println("¿Cuantos años tienes?");
		
		int edad;
		edad = in.nextInt();
		System.out.println(edad + " años, que mayor!!");
		
	}
}

