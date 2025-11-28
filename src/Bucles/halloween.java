package Bucles;

import java.util.Random;

public class halloween {
    public static void main(String[] args) {
        int zombies = 10;
        int dias = 0;
        // double random;
        Random rand = new Random();
        do {
            // random = rand.nextDouble();
            // zombies = (int) (zombies*random);
            zombies = zombies + rand.nextInt(zombies);
            // System.out.println(zombies + " " + dias);
            dias ++;
        } while (zombies<=1000);
        System.out.println("Ha tardado "+ dias + " días en llegar a " + zombies + " zombies.");
    }
}
