package com.parkauto.rest.controller;

import com.parkauto.rest.entity.Camion;
import com.parkauto.rest.service.CamionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin("*")
public class CamionController {
     @Autowired
     CamionService camionService;

    @PostMapping("/camions")
    public Camion Camion(@Validated @RequestBody(required = false) Camion camion) {
        return camionService.saveCamion(camion);
    }

    @GetMapping("/camions")
    public List<Camion> getAllCamions() {
        return camionService.getAllCamions();
    }

    @GetMapping("/camions/{idCamion}")
    public ResponseEntity<?> findCamionById(@PathVariable(name = "idCamion") Long idCamion) {
        if(idCamion == null) {
            return ResponseEntity.badRequest().body("Cannot find camion with null id");
        }
        Camion camion = camionService.getCamionById(idCamion);
        if(camion == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(camion);
    }

    @DeleteMapping("/camions/{idCamion}")
    public ResponseEntity<?> deleteCamionById(@PathVariable(name = "idCamion") Long idCamion) {
        if(idCamion == null) {
            return ResponseEntity.badRequest().body("Cannot delete camion with null id");
        }
        Camion camion = camionService.getCamionById(idCamion);
        if(camion == null) {
            return ResponseEntity.notFound().build();
        }
        camionService.deleteCamion(camion);
        return ResponseEntity.ok().body(camion);
    }
}
