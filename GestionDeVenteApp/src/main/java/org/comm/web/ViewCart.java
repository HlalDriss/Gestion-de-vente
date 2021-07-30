package org.comm.web;

import java.util.Map;

import org.comm.enties.Article;
import org.comm.enties.Cart;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ViewCart extends ActionSupport {
   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<Article, Integer> products;
    private float total;
    @Override
    public String execute() throws Exception {
        Cart cart = (Cart) ActionContext.getContext().getSession().get("cart");
        if (cart == null) {
            return ERROR;
        }
        products = cart.getArticles();
        total = cart.getTotalPrice();
        return SUCCESS;
    }

    public Map<Article, Integer> getProducts() {
        return products;
    }

    public float getTotal() {
        return total;
    }
    
    
    

}

