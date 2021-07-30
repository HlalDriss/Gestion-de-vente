package org.comm.web;

import java.util.List;

import org.comm.enties.Article;
import org.comm.enties.Cart;
import org.comm.enties.Commande;
import org.comm.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class ArticleAction extends ActionSupport {
   
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private ArticleService service;
	public Integer code;
	public String nameArt;
	public double prix;
	public int qte;
	
	public Article article=new Article();
	public Commande commande=new Commande();
	public List<Article> articles;
	
	public List<Commande> commandes;
	//public List<Article> articles;
	
	
	
	public String index(){
	articles=service.listArticle();
		return SUCCESS;
	}
	


	public String commander() throws Exception {
        Cart cart = (Cart) ActionContext.getContext().getSession().get("cart");
        if (cart == null) {
            cart = new Cart();
        }
        Article p =service.getArticle(code);
        if (p.getCodeArt() == 0) {
            return ERROR;
        }
        cart.addArticle(p);
        ActionContext.getContext().getSession().put("cart", cart);      
        return SUCCESS;
    }
	
	
	
	
	
	
	
}
