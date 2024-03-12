package com.firsttry.commandes.Model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;
    private String name;
    private int quantiteStock;
    private double prixUnitaire;

    @OneToMany(mappedBy = "produit")
    private Set<CommandeProduit> commandeProduits = new HashSet<>();

    // Constructeurs
    public Produit() {
    }

    public Produit(String name, int quantiteStock, double prixUnitaire) {
        this.name = name;
        this.quantiteStock = quantiteStock;
        this.prixUnitaire = prixUnitaire;
    }

    // Getters and setters
    public Long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public Set<CommandeProduit> getCommandeProduits() {
        return commandeProduits;
    }

    public void setCommandeProduits(Set<CommandeProduit> commandeProduits) {
        this.commandeProduits = commandeProduits;
    }
}
