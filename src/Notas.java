package Introduccion;
import java.util.Scanner;

public class Notas {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // verificar cuenta mayor o igual a 10k seguidores
            System.out.print("Tell me your instagram username: ");
            String username = in.nextLine();
            System.out.print("Tell me your follower count: ");
            int followers = in.nextInt();
            if(followers >= 10000){
                System.out.println("Enhorabiena @"+username+" tienes "+followers+" seguidores por lo que estas verificado.");
            } else if(followers>=1000){
                followers = 10000-followers;
                System.out.println("Eres un micro influencer, te faltan "+followers+" seguidores para ser un influencer");
            } else {
                System.out.println("Sigue esforzandote");
            }
        }
}
