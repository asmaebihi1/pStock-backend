package com.stock.pstock.controller;

import com.stock.pstock.bean.Article;

import com.stock.pstock.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.*;


@RestController
@RequestMapping("/api/articles")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @PostMapping("/")
    public int save(@RequestBody Article article) {
        return articleService.save(article);
    }
    @GetMapping("/code/{code}")
    public Article findByCode(@PathVariable String code) {
        return articleService.findByCode(code);
    }
    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return articleService.deleteByCode(code);
    }
    @GetMapping("/")
    public List<Article> findAll() {
        return articleService.findAll();
    }


}
