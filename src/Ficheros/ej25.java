package Ficheros;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class ej25 {
    public static void main(String[] args) {
        File fichero = new File("src/Ficheros/data/palabras.txt");
        String linea;
        try {
            Scanner sc = new Scanner(fichero);
            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}