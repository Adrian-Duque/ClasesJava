package Bucles;

import java.util.Scanner;

public class examenParcial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int HORAS_SEMANA = 40, HORA_ENTRADA = 9, MINUTO_ENTRADA = 0;
        int tMinutos = 0, tHoras = 0, minutos = 0, horas = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Día: " + i); //indicamos el dia
            System.out.print("Hora salida: "); //pedimos la hora de salida
            horas = input.nextInt();
            System.out.print("Minuto salida: "); //pedimos el minuto de salida
            minutos = input.nextInt();
            if ((minutos + tMinutos) >= 60) { //si la suma de los minutos supera una hora
                tMinutos = (tMinutos + minutos) - 60; //sumamos los minutos y restamos 60 minutos, 1h
                tHoras = tHoras + (horas - HORA_ENTRADA) + 1; //le sumamos la hora que le hemos quitado a los minutos
            } else { //si los minutos no superan 60
                tMinutos = tMinutos + minutos;
                tHoras = tHoras + (horas - HORA_ENTRADA);
            }
        }
        if (tHoras == HORAS_SEMANA) {
            System.out.println("Has trabajado lo adecuado.");
        } else if (tHoras > HORAS_SEMANA) { // sí trabaja más de lo requerido
            System.out.println("Has trabajado más de la cuenta: " + tHoras);
        } else if (tHoras < HORAS_SEMANA) { // sí trabaja menos de lo requerido
            System.out.println("Has trabajado menos de la cuenta: " + tHoras);
        }
    }
}