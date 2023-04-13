package com.stock.pstock.service;

import com.stock.pstock.bean.Categorie;
import com.stock.pstock.dao.CategorieDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {
    @Autowired
    private CategorieDao categorieDao;

    public int save(Categorie categorie){

        if (findByCode(categorie.getCode()) != null) {
            return -1;
        }else{
            categorieDao.save(categorie);
            return 1;
        }
    }

    public Categorie findByCode(String code) {
        return categorieDao.findByCode(code);
    }

    @Transactional
    public int deleteByCode(String code) {
        return categorieDao.deleteByCode(code);
    }

    public List<Categorie> findAll() {
        return categorieDao.findAll();
    }
}
