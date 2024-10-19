import java.util.*;
public class carre extends rectangle{
    public carre(float cote){
        super(cote , cote);
    }
    public static void main(String[] args){
        System.out.println(".......gestion du carré.......\n");
        System.err.println("entrer le coté du carré \n");
        Scanner scan=new Scanner(System.in);
        float co =scan.nextFloat();
        carre c=new carre(co);
        System.out.println("le perimetre du carré est :"+ c.perimetre()+ " ! \n");
        System.out.println("la surface du carré est :"+ c.surface()+ "! \n");        

    }


    
    /* ceci etait un classe pour tester les notiobns d'heritage en java ! et donc cette classe herite de la classe rectangle 
    et donc elle herite de toutes les variables , les methiodes et les objets mais elle n'herite pas du constructeur
    de la classe maitresse , d'ou la necessite de creer un constructeur specificique a la sous classe et d'utiliser le mot clé super 
    afin que la sous classe puisse heriter du constructeur de la classe maitresse et donc ensuite de pouvoir faire l'instanciation et 
    d'utiliser tous kles contenu de la classe maitresse comme cela nous chante  
     */

}