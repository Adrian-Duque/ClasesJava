import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dame la carta: ");
        final int CARTA_USUARIO = input.nextInt();
        String palo = "";
        String numero = "";

        if (CARTA_USUARIO >=1 && CARTA_USUARIO <= 10) { //Oros
            palo = "oros";
            numero = String.valueOf(CARTA_USUARIO);
            numero = switch (numero) {
                case "1" ->
                        "as";
                case "8" ->
                        "sota";
                case "9" ->
                        "caballo";
                case "10" ->
                        "rey";
                default ->
                        numero;
            };
        } else if (CARTA_USUARIO >=11 && CARTA_USUARIO <= 20) { //Copas
            palo = "copas";
            numero = String.valueOf(CARTA_USUARIO-10);
            numero = switch (numero) {
                case "1" ->
                        "as";
                case "8" ->
                        "sota";
                case "9" ->
                        "caballo";
                case "10" ->
                        "rey";
                default ->
                        numero;
            };
        } else if (CARTA_USUARIO >=21 && CARTA_USUARIO <= 30) { //Espadas
            palo = "espadas";
            numero = String.valueOf(CARTA_USUARIO-20);
            numero = switch (numero) {
                case "1" ->
                        "as";
                case "8" ->
                        "sota";
                case "9" ->
                        "caballo";
                case "10" ->
                        "rey";
                default ->
                        numero;
            };
        } else if (CARTA_USUARIO >=31 && CARTA_USUARIO <= 40) { //Pepinos
            palo = "pepinos";
            numero = String.valueOf(CARTA_USUARIO-30);
            numero = switch (numero) {
                case "1" ->
                        "as";
                case "8" ->
                        "sota";
                case "9" ->
                        "caballo";
                case "10" ->
                        "rey";
                default ->
                        numero;
            };
        }

        if (palo != ""){
            System.out.print("El valor de tu carta es " + numero + " de " + palo);
        } else  {
            System.out.print("Introduce una carta entre 1 y 40 TONTO");
        }
    }
}
