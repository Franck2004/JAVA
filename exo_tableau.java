import java.util.*;

public class exo_tableau {
    public static void main(String[] args) {
        System.out.println(".......Ranger tableau de taille 10 par ordre croissant.......\n");
        Scanner scan =new Scanner(System.in);
        //vraie syntaxe de declaration de tableau en java
        int[] tab= new int[10];
        for(int i=0; i<=9; i++){
            System.out.println("entrer l'element "+(i+1)+ " du tableau");
            tab[i]= scan.nextInt();
        }
        for(int i=0; i<=8; i++){
            int temp=tab[i];
            if (tab[i]>tab[i+1]) {
                tab[i]=tab[i+1];
                tab[i+1]=temp;
                i=-1;
            }
        }

        System.out.println("les elements de votre tableau dans l'ordre croissant sera :\n");
        for(int i=0 ; i<=9 ; i++){
            System.out.println(tab[i]);
        }
        scan.close();
    }
    
}