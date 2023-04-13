package com.stock.pstock.service;

import com.stock.pstock.bean.Fournisseur;
import com.stock.pstock.dao.FournisseurDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseurService {
    @Autowired
    private FournisseurDao fournisseurDao;

    public int save(Fournisseur fournisseur){

        if (findByLibelle(fournisseur.getLibelle()) != null) {
            return -1;
        }else{
            fournisseurDao.save(fournisseur);
            return 1;
        }
    }

    public Fournisseur findByLibelle(String libelle) {
        return fournisseurDao.findByLibelle(libelle);
    }

    @Transactional
    public int deleteByLibelle(String libelle) {
        return fournisseurDao.deleteByLibelle(libelle);
    }

    public List<Fournisseur> findAll() {
        return fournisseurDao.findAll();
    }




}
