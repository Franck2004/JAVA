import java.util.Scanner;

public class triangle_de_zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la valeur de N : ");
        int N = scanner.nextInt();

        // Boucle pour chaque ligne
        for (int i = 0; i < N; i++) {
            // Boucle pour chaque colonne
            for (int j = 0; j < N; j++) {
                // Condition pour imprimer 1 ou 0
                if (j == i || j == N - 1 - i) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();  // Changement de ligne après chaque rangée
        }
        scanner.close();
    }
    
}
