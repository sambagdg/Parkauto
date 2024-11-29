package com.parkauto.rest.controller;

import com.parkauto.rest.entity.Vehicule;
import com.parkauto.rest.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin("*")
public class VehiculeController {
     @Autowired
     VehiculeService vehiculeService;

    @PostMapping("/vehicules")
    public Vehicule Vehicule(@Validated @RequestBody(required = false) Vehicule vehicule) {
        return vehiculeService.saveVehicule(vehicule);
    }
    @GetMapping("/vehicules")
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.getAllVehicules();
    }

    @GetMapping("/vehicules/{idVehicule}")
    public ResponseEntity<?> findVehiculeById(@PathVariable(name = "idVehicule") Long idVehicule) {
        if(idVehicule == null) {
            return ResponseEntity.badRequest().body("Cannot find vehicule with null id");
        }
        Vehicule vehicule = vehiculeService.getVehiculeById(idVehicule);
        if(vehicule == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(vehicule);
    }

    @DeleteMapping("/vehicules/{idVehicule}")
    public ResponseEntity<?> deleteVehiculeById(@PathVariable(name = "idVehicule") Long idVehicule) {
        if(idVehicule == null) {
            return ResponseEntity.badRequest().body("Cannot delete vehicule with null id");
        }
        Vehicule vehicule = vehiculeService.getVehiculeById(idVehicule);
        if(vehicule == null) {
            return ResponseEntity.notFound().build();
        }
        vehiculeService.deleteVehicule(vehicule);
        return ResponseEntity.ok().body(vehicule);
    }
}
