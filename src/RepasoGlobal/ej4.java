package RepasoGlobal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Ejercicio 4 Repaso
 *
 */
public class ej4 {

    public static void main(String[] args) {
        String[][] datosFichero = leerFichero();
        System.out.println("Marca mas vendida: " + marcaMasVendida(datosFichero));
        System.out.println("Matricula mas grande: " + matriculaMayor(datosFichero));
        System.out.println("Media km: " + mediaKm(datosFichero));
    }

    public static String[][] leerFichero(){
        File fichero = new File("src/RepasoGlobal/data/coches.txt");
        int contadorLineas = 0;
        try {
            Scanner fsc = new Scanner(fichero);
            while(fsc.hasNextLine()){
                fsc.nextLine(); // Leemos la línea pero no la guardamos, solo pasamos
                contadorLineas++;
            }
            fsc.close(); // Cerramos el scanner para "rebobinar"
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null; // O devolver un array vacío
        }
        String[][] datosFichero = new String[contadorLineas][10];

        String linea = "";
        int i = 0;
        try{
            Scanner fsc = new Scanner(fichero);
            while(fsc.hasNextLine()){
                linea = fsc.nextLine();
                datosFichero[i] = linea.split(";");
                i ++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return datosFichero;
    }

    public static String marcaMasVendida(String[][] datosFichero){
        int contadorRenault = 0;
        int contadorCitroen = 0;
        for(int i = 0; i < datosFichero.length; i++){
            if(datosFichero[i][1].equals("Citroen")){
                contadorCitroen++;
            } else if(datosFichero[i][1].equals("Renault")){
                contadorRenault++;
            }
        }
        if(contadorRenault == contadorCitroen){
            return "Empate";
        } else if(contadorRenault > contadorCitroen){
            return "Renault";
        } else if(contadorRenault < contadorCitroen){
            return "Citroen";
        }
        return "";
    }

    public static String matriculaMayor(String[][] datosFichero){
        String mayor = datosFichero[0][2];
        for(int i = 1; i < datosFichero.length; i++){
            String matricula = datosFichero[i][2];
            if(Integer.parseInt(matricula.replaceAll("[^0-9]",""))>Integer.parseInt(mayor.replaceAll("[^0-9]",""))){
                mayor = matricula;
            }
        }
        return mayor;
    }

    public static float mediaKm(String[][] datosFichero){
        int sumaKm = 0;
        for(int i = 0; i < datosFichero.length; i++){
            sumaKm += Integer.parseInt(datosFichero[i][3].replace(".",""));
        }
        return sumaKm/datosFichero.length;
    }
}
