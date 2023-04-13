package com.stock.pstock.service;

import com.stock.pstock.bean.Scategorie;
import com.stock.pstock.dao.ScategorieDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScategorieService {
    @Autowired
    private ScategorieDao scategorieDao;

    public int save(Scategorie scategorie){

        if (findByCode(scategorie.getCode()) != null) {
            return -1;
        }else{
            scategorieDao.save(scategorie);
            return 1;
        }
    }

    public Scategorie findByCode(String code) {
        return scategorieDao.findByCode(code);
    }

    @Transactional
    public int deleteByCode(String code) {
        return scategorieDao.deleteByCode(code);
    }

    public List<Scategorie> findAll() {
        return scategorieDao.findAll();
    }
}
