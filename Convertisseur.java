// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

public class Convertisseur 
{
    public static float c_f , t ;
    public static String o_n ="O";

    public static void convertir(float c_f, float t)    
    {
        if(c_f == 1)
        {
            System.out.println(t+" C correspond a : "+ ((9*t/5)+32) + " F");
        }
        else
        {
            System.out.println(t+" F correspond a : "+ (5*(t-32)/9) + " C");
        }
    }
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        do
        {
            System.out.println("CONVERTISSEUR DEGRES ET FAHRENHEIT\n"+
                                "-------------------------------------\n"+
                                "Choisissez le mode de conversion : \n"+
                                "1 - Convertisseur Celsius - Fahrenheit\n"+
                                "2 - Convertisseur Fahrenheit - Celsius");
            c_f = scan.nextFloat();
            if(c_f == 1 || c_f == 2)
            {
                System.out.println("Entrez la temperature a convertir :");
                t = scan.nextFloat();
                convertir(c_f , t);
                System.out.println("Souhaitez-vous convertir une autre temperature ? (O/N)");
                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                String o_n = input.readLine();
                if(o_n.equalsIgnoreCase("N"))
                {
                    System.out.println("Au revoir !");
                }
                else if(!o_n.equalsIgnoreCase("O"))
                {
                    System.out.println("Entree Invalide !");
                }

            }
            else
            {
                System.out.println("Entree invalide !");
            }
           
        }
        while(o_n.equalsIgnoreCase("O"));

        scan.close();
    }
}
