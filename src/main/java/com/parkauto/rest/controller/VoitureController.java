package com.parkauto.rest.controller;

import com.parkauto.rest.entity.Vehicule;
import com.parkauto.rest.entity.Voiture;
import com.parkauto.rest.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin("*")
public class VoitureController {
    @Autowired
    VoitureService voitureService;

    @PostMapping("/voitures")
    public Vehicule Voiture(@Validated @RequestBody(required = false) Voiture voiture) {
        return voitureService.saveVoiture(voiture);
    }

    @GetMapping("/voitures")
    public List<Voiture> getAllVoitures() {
        return voitureService.getAllVoitures();
    }

    @GetMapping("/voitures/{idVoiture}")
    public ResponseEntity<?> findVoitureById(@PathVariable(name = "idVoiture") Long idVoiture) {
        if(idVoiture == null) {
            return ResponseEntity.badRequest().body("Cannot find voiture with null id");
        }
        Voiture voiture = voitureService.getVoitureById(idVoiture);
        if(voiture == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(voiture);
    }

    @DeleteMapping("/voitures/{idVoiture}")
    public ResponseEntity<?> deleteVoitureById(@PathVariable(name = "idVoiture") Long idVoiture) {
        if(idVoiture == null) {
            return ResponseEntity.badRequest().body("Cannot delete voiture with null id");
        }
        Voiture voiture = voitureService.getVoitureById(idVoiture);
        if(voiture == null) {
            return ResponseEntity.notFound().build();
        }
        voitureService.deleteVoiture(voiture);
        return ResponseEntity.ok().body(voiture);
    }


    @PutMapping("/voitures/{idVoiture}")
    public ResponseEntity<Voiture> updateVoiture(@PathVariable(name = "idVoiture") Long idVoiture, @RequestBody Voiture voiture){
        if(voiture == null) {
            return ResponseEntity.notFound().build();
        }
        Voiture voitureMAJ = voitureService.updateVoiture(idVoiture, voiture);
        return ResponseEntity.ok().body(voitureMAJ);
    }

}
