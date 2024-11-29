package com.parkauto.rest.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "LIGNECMD")
public class LigneCmd {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDLIGNECMD")
    private Long id;
    @Column(name = "QTE")
    private String qte;
    @Column(name = "LIBELLE")
    private String libelle;
    @Column(name = "PRIX")
    private String prix;

    @ManyToOne
    @JoinColumn(name = "command_id")
    private Commande commande;


    public LigneCmd() {
        super();
    }

    public LigneCmd(Long id, String qte, String libelle, String prix, Commande commande) {
        this.id = id;
        this.qte = qte;
        this.libelle = libelle;
        this.prix = prix;
        this.commande = commande;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQte() {
        return qte;
    }

    public void setQte(String qte) {
        this.qte = qte;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}
