package com.firsttry.commandes.Model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "commandes")

public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomClient;
    private String produit;
    private int quantite;

    // Constructeurs
    public Commande() {
    }

    public Commande(String nomClient, String produit, int quantite) {
        this.nomClient = nomClient;
        this.produit = produit;
        this.quantite = quantite;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", nomClient='" + nomClient + '\'' +
                ", produit='" + produit + '\'' +
                ", quantite=" + quantite +
                '}';
    }
}