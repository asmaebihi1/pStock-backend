package com.stock.pstock.bean;

import jakarta.persistence.*;

@Entity


public class Scategorie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String code;
    private String ccateg;
    private String libelle;
    private String libcateg;
    private int rang;

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

    public String getCcateg() {
        return ccateg;
    }

    public void setCcateg(String ccateg) {
        this.ccateg = ccateg;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getLibcateg() {
        return libcateg;
    }

    public void setLibcateg(String libcateg) {
        this.libcateg = libcateg;
    }

    public int getRang() {
        return rang;
    }

    public void setRang(int rang) {
        this.rang = rang;
    }
}
