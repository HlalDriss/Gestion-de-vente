package org.comm.services;



import java.util.List;

import org.comm.enties.Commande;

public interface CommandeService {


	  public void addCommande(Commande co);
	    public List<Commande> listCommande();
	    public Commande getCommande(Integer codeCom);
}
