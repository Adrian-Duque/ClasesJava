package Bucles;

public class ej13 {
    public static void main(String[] args) {
//        ejercicio batman

//         Velocidad inicial (50 km/h -> m/s)
        double velocidad = 50 / 3.6; // 13.8889 m/s
        double distancia = 0.0;
        int segundos = 0;

//        Bucle que reduce la velocidad un 20% cada segundo
        while (velocidad >= 0.5) {
            distancia += velocidad;  // Avanza durante ese segundo
            velocidad *= 0.8;         // Reduce un 20%
            segundos++;
        }

        System.out.println("El Batmóvil se detiene en " + segundos + " segundos.");
        System.out.printf("La cueva debe tener al menos %.2f metros de profundidad.%n", distancia);
    }
}
