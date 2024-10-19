public class Test 
{
    public static void main(String[] args) 
    {
        Ville v1 = null;
        try 
        {
            v1 = new Ville("D",-1500);
            v1.afficheVille();      
        } 
        catch(nombreHabittantsException  | NomVilleException e1) {
            System.out.println(e1.getMessage());
        }
    }

}
