package com.parkauto.rest.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "VEHICULE")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicule implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDVEHICULE")
    private Long matricule;

    @Column(name = "ANNEEMODEL")
    private int anneeModel;

    @Column(name = "PRIX")
    private double prix;

    public Vehicule() {
    }

    public Vehicule(Long matricule, int anneeModel, double prix) {
        this.matricule = matricule;
        this.anneeModel = anneeModel;
        this.prix = prix;
    }

    public Long getMatricule() {
        return matricule;
    }

    public void setMatricule(Long matricule) {
        this.matricule = matricule;
    }

    public int getAnneeModel() {
        return anneeModel;
    }

    public void setAnneeModel(int anneeModel) {
        this.anneeModel = anneeModel;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "matricule=" + matricule +
                ", anneeModel=" + anneeModel +
                ", prix=" + prix +
                '}';
    }

    public String demarrer(){
        return "Broouummm!";
    }

    public String accelerer(){
        return "Vrouummmm!!!";
    }

}
