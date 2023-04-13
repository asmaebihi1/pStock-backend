package com.stock.pstock.dao;

import com.stock.pstock.bean.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleDao extends JpaRepository<Article, Long> {
    Article findByCode(String code);
    int deleteByCode(String code);
}
