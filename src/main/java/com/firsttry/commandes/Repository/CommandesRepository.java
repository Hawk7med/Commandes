package com.firsttry.commandes.Repository;

import com.firsttry.commandes.Model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandesRepository extends JpaRepository<Commande, Long> {

}
