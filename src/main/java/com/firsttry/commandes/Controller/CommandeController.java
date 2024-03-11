package com.firsttry.commandes.Controller;

import com.firsttry.commandes.Model.Commande;
import com.firsttry.commandes.Repository.CommandesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CommandeController {

    @Autowired
    private CommandesRepository Cr;
    @RequestMapping("/Commandes")
    public List<Commande> getAllCommandes(){
        return Cr.findAll();
    }
}
