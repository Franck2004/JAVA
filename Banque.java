import java.util.*;
public abstract class Banque {
    protected float solde = 0 , montant;
    protected int compteId;
   
    public float getSolde() 
    {
        return solde;
    }
    public int getCompteId() 
    {
        return compteId;
    }
    public float getMontant() 
    {
        return montant;
    }
    public void setSolde(float solde) 
    {
        this.solde = solde;
    }
    public float depot(float montant)
    {
        return this.solde += montant;
    }
    public float retrait(float montant)
    {
        return this.solde -= montant;
    }
    public void ToString()
    {
        System.out.println("Votre solde est : " + this.solde);
    }
    abstract int getTauxInteret();
    abstract void calculInteret();
    abstract float depotPayant(float montant);
    abstract float retraitPayant(float montant);
}
