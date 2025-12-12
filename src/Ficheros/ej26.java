package Ficheros;

import java.io.File;
import java.util.Scanner;

public class ej26 {

    // Variables globales (constantes)
    static final String[] RESIDUOS = {"PLÁSTICO", "VIDRIO", "PAPEL", "ORGÁNICO"};

    // Función para leer el fichero
    public static void leerFichero(String nombreFichero, double kilos[]) {
        File fichero = new File(nombreFichero);
        Scanner s = null;

        try {
            s = new Scanner(fichero);

            while (s.hasNextLine()) {
                String linea = s.nextLine();

                String[] partes = linea.split(";");
                if (partes.length == 2) {
                    String tipoResiduo = partes[0].trim();
                    try {
                        double peso = Double.parseDouble(partes[1].trim());

                        // Buscamos la posición del residuo en el array constante
                        for (int i = 0; i < RESIDUOS.length; i++) {
                            if (RESIDUOS[i].equalsIgnoreCase(tipoResiduo)) {
                                kilos[i] += peso; // Sumamos el peso
                            }
                        }
                    } catch (
                            NumberFormatException e) {
                        System.out.println("Error al leer peso: " + partes[1]);
                    }
                }
            }
        } catch (
                Exception ex) {
            System.out.println("Mensaje de error: " + ex.getMessage());
        } finally {
            if (s != null)
                s.close();
        }
    }

    // Calcula la suma total
    public static double calcularTotalKilos(double[] kilos) {
        double total = 0;
        for (double k : kilos) {
            total += k;
        }
        return total;
    }

    // Busca el nombre del residuo con mayor peso
    public static String buscarMasReciclado(double[] kilos) {
        int indiceMax = 0;
        double maxPeso = kilos[0];

        for (int i = 1; i < kilos.length; i++) {
            if (kilos[i] > maxPeso) {
                maxPeso = kilos[i];
                indiceMax = i;
            }
        }
        return RESIDUOS[indiceMax];
    }

    // AHORA SOLO IMPRIME POR PANTALLA
    public static void guardarResumen(double[] kilos) {
        // 1. Imprimir desglose
        for (int i = 0; i < RESIDUOS.length; i++) {
            System.out.println(RESIDUOS[i] + ":" + (int) kilos[i]);
        }

        // 2. Imprimir Total
        double total = calcularTotalKilos(kilos);
        System.out.println("TOTAL:" + (int) total);

        // 3. Imprimir el más reciclado
        String masReciclado = buscarMasReciclado(kilos);

        // Buscamos el peso específico del ganador para mostrarlo
        double pesoMasReciclado = 0;
        for (int i = 0; i < RESIDUOS.length; i++) {
            if (RESIDUOS[i].equals(masReciclado)) {
                pesoMasReciclado = kilos[i];
            }
        }

        System.out.println("Tipo de residuo más reciclado: " + masReciclado + " (" + (int) pesoMasReciclado + " gramos)");
    }

    public static void main(String[] args) {
        double[] kilos = new double[4]; // Array acumulador: [0]=PLASTICO, [1]=VIDRIO...

        // 1. Leer fichero
        leerFichero("src/Ficheros/data/reciclaje.txt", kilos);

        // 2. Mostrar resumen por consola (ya no crea fichero)
        guardarResumen(kilos);
    }
}