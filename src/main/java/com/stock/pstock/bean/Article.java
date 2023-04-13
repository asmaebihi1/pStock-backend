package com.stock.pstock.bean;

import jakarta.persistence.*;

@Entity

public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String code;
    private String code_b;
    private String libelle;
    private float pa;
    private float pv;
    private int tva;
    private int fodec;
    private int stock;
    private int stkinit;
    private String ccateg;
    private String cscateg;
    private String fileName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode_b() {
        return code_b;
    }

    public void setCode_b(String code_b) {
        this.code_b = code_b;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public float getPa() {
        return pa;
    }

    public void setPa(float pa) {
        this.pa = pa;
    }

    public float getPv() {
        return pv;
    }

    public void setPv(float pv) {
        this.pv = pv;
    }

    public int getTva() {
        return tva;
    }

    public void setTva(int tva) {
        this.tva = tva;
    }

    public int getFodec() {
        return fodec;
    }

    public void setFodec(int fodec) {
        this.fodec = fodec;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStkinit() {
        return stkinit;
    }

    public void setStkinit(int stkinit) {
        this.stkinit = stkinit;
    }

    public String getCcateg() {
        return ccateg;
    }

    public void setCcateg(String ccateg) {
        this.ccateg = ccateg;
    }

    public String getCscateg() {
        return cscateg;
    }

    public void setCscateg(String cscateg) {
        this.cscateg = cscateg;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
