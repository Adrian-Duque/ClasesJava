package RepasoGlobal;

/**
 * Función calculadora
 */
public class ej2 {
    public static void main(String[] args) {
        System.out.println(calcular(5, 6, "+"));
    }

    public static int calcular(int a, int b, String c) {
        switch (c) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return 0;
        }
    }
}
