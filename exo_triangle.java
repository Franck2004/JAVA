import java.util.*;
public class exo_triangle {
    public static void main(String[] args) {
        System.out.println("entre un entier : ");
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        System.out.println("voila le triangle correspondant : \n");
        for(int i =1;i<=n ;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println("\n");
        }
        scan.close();
    }
    
}
