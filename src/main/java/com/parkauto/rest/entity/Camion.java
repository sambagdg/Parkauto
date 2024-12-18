package com.parkauto.rest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CAMION")
public class Camion extends Vehicule{

    @Override
    public String demarrer(){
        return "BRRRRR !";
    }

    @Override
    public String accelerer(){
        return "BROUMMM";
    }

    public Camion() {
    }


    public Camion(Long matricule, int anneeModel, double prix) {
        super(matricule, anneeModel, prix);
    }
}