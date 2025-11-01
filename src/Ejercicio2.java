package Introduccion;
import java.util.Scanner;

// este ejercicio pasa de minutos a horas

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("Introduce los minutos que quieres convertir a horas: ");
		int minutos = in.nextInt();
		//usamos variables int para que no puedan guardar decimales
		int horas = minutos/60; //calculamos las horas 
		int minutosfin = minutos % 60; //calculamos el resto para saber los minutos sobrantes
		System.out.print(minutos + " minutos son " + horas + ":" + minutosfin);

	}

}
