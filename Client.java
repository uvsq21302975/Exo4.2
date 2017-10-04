public class Client
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom;
    private Serveur inserveur;
    
    /**
     */
    public Client(String nom)
    {
        this.nom = nom;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     */
    public boolean seConnecter(Serveur inserveur)
    {
        
       if(inserveur.connecter(this)==false) // ".connecter" retourne vrai ou faux
            return false;
        else 
        {
            this.inserveur = inserveur;
            return true;
        }
    }
    

    
    public void envoyer(String inmessage)
    {
        inserveur.diffuser(inmessage);
    }

    public String recevoir(String inmessage)
    {
        System.out.println("message recu");
        return inmessage;
        
    }
}