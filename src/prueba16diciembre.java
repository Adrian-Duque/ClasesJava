import java.util.Scanner;

public class prueba16diciembre {
    public static Scanner in = new Scanner(System.in);
    public static void  main(String[] args){
        System.out.print("Introduce el numero de personas: ");
        int personas = in.nextInt();
        String[] nombres = new String[personas];
        String[] regalos = new String[personas];
        double[] precios = new double[personas];
        for (int i = 0; i < personas; i++) {
            pedirNombre(i,nombres);
            pedirRegalo(i,regalos,nombres);
            pedirPrecio(i,precios,regalos);
        }
        imprimirTodo(nombres, regalos, precios, personas);
        System.out.println("Feliz Navidad");
    }
    public static void pedirNombre(int i,String[] nombres){
        System.out.print("Introduce el nombre de la persona "+(i+1)+": ");
        nombres[i] = in.next();
    }
    public static void pedirRegalo(int i,String[] regalos,String[] nombres){
        System.out.print("Introduce el regalo para " + nombres[i] + ": ");
        regalos[i] = in.next();
    }
    public static void pedirPrecio(int i,double[] precios,String[] regalos){
        System.out.print("Introduce el precio del regalo " + regalos[i] + ": ");
        precios[i] = in.nextDouble(); //he cambiado nextInt por nextDouble ya que me equivoque
    }
    public static void imprimirTodo(String[] nombres, String[] regalos, double[] precios, int personas){
        System.out.println("Tu lista de regalos");
        for (int i = 0; i < personas; i++) {
            System.out.println((i+1)+"."+nombres[i]+" -> "+regalos[i]+" ("+precios[i]+"€)");
        }
        System.out.println("Resumen");
        double total = 0;
        for (int i = 0; i < precios.length; i++) {
            total += precios[i];
        }
        System.out.println("Presupuesto total: "+total);
        int max = 0;
        for (int i = 0; i < precios.length; i++) {
            if (precios[i] > precios[max]) {
                max = i;
            }
        }
        System.out.println("Regalo mas caro es: "+regalos[max]+" cuesta " + precios[max]);
        int min=0;
        for (int i = 0; i < precios.length; i++) {
            if (precios[i]<precios[min]) {
                min = i;
            }
        }
        System.out.println("Regalo mas barato es: "+regalos[min]+" cuesta " + precios[min]);
    }

}
