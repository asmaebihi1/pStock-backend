package com.stock.pstock.dao;

import com.stock.pstock.bean.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FournisseurDao extends JpaRepository<Fournisseur, Long> {
    Fournisseur findByLibelle(String libelle);
    int deleteByLibelle(String libelle);



}
