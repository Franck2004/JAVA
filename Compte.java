       public class Compte extends Banque
{
    
    public static int temp;

    Compte()
    {
        ++temp;
        this.compteId = temp ;
        this.solde = 0;
    }
    Compte(float solde)
    {
        this.compteId = temp ;
        temp++;
        this.solde = solde;
    }
    public int getTauxInteret() {
        return 0;
    }
    public void calculInteret()
    {    }
    public float depotPayant(float montant) {
        return 0;
    }
    public float retraitPayant(float montant)
    {   
        return 0;
     }
    
    // public static void main(String[] args)
    // {
    //     Compte c1 = new Compte();        
    //     Compte c2 = new Compte();
    //     Compte c3 = new Compte();
    //     System.out.println("c1 id: "+c1.compteId+"\nc2 id: "+c2.compteId+"\nc3 id: "+c3.compteId);


    // }
}