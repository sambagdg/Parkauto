package com.parkauto.rest.service;

import com.parkauto.rest.entity.Commande;
import com.parkauto.rest.repository.ICommandeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService {

    ICommandeRepository commandeRepository;

    public List<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }

    public Commande saveCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    public Commande getCommandeById(Long idCommande) {
        return commandeRepository.findById(idCommande).orElseThrow(() -> new RuntimeException("Commande not found"));
    }

    public void  deleteCommande(Commande commande) {
        commandeRepository.delete(commande);
    }
}
