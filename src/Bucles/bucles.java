package Bucles;

public class bucles {
    public static void main(String[] args) {
        int n=1;

        // El primer elemento es la condición para que inicie la variable, el segundo nos indica la condición que se tiene que cumplir para que se ejecute el bucle y lo último es lo que se ejecuta al final del bucle.
        for (n=1;n<=10;n++) {
            System.out.println(n);
        }
        for (n=10;n>=0;n--) {
            System.out.println(n);
        }

        for (n=0;n<=100;n+=2) {
            System.out.println(n);
        }
    }
}
