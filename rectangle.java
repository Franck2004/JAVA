import java.util.*;
public class rectangle {
    public float longueur;
    public  float largeur;

    public rectangle(float x, float y){
        this.longueur=x;
        this.largeur=y;
    }

    public float perimetre(){
        return (this.longueur+this.largeur)*2 ;
    }

    public float surface(){
        return (longueur*largeur);
    }
    public static void main(String[] args) {
        System.out.println(".........classe de gestion de rectangle.........\n");
        System.out.println("calcul des parametres");
        System.out.println("entrez la longueur du rectangle \n");
        Scanner scan=new Scanner(System.in);
        float L=scan.nextFloat();
        System.out.println("entrez la largeur du rectangle \n");
        float l=scan.nextFloat();
        rectangle rect=new rectangle(L, l);
        System.out.println("le perimetre du rectangle sera " + rect.perimetre() + "\n");
        System.out.println("la surface du rectangle sera " + rect.surface() + "\n");


    }
}