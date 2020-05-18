package com.example.atamoto.entity;

public class Produit {
    private int id;
    private String libelle;
    private String description;
    private Integer prixht;
    private Integer stock;

    public Produit(int id, String libelle, String description, Integer prixht, Integer stock) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        this.prixht = prixht;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrixht() {
        return prixht;
    }

    public void setPrixht(Integer prixht) {
        this.prixht = prixht;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
