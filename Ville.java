import java.util.*;

public class Ville
{
    protected String nom;
    protected int nombreHabitant;
    
    public Ville(String nom, int nombreHabitant)
    throws nombreHabittantsException,NomVilleException
    {
        if(nombreHabitant < 0)
            throw new nombreHabittantsException(nombreHabitant);
        if(nom.length() < 3)
            throw new NomVilleException("Votre ville "+nom+" a moins de 3 caracteres.");
        else
        {
            this.nom = nom;
            this.nombreHabitant = nombreHabitant;
        }
    }
    public void afficheVille()
    {
        System.out.println("Ville:"+this.nom+"\n----------------------\nHabitants:"+this.nombreHabitant);
    }
//-----------------Main Function-----------------------------


}