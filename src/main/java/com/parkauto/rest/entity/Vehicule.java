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

    @Column(name = "IMAGEVEHICULE")
    private String imageVehicule;

    @Column(name = "DESCRIPTION")
    private String description;


    public Vehicule() {
    }

    public Vehicule(Long matricule, int anneeModel, double prix) {
        this.matricule = matricule;
        this.anneeModel = anneeModel;
        this.prix = prix;
    }

    public Vehicule(Long matricule, int anneeModel, double prix, String imageVehicule) {
        this.matricule = matricule;
        this.anneeModel = anneeModel;
        this.prix = prix;
        this.imageVehicule = imageVehicule;
    }

    public Vehicule(Long matricule, int anneeModel, double prix, String imageVehicule, String description) {
        this.matricule = matricule;
        this.anneeModel = anneeModel;
        this.prix = prix;
        this.imageVehicule = imageVehicule;
        this.description = description;
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

    public String getImageVehicule() {
        return imageVehicule;
    }

    public void setImageVehicule(String imageVehicule) {
        this.imageVehicule = imageVehicule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
