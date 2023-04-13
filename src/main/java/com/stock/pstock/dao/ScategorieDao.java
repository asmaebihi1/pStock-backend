package com.stock.pstock.dao;

import com.stock.pstock.bean.Scategorie;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;



@Repository
public interface ScategorieDao extends JpaRepository<Scategorie, Long> {
      Scategorie findByCode(String code);
      int deleteByCode(String code);
}
