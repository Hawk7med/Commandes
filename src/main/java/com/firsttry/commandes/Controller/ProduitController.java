package com.firsttry.commandes.Controller;

import com.firsttry.commandes.Model.Produit;
import com.firsttry.commandes.Repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produits")
public class ProduitController {

    @Autowired
    private ProduitRepository produitRepository;

    // Endpoint pour récupérer tous les produits
    @GetMapping
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    // Endpoint pour récupérer un produit par son ID
    @GetMapping("/{id}")
    public ResponseEntity<Produit> getProduitById(@PathVariable Long id) {
        Optional<Produit> produitOptional = produitRepository.findById(id);
        return produitOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Endpoint pour créer un nouveau produit
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Produit createProduit(@RequestBody Produit produit) {
        return produitRepository.save(produit);
    }

    // Endpoint pour mettre à jour un produit existant
    @PutMapping("/{id}")
    public ResponseEntity<Produit> updateProduit(@PathVariable Long id, @RequestBody Produit produitDetails) {
        Optional<Produit> produitOptional = produitRepository.findById(id);
        if (produitOptional.isPresent()) {
            Produit existingProduit = produitOptional.get();
            existingProduit.setName(produitDetails.getName());
            existingProduit.setQuantiteStock(produitDetails.getQuantiteStock());
            existingProduit.setPrixUnitaire(produitDetails.getPrixUnitaire());
            return ResponseEntity.ok(produitRepository.save(existingProduit));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Endpoint pour supprimer un produit
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduit(@PathVariable Long id) {
        produitRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
