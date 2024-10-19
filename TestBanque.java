import java.util.*;
public class TestBanque {
    
    public static void main(String[] args)
    {
        Banque compte1 = new Compte();

        System.out.println("\n----------------------------------------------\nCompte 1 \n   ID : "+compte1.getCompteId());
        compte1.depot(5000);
        compte1.ToString();
        compte1.retrait(2500);
        compte1.ToString();
        
        Banque compteEpargne1 = new CompteEpargne();

        System.out.println("----------------------------------------------\nCompte Epargne1 \n   ID : "+compteEpargne1.getCompteId());
        compteEpargne1.depot(5000);
        compteEpargne1.calculInteret();
        compteEpargne1.ToString();
        compteEpargne1.retrait(2500);
        compteEpargne1.calculInteret();
        compteEpargne1.ToString();
        
        Banque comptePayant1 = new ComptePayant();

        System.out.println("----------------------------------------------\nCompte Payant1 \n   ID : "+comptePayant1.getCompteId());
        comptePayant1.depotPayant(5000);
        comptePayant1.ToString();
        comptePayant1.retraitPayant(2500);
        comptePayant1.ToString();
        
        System.out.println("----------------------------------------------\n");
    }

}
