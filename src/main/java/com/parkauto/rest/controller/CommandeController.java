package com.parkauto.rest.controller;

import com.parkauto.rest.entity.Commande;
import com.parkauto.rest.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin("*")
public class CommandeController {
    @Autowired
    CommandeService commandeService;

    @PostMapping("/commandes")
    public Commande Commande(@Validated @RequestBody(required = false) Commande commande) {
        return commandeService.saveCommande(commande);
    }

    @GetMapping("/commandes")
    public List<Commande> getAllCommandes() {
        return commandeService.getAllCommandes();
    }

    @GetMapping("/commandes/{idCommande}")
    public ResponseEntity<?> findCommandeById(@PathVariable(name = "idCommande") Long idCommande) {
        if(idCommande == null) {
            return ResponseEntity.badRequest().body("Cannot find commande with null id");
        }
        Commande commande = commandeService.getCommandeById(idCommande);
        if(commande == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(commande);
    }

    @DeleteMapping("/commandes/{idCommande}")
    public ResponseEntity<?> deleteCommandeById(@PathVariable(name = "idCommande") Long idCommande) {
        if(idCommande == null) {
            return ResponseEntity.badRequest().body("Cannot delete commande with null id");
        }
        Commande commande = commandeService.getCommandeById(idCommande);
        if(commande == null) {
            return ResponseEntity.notFound().build();
        }
        commandeService.deleteCommande(commande);
        return ResponseEntity.ok().body(commande);
    }
}
