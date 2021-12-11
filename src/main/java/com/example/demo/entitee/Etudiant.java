package com.example.demo.entitee;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.xml.crypto.Data;

@Entity
@Table

public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idE;

    @Column(length = 50)
    private String nom;

    @Column(length = 50)
    private String prenom;

    @Column(length = 50)
    private String nationnalite;

    @Column(length = 50)
    private String ville_origine;

    @Column(length = 50)
    private String filiere;

    @Column(length = 50)
    private String niveau;

    @Column(length = 50)
    private String residence;


    @Column(length = 50)
    private String tel;

    @Column(length = 50)
    private String Email;
    //Setters
    public void setIdU(int idE) {
        this.idE = idE;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNationnalite(String nationnalite) {
        this.nationnalite = nationnalite;
    }

    public void setVille_origine(String ville_origine) {
        this.ville_origine = ville_origine;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }


    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        Email = email;
    }
    //getters


    public int getIdE() {
        return idE;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNationnalite() {
        return nationnalite;
    }

    public String getVille_origine() {
        return ville_origine;
    }

    public String getFiliere() {
        return filiere;
    }

    public String getNiveau() {
        return niveau;
    }

    public String getResidence() {
        return residence;
    }


    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return Email;
    }
}
