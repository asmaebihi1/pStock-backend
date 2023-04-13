package com.stock.pstock.dao;

import com.stock.pstock.bean.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieDao extends JpaRepository<Categorie, Long> {

    Categorie findByCode(String code);
    int deleteByCode(String code);
}
