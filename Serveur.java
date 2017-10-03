import java.util.ArrayList;
import java.util.Iterator;

public class Serveur
{
    private ArrayList<Client> liste_clients;

    public Serveur()
    {
        liste_clients = new ArrayList<Client>();
    }

    public boolean connecter(Client client)
    {
        if(liste_clients.contains(client)) 
        {
            return false;
        }
        else 
        {
            return liste_clients.add(client);
        }
    }
    
    public void diffuser(String message)
    {
        Iterator<Client> l = liste_clients.iterator();
        
        while(l.hasNext()) {
            l.next().recevoir(message);
        }
    }
}