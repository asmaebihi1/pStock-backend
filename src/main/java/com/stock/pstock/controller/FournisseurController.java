package com.stock.pstock.controller;

import com.stock.pstock.bean.Fournisseur;

import com.stock.pstock.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("/api/four")
public class FournisseurController {
    @Autowired
    private FournisseurService fournisseurService;

    @PostMapping("/")
    public int save(@RequestBody Fournisseur fournisseur) {
        return fournisseurService.save(fournisseur);
    }
    @GetMapping("/libelle/{libelle}")
    public Fournisseur findByLibelle(@PathVariable String libelle) {
        return fournisseurService.findByLibelle(libelle);
    }
    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle) {
        return fournisseurService.deleteByLibelle(libelle);
    }
    @GetMapping("/")
    public List<Fournisseur> findAll() {
        return fournisseurService.findAll();
    }


}
