package com.stock.pstock.controller;

import com.stock.pstock.bean.Categorie;
import com.stock.pstock.dao.CategorieDao;
import com.stock.pstock.exception.ResourceNotFoundException;
import com.stock.pstock.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("/api/categories")
public class CategorieController {
    @Autowired
    private CategorieService categorieService;

    @PostMapping("/")
    public int save(@RequestBody Categorie categorie) {
        return categorieService.save(categorie);
    }
    @GetMapping("/code/{code}")
    public Categorie findByCode(@PathVariable String code) {
        return categorieService.findByCode(code);
    }
    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return categorieService.deleteByCode(code);
    }
    @GetMapping("/")
    public List<Categorie> findAll() {
        return categorieService.findAll();
    }


}
