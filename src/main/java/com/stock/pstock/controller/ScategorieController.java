package com.stock.pstock.controller;


import com.stock.pstock.bean.Scategorie;


import com.stock.pstock.service.ScategorieService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("/api/scategories")
public class ScategorieController {
    @Autowired
    private ScategorieService scategorieService;

    @PostMapping("/")
    public int save(@RequestBody Scategorie scategorie) {
        return scategorieService.save(scategorie);
    }
    @GetMapping("/code/{code}")
    public Scategorie findByCode(@PathVariable String code) {
        return scategorieService.findByCode(code);
    }
    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return scategorieService.deleteByCode(code);
    }
    @GetMapping("/")
    public List<Scategorie> findAll() {
        return scategorieService.findAll();
    }


}
