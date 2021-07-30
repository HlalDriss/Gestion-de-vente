package org.comm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.comm.enties.Article;
import org.comm.enties.User;


public class UserDAOImp implements UserDAO{

	@PersistenceContext
	private EntityManager em;
	
	
	

	@Override
	public User getUser(int code) {
		
	  return em.find(User.class,code);
	}

	@Override
	public boolean isValidUser(String username) {
		Query req=em.createQuery("from User as u where u.username=? ");
		   req.setParameter(username, "username");
		  
		List users= req.getResultList();
		if(users.size()>0)
	       return true;
		else return false;
	}

	@Override
	public User save(User user) {
		  em.persist(user);
		  return user;
		
	}

}
