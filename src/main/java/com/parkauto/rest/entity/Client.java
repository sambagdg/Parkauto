package com.parkauto.rest.entity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "client")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDCLIENT")
    private int id;
    @Column(name = "NOM")
    private String nom;
    @Column(name = "PRENOM")
    private String prenom;
    @Column(name = "ADRESSE")
    private String adresse;
    @Column(name = "CP")
    private String cp;
    @Column(name = "VILLE")
    private String ville;
    @Column(name = "PAYS")
    private String pays;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "vehicule_id")
    private Vehicule vehicule;

    @OneToMany(mappedBy = "client")
    private List<Commande>commandeList;


    @ManyToMany(mappedBy = "clientList")
    private List<Location> locationList;

    public Client() {
        super();
    }

    public Client(int id, String nom, String prenom, String adresse, String cp, String ville, String pays, Vehicule vehicule) {
        super();
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.pays = pays;
        this.vehicule = vehicule;
    }

    public Client(int id, String nom, String prenom, String adresse, String cp, String ville, String pays, Vehicule vehicule, List<Commande> commandeList) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.pays = pays;
        this.vehicule = vehicule;
        this.commandeList = commandeList;
    }

    public Client(int id, String nom, String prenom, String adresse, String cp, String ville, String pays, Vehicule vehicule, List<Commande> commandeList, List<Location> locationList) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.pays = pays;
        this.vehicule = vehicule;
        this.commandeList = commandeList;
        this.locationList = locationList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public List<Commande> getCommandeList() {
        return commandeList;
    }

    public void setCommandeList(List<Commande> commandeList) {
        this.commandeList = commandeList;
    }

    public List<Location> getLocationList() {
        return locationList;
    }

    public void setLocationList(List<Location> locationList) {
        this.locationList = locationList;
    }
}
