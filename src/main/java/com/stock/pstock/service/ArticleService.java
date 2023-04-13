package com.stock.pstock.service;

import com.stock.pstock.bean.Article;
import com.stock.pstock.dao.ArticleDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleDao articleDao;

    public int save(Article article){
        if (findByCode(article.getCode()) != null) {
            return -1;
        }else{
            articleDao.save(article);
            return 1;
        }

    }

    public Article findByCode(String code) {
        return articleDao.findByCode(code);
    }

    @Transactional
    public int deleteByCode(String code) {
        return articleDao.deleteByCode(code);
    }

    public List<Article> findAll() {
        return articleDao.findAll();
    }


}
