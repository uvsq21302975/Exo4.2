import java.util.ArrayList;
import java.util.Iterator;

public class Serveur
{
    private ArrayList<Client> liste_clients; // liste de clients connéctes au serveur

    public Serveur()
    {
        liste_clients = new ArrayList<Client>();
    }

    public boolean connecter(Client client)
    {
        if(liste_clients.contains(client)) // si client deja connecté pas d'ajout
        {
            return false;
        }
        else 
        {
            return liste_clients.add(client); // ajouter au serveur return true
        }
    }
    
    public void diffuser(String message)
    {
        Iterator<Client> l = liste_clients.iterator(); //parcours liste
        
        while(l.hasNext()) { // verifier suivant existe => liste pas encore vide
            l.next().recevoir(message); // recevoir message
        }
    }
    
    public static void main(String [] args)
	{
		//creer serveur et client: seconnecter et envoyermessage
		Serveur serveur = new Serveur();
		Client client = new Client("zak");
		client.seConnecter(serveur);
		client.envoyer("hola");
	}
    
    
    
}