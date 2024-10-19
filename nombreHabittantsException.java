public class nombreHabittantsException extends Exception
{
    public nombreHabittantsException()
    {
        System.out.println("Vous essayer d'instancier une ville avec un nombre negatif d'habitants.");
    }
    public nombreHabittantsException(int nbre)
    {
            System.out.println("Vous essayer d'instancier une ville avec un nombre negatif d'habitants.");
            System.out.println("\t =>" +nbre);
    }
    
}
