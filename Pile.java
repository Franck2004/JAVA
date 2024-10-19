import java.util.*;

public class Pile
{
    public static void main(String[] args)
    {
        Stack<String> pile = new Stack<>();

        if(pile.isEmpty()) 
            System.out.println("Pile Vide !") ;
        else 
            System.out.println("Pile Non Vide !");

        pile.push("NGUEPINSI");
        pile.push("TALLA");
        pile.push("FOTSO");
        pile.push("LUC");
        pile.push("ARMAND");

        System.out.println("Sommet pile: " + pile.peek());

        if(pile.isEmpty()) 
            System.out.println("Pile Vide !") ;
        else 
            System.out.println("Pile Non Vide !");


        for(String p : pile)
            System.out.println(p);

        pile.pop();

        System.out.println("Sommet pile: " + pile.peek());

        for(String p : pile)
            System.out.println(p);
            if(pile.isEmpty()) 
            System.out.println("Pile Vide !") ;
        else 
            System.out.println("Pile Non Vide !");


    }
}