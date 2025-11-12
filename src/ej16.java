import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introcuce el numero: ");
        int num = input.nextInt();
        int resultado = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                resultado = resultado+i;
            }
        }
        if (resultado == num ) {
            System.out.println("El numero " + num + " es perfecto");
        } else  {
            System.out.println("El numero " + num + " no es perfecto");
        }
    }
}