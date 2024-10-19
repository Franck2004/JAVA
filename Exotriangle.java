import java.util.*;

public class Exotriangle 
{
    public static int n ;

    public static void main(String[] args)
    {
        
        Scanner clavier = new Scanner(System.in);
        System.out.print("Combien de lignes ? : ");
        n = clavier.nextInt();
        for(int i=0; i<=n ; i++)
        {
            //pour le triangle isocele
            // for(int j=0 ; j<n-i ; j++) System.out.print(" ");
            // for(int j=0; j<=2*i ; j++) System.out.print("*");
            
            // for(int j=0 ; j<n-i ; j++) System.out.print(" ");
            for(int j=0; j<=i ; j++) System.out.print("*");
            
            System.out.println();
        }

        clavier.close();
    }

}
