package com.parkauto.rest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "VOITURE")
public class Voiture extends Vehicule{
    @Column(name = "IMMATRICULATION")
    private String immatriculation;
    @Column(name = "PUISSANCEFISCALE")
    private String puisanceFiscale;
    @Column(name = "CATEGORIE")
    private String categorie;
    @Column(name = "NBPORTE")
    private String nbPortes;
    @Column(name = "POIDSTOTAL")
    private String poidsTotal;
    @Column(name = "MEDIA")
    private String media;

    public Voiture() {
        super();
    }

    public String getImmatriculation() {
        return immatriculation;
    }
    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }
    public String getPuisanceFiscale() {
        return puisanceFiscale;
    }
    public void setPuisanceFiscale(String puisanceFiscale) {
        this.puisanceFiscale = puisanceFiscale;
    }
    public String getCategorie() {
        return categorie;
    }
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    public String getNbPortes() {
        return nbPortes;
    }
    public void setNbPortes(String nbPortes) {
        this.nbPortes = nbPortes;
    }
    public String getPoidsTotal() {
        return poidsTotal;
    }
    public void setPoidsTotal(String poidsTotal) {
        this.poidsTotal = poidsTotal;
    }
    public String getMedia() {
        return media;
    }
    public void setMedia(String media) {
        this.media = media;
    }
}