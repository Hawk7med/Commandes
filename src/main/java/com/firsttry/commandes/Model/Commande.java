package com.firsttry.commandes.Model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;
    private String dateAchat;
    private double prixTotal;

    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;

    @OneToMany(mappedBy = "commande")
    private Set<CommandeProduit> commandeProduits = new HashSet<>(); // Correction du nom de la variable

    // Constructeurs
    public Commande() {
    }

    public Commande(String dateAchat, double prixTotal, Client client) {
        this.dateAchat = dateAchat;
        this.prixTotal = prixTotal;
        this.client = client;
    }

    // Getters and setters
    public Long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    public String getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(String dateAchat) {
        this.dateAchat = dateAchat;
    }

    public double getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(double prixTotal) {
        this.prixTotal = prixTotal;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<CommandeProduit> getCommandeProduits() { // Correction du nom de la méthode
        return commandeProduits;
    }

    public void setCommandeProduits(Set<CommandeProduit> commandeProduits) { // Correction du nom de la méthode
        this.commandeProduits = commandeProduits;
    }
}


