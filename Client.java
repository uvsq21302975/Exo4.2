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
        
       if(inserveur.connecter(this)==false)
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
        return inmessage;
    }
}