package com.firsttry.commandes.Model;

import jakarta.persistence.*;
@Entity
public class CommandeProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommandeProduit;
    private int quantite;

    @ManyToOne
    @JoinColumn(name = "idCommande")
    private Commande commande;

    @ManyToOne
    @JoinColumn(name = "idProduit")
    private Produit produit;

    // Constructeurs
    public CommandeProduit() {
    }

    public CommandeProduit(int quantite, Commande commande, Produit produit) {
        this.quantite = quantite;
        this.commande = commande;
        this.produit = produit;
    }

    // Getters and setters
    public Long getIdCommandeProduit() {
        return idCommandeProduit;
    }

    public void setIdCommandeProduit(Long idCommandeProduit) {
        this.idCommandeProduit = idCommandeProduit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
}
