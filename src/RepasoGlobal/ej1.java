package RepasoGlobal;

/**
 * Codigo que genera matriz seudomagica
 * @author Adrian Duque
 * @version 1.0.0
 */
public class ej1 {
    public static void main(String[] args) {
        int[][] m = {{2,7,6},{9,5,1},{4,3,8}};
        int suma[] = new int[m.length];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                suma[i] += m[i][j];
            }
        }
    }
}
