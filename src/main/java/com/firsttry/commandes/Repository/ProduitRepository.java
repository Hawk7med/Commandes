package com.firsttry.commandes.Repository;

import com.firsttry.commandes.Model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
