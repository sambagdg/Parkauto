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
    private int nbPortes;
    @Column(name = "POIDSTOTAL")
    private int poidsTotal;
    @Column(name = "MEDIA")
    private String media;

    public Voiture() {
        super();
    }


    public Voiture(String immatriculation, String puisanceFiscale, String categorie, int nbPortes,int poidsTotal, String media) {
        super();
        this.immatriculation = immatriculation;
        this.puisanceFiscale = puisanceFiscale;
        this.categorie = categorie;
        this.nbPortes = nbPortes;
        this.poidsTotal = poidsTotal;
        this.media = media;
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

    public String getMedia() {
        return media;
    }
    public void setMedia(String media) {
        this.media = media;
    }

    public int getNbPortes() {
        return nbPortes;
    }

    public void setNbPortes(int nbPortes) {
        this.nbPortes = nbPortes;
    }

    public int getPoidsTotal() {
        return poidsTotal;
    }

    public void setPoidsTotal(int poidsTotal) {
        this.poidsTotal = poidsTotal;
    }
}