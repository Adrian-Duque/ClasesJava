package Introducción;//package Introduccion;
import java.util.Scanner;
public class switchEj {
    public static void main(String[] args) {
        System.out.print("Pulse 1 para Ofertas en Llamadas\nPulse 2 para Ofertas en Fibra Óptica\nPulse 3 para Ofertas en TV\nPulse 4 para Reclamaciones\nPulse cualquier otra tecla para hablar con un operador\n\nPulse una Tecla: ");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        switch (option) {
            case 1,2:
                System.out.println("Ofertas en llamadas");
                break;
            case 5:
                System.out.println("Ofertas en Fibra Óptica");
                break;
            case 3:
                System.out.println("Ofertas en TV");
                break;
            case 4:
                System.out.println("Reclamaciones en TV");
                break;
            default:
                System.out.println("Operador");
        }
    }
}