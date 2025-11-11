import java.util.Random;
import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        //piedra papel tijera
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        final int PC = rand.nextInt(2); //sacamos valor del pc entre 0 y 2
        int resultado = 0; // 0 perder 1 empate 2 ganar
        int US;
        do
        {
            System.out.println("\n*Piedra 0\n*Papel 1\n*Tijera 2\n Dime que eliges: ");
            US = input.nextInt();
        } while (US != 0 && US != 1 && US != 2);

        switch (PC) {
            case 0:
                if (US == 0) { // piedra piedra
                    resultado = 1;
                } else if (US == 1) { // piedra papel
                    resultado = 2;
                } else if (US == 2) { // piedra tijera
                    resultado = 0;
                }
                break;
            case 1:
                if (US == 0) { // papel piedra
                    resultado = 0;
                } else if (US == 1) { // papel papel
                    resultado = 1;
                } else if (US == 2) { // papel tijera
                    resultado = 2;
                }
                break;
            case 2:
                if (US == 0) { // tijera piedra
                    resultado = 2;
                } else if (US == 0) { // tijera papel
                    resultado = 2;
                } else if (US == 2) { // tijera tijera
                    resultado = 1;
                }
                break;
        }
        if (resultado == 0) {
            System.out.println("Has Perdido");
        } else if (resultado == 1) {
            System.out.println("Has Empatado");
        } else {
            System.out.println("Has Ganado");
        }
    }
}
