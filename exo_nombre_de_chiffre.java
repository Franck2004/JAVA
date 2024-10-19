import java.util.*;
import java.lang.*;
public class exo_nombre_de_chiffre {
    public static void main(String[] args) {
        System.out.println("entrer un nombre ");
        Scanner scan= new Scanner(System.in);
        String s=new String();
        s=scan.nextLine();
        System.out.println("vous avez entrer un nombre de "+ s.length()+" chiffres");
        scan.close();
    }
    
}
