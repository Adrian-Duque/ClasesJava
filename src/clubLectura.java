import java.io.*;
import java.util.Scanner;

public class clubLectura {
	
	final static int meses = 12;
	final static int columnas1 = 5;
	final static int columnas2 = 4;
	final static int MAX_LINEAS = 100;
	final static String ficheroLibros = "src/books.txt";
	final static String ficheroReviews = "src/reviews.txt";
	
	public static String[][] leerFichero(String nombreFichero, int nCampos){
		String[][] datos = new String[MAX_LINEAS][nCampos];
		String linea = null;
		String[] partes;
		int i = 0;
		File fichero = new File(nombreFichero);
		try {
			Scanner in = new Scanner(fichero);
			while(in.hasNextLine()) {
				linea = in.nextLine();
				System.out.println(linea);
				partes = linea.split(";");
				for(int j=0; j<nCampos; j++) {
					datos[i][j]=partes[j];
				}
				i++;
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return datos;
		
	}
	public static String[] consultarTitulo(String[][] matrizLibros, String mes){
		String[] libro = new String[4];
		for(int i = 0; i< matrizLibros.length; i++) {
				//System.out.println(matrizLibros[i][0]);
			if (matrizLibros[i][0] != null) {
				if(matrizLibros[i][0].equalsIgnoreCase(mes)) {
					libro = matrizLibros[i];
					return libro;
				}
			}
		}
		return libro;
	}

	
	public static void guardarReview(String fichero) {
		String titulo, socio, puntos, recomendado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Datos de la reseña: ");
		System.out.print("Titulo: ");
		titulo = teclado.nextLine();
		System.out.print("Socio: ");
		socio = teclado.nextLine();
		System.out.print("Puntuación (del 1 al 5): ");
		puntos = teclado.nextLine();
		System.out.print("¿Lo recomiendas? si/no: ");
		recomendado = teclado.nextLine();
		try (FileWriter fwriter = new FileWriter(fichero, true)) {
			String linea = titulo+";"+socio+";"+puntos + ";" + recomendado;
			fwriter.write(linea + "\n");
			System.out.println("Reseña guardada correctamente");
			fwriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/* FUNCIÓN A COMPLETAR POR EL ESTUDIANTE */
	public static String mesTop (String[][] matrizLibros, String[][] matrizReviews) {
		int mayorP = 0;
        for (int i = 0; i < matrizReviews.length; i++) {
            if (matrizReviews[i][0] != null) { //Añadimos este if ya que en el codigo se pueden guardar nulos, pero en mi hoja del examen los elimino antes los nulos.
                if (Double.parseDouble(matrizReviews[i][2])>Double.parseDouble(matrizReviews[mayorP][2])){ //Faltan unos paréntesis en la hoja del examen
                    mayorP = i;
                }
            }
        }
        String mes = "";
        for (int i = 0; i < matrizLibros.length; i++) {
            if (matrizReviews[mayorP][0].equals(matrizLibros[i][1])) {
                mes = matrizReviews[i][0];
            }
        }
        return mes;
	}

	public static void main(String[] args) {
		String[][] libros = new String[meses][columnas1];
		String[][] reviews = new String[MAX_LINEAS][columnas2];
		libros = leerFichero(ficheroLibros,columnas1);
		reviews= leerFichero(ficheroReviews,columnas2);
		Scanner teclado = new Scanner(System.in);
		int opcion=0;
		
		do {
			System.out.println("¡Hola querido socio/a! \n ¿Qué deseas hacer? : ");
			System.out.println("\t 1: Consultar el libro a leer en un mes concreto.");
			System.out.println("\t 2: Hacer una reseña.");
			System.out.println("\t 3: Buscar el mes cuyo libro tiene mejor valoración.");
			System.out.println("\t 4: Cualquier otro numero para salir");
			opcion = teclado.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("¿Qué mes deseas consultar?: ");
			String mes = teclado.next();
			String libro[] = consultarTitulo(libros, mes);
		
			System.out.println("En "+ mes + " toca "+ libro[1] + " de "+ libro[2]);
			break;
		case 2:
			teclado.nextLine();
			
			guardarReview(ficheroReviews);
			break;
		case 3: 
			String mesMejorValorado = mesTop(libros, reviews);
			System.out.println(mesMejorValorado);
			break;
			
		default: 
			System.out.println("Bye bye... ");
		}
		}while(opcion>=1 && opcion<=3);
	}

}
