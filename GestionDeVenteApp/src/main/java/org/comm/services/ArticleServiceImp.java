package org.comm.services;


import java.util.List;

import org.comm.dao.ArticleDAO;
import org.comm.enties.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class ArticleServiceImp  implements  ArticleService{
     
	@Autowired
    private ArticleDAO dao;

    public void setDao(ArticleDAO dao) {
        this.dao = dao;
    }

    @Override
    public void addArticle(Article a) {
      dao.addArticle(a);
    }

    @Override
    public List<Article> listArticle() {
        return dao.listArticle();
    }

    @Override
    public Article getArticle(Integer codeArt) {
        return dao.getArticle(codeArt);
    }

    @Override
    public void deleteArticle(Integer codeArt) {
         dao.deleteArticle(codeArt);
    }

    @Override
    public void updateArticle(Article a) {
       dao.updateArticle(a);
    }
}
