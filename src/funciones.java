public class funciones {

    public static int suma(int a, int b) { //creamos una función llamada suma y le especificamos los valores.
        return a + b; //le especificamos el valor que va a devolver la variable.
    }

    public static int pow(int base, int exponente) {
        int potencia = 1;
        for (int i = 1; i <= exponente; i++) {
            potencia *= base;
        }
        return potencia;
    }

    public static void main(String[] args) {
        int c, p, a = 2, b = 5;
        c = suma(a, b); // Llamamos a la función suma y le pasamos los valores a y b
        System.out.println("Valor de a: " + a);
        System.out.println(c);
    }
}