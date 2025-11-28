package Arrays;

public class array {
    public static void main(String[] args) {
        double[] notas = {8.6,5.1,10.0,9.8,7.5};
        System.out.print("Nota 2: " + notas[2]);
        double media, suma=0.0;

        for(int i=0; i<notas.length; i++){
            System.out.println(notas[i]);
            suma = suma + notas[i];
        }
        media = suma/notas.length;
        System.out.println("Media: " + media);
    }
}
