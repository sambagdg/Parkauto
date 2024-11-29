package com.parkauto.rest.service;

import com.parkauto.rest.entity.Vehicule;
import com.parkauto.rest.repository.IVehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculeService {

    @Autowired
    IVehiculeRepository vehiculeRepository;

    public List<Vehicule> getAllVehicules() {
        return vehiculeRepository.findAll();
    }

    public Vehicule saveVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    public Vehicule getVehiculeById(Long idVehicule) {
        return vehiculeRepository.findById(idVehicule).orElseThrow(() -> new RuntimeException("Vehicule not found"));
    }

    public void  deleteVehicule(Vehicule vehicule) {
        vehiculeRepository.delete(vehicule);
    }
}
