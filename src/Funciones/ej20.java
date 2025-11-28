package Funciones;

public class ej20 {
    public static int sumar(int a, int b){
        return a+b;
    }
    public static int sumaArray(int[] array){
        int suma = 0;
        for(int i=0; i<array.length; i++){
            suma += array[i];
        }
        return suma;
    }
    public static void main(String[] args) {
        int[] numeros = {2,3,6,-5,67,45,-17};
        System.out.println("1. "+sumar(5,7));
        System.out.println("2. "+sumar(5, sumar(7,-5)));
        System.out.println("3. "+sumaArray(numeros));
    }
}
