import java.util.ArrayList;



public class Groupe {
	boolean is_smocker;
	int nbr_client;
	ArrayList<Client> clients;
	public Groupe(boolean is_smocker,int nbr_client,ArrayList<Client> clients) {
		this.is_smocker=is_smocker;
		this.nbr_client=nbr_client;
		this.clients=clients;
	}
    
}

