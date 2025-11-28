package Introducción;

/*
 * Pedir la fecha (día, mes y año) y validar que está escrita correctamente.
 Mes: 1-12
 Día: 1-31 (dependiendo del mes suponiendo que febrero es 28, hay meses
 con 30 y otros con 31 días)
 */

import java.util.Scanner;

public class FechaValida {
    public static void main(String[] args) {
        int day, month, year;
        boolean validYear = false, validMonth = false, validDay = false;
        String error = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Día: ");
        day = input.nextInt();
        System.out.print("Mes: ");
        month = input.nextInt();
        System.out.print("Año: ");
        year = input.nextInt();
        input.close();
        if (year > 0) { //Validamos el año
            validYear = true;
        } else {
            error = "El año es Incorrecto";
        }
        if ((month >= 1) && (month <= 12)) { //Validar mes
            validMonth = true;
        } else if (error == "") {
            error = "El mes es Incorrecto";
        } else {
            error = error + " y El mes es Incorrecto";
        }
        if (validMonth && validYear) { //Validar dia
            int maxDays = 31;
            if (month == 2) { //Febrero
                maxDays = 28;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) { //Mes con 30 días
                maxDays = 30;
            } //Los demás tienen 31 días
            if (day >= 1 && day <= maxDays) {
                validDay = true;
            } else {
                error = "El día es incorrecto";
            }
        }
        boolean isValid = validYear && validMonth && validDay;
        if (isValid) {
            System.out.println("La Fecha " + day + "-" + month + "-" + year + " es valida");
        } else {
            System.out.println("La fecha no es valida");
            System.out.println(error);
        }
        if (day == 30 && month == 10 && year >= 2007) { //easter egg
            System.out.println("Acuérdate de felicitar a Adrian :)");
        }
    }
}