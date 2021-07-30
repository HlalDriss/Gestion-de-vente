package org.comm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.comm.enties.Article;



public class ArticleDAOJPAImp implements ArticleDAO{
   
	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public void addArticle(Article a) {
	   em.persist(a);
		
	}

	@Override
	public List<Article> listArticle() {
		Query req=em.createQuery("select a from Article a");
		return req.getResultList();
	}

	@Override
	public Article getArticle(Integer codeArt) {
		
		return em.find(Article.class,codeArt);
	}

	@Override
	public void deleteArticle(Integer codeArt) {
	Article a=getArticle(codeArt);
	em.remove(a);
		
	}

	@Override
	public void updateArticle(Article a) {
		em.merge(a);
	}

}
