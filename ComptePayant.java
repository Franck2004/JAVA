public class ComptePayant extends Compte
{
    public float depotPayant(float montant)
    {
        return depot(montant-5);
    }
    public float retraitPayant(float montant)
    {
        return retrait(montant-5);
    }

}
