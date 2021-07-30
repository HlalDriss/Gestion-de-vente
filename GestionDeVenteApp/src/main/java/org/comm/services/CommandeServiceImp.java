package org.comm.services;


import java.util.List;

import org.comm.dao.ArticleDAO;
import org.comm.dao.CommandeDAO;
import org.comm.enties.Article;
import org.comm.enties.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class CommandeServiceImp  implements  CommandeService{
     
	@Autowired
    private CommandeDAO dao1;

    public void setDao(CommandeDAO dao1) {
        this.dao1 = dao1;
    }

	@Override
	public void addCommande(Commande co) {
		dao1.addCommande(co);
		
	}

	@Override
	public List<Commande> listCommande() {
		return dao1.listCommande();
	}

	@Override
	public Commande getCommande(Integer codeCom) {
		
		return dao1.getCommande(codeCom);
	}

   
}
