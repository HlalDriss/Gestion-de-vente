package org.comm.dao;

import java.util.List;

import org.comm.enties.Commande;



public interface CommandeDAO {
    public void addCommande(Commande co);
    public List<Commande> listCommande();
    public Commande getCommande(Integer codeCom);
 

   
}
