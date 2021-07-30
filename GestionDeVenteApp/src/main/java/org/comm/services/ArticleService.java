package org.comm.services;



import java.util.List;

import org.comm.enties.Article;

public interface ArticleService {


    public void addArticle(Article a);
    public List<Article> listArticle();
    public Article getArticle(Integer codeArt);
    public void deleteArticle(Integer codeArt );
    public void updateArticle(Article a);
}
