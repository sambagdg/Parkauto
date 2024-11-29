package com.parkauto.rest.service;

import com.parkauto.rest.entity.Camion;
import com.parkauto.rest.repository.ICamionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CamionService {
    @Autowired
    ICamionRepository camionRepository;

    public List<Camion> getAllCamions() {
        return camionRepository.findAll();
    }

    public Camion saveCamion(Camion camion) {
        return camionRepository.save(camion);
    }

    public Camion getCamionById(Long idCamion) {
        return camionRepository.findById(idCamion).orElseThrow(() -> new RuntimeException("Camion not found"));
    }

    public void  deleteCamion(Camion camion) {
        camionRepository.delete(camion);
    }
}
