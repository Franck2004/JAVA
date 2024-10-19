public class CompteEpargne extends Compte
{
    private int TauxInteret = 6;

    public int getTauxInteret() {
        return TauxInteret;
    }
    public void calculInteret()
    {
        setSolde(((getSolde()*6)/100)+getSolde());
    }
    
}

