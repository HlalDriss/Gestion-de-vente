package org.comm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import org.comm.enties.Commande;



public class CommandeDAOJPAImp implements CommandeDAO{
   
	@PersistenceContext
	private EntityManager em;

	@Override
	public void addCommande(Commande co) {
		em.persist(co);
		
	}

	@Override
	public List<Commande> listCommande() {
		Query req=em.createQuery("select co from Commande co");
		return req.getResultList();
	}

	@Override
	public Commande getCommande(Integer codeCom) {
		return em.find(Commande.class,codeCom);
	}
	
	
	

	

}
