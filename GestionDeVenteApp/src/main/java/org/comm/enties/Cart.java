package org.comm.enties;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Cart {

    private final Map<Article, Integer> cart = new HashMap<Article, Integer>();

    public Cart() {
    }

    public void addArticle(Article p) {
        Integer amount = cart.get(p);
        cart.put(p, amount==null?1:(amount + 1));
    }

    public Map<Article, Integer> getArticles() {
        return cart;
    }

    public float getTotalPrice() {
        float total = 0;

        Set<Article> keys = cart.keySet();
        for (Article article : keys) {
            total += article.getPrixArt() * cart.get(article);
        }
        
        return total;
    }
}
