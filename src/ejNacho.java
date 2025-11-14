import java.util.Random;

public class ejNacho {
    public static void main(String[] args) {
        int subir = 0, bajar = 0, quieto = 0, turnos = 0, planta = 1;
        int aleatorio;
        Random rand = new Random();
        do {
            aleatorio = rand.nextInt(5) + 1;
            switch (aleatorio) {
                case 1,
                     2: //sube
                    planta++;
                    subir++;
                    break;
                case 3,
                     4: //baja
                    if (planta > 1) {
                        planta--;
                        bajar++;
                    } else {
                        quieto++;
                    }
                    break;
                case 5,
                     6: //quieto
                    quieto++;
                    break;
            }
            turnos++;
        } while (planta < 10 && turnos < 30);
        System.out.println("Turnos:  " + turnos + "\nPlanta: " + planta + "\nSubir: " + subir + "\nBajar: " + bajar + "\nQuieto: " + quieto);
    }
}