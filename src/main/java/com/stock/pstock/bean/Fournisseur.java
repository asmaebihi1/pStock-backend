package com.stock.pstock.bean;

import jakarta.persistence.*;

import java.util.Date;

@Entity

public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String libelle;
    private String responsable;
    private String adresse;
    private String ville;
    private String tel;
    private String email;
    private String fax;
    private String login;
    private String pwd;
    private String  matfisc;
    private Date cree;

    public Date getCree() {
        return cree;
    }

    public void setCree(Date cree) {
        this.cree = cree;
    }

    private float   soldinit;
    private float   soldef;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMatfisc() {
        return matfisc;
    }

    public void setMatfisc(String matfisc) {
        this.matfisc = matfisc;
    }

    public float getSoldinit() {
        return soldinit;
    }

    public void setSoldinit(float soldinit) {
        this.soldinit = soldinit;
    }

    public float getSoldef() {
        return soldef;
    }

    public void setSoldef(float soldef) {
        this.soldef = soldef;
    }
}
