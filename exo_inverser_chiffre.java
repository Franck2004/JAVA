import java.util.*;
import java.lang.*;

public class exo_inverser_chiffre {
   
    public static void main(String[] args) {
        System.out.println("entrer un nombre ");
        Scanner scan= new Scanner(System.in);
        String s=new String();
        s=scan.nextLine();
        /*System.out.println("vous avez entrer un nombre de "+ s.length()+" chiffres");*/
        System.out.println("l'entier inversé est :");
        for(int i=(s.length() -1); i>=0; i--){
            System.out.print(s.charAt(i));
        }
        scan.close();
    }
    //les chaines de caracteres ont les memes propietes que les tableaux mais sauf qu'il y'a certaines differences notemment
    //pour indexer un caractere dasn une chaine , on utilise plutot:"nom_de_la_chaine.charAt(l'indice correspondant au caractere souhaité)"
    // voir l'exemple ci dessus
}

