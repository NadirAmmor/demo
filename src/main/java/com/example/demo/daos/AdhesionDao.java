package com.example.demo.daos;

import java.io.Serializable;
import java.util.Date;

public class AdhesionDao implements Serializable {

    EtudiantClubKeyDao id;

    EtudiantDao etudiantDao;

    ClubDao clubDao;


    private String statut;

    private Date dateAdhesion;

    //getters

    public EtudiantClubKeyDao getId() {
        return id;
    }

    public void setId(EtudiantClubKeyDao id) {
        this.id = id;
    }

    public EtudiantDao getEtudiant() {
        return etudiantDao;
    }

    public void setEtudiant(EtudiantDao etudiantDao) {
        this.etudiantDao = etudiantDao;
    }

    public ClubDao getClub() {
        return clubDao;
    }

    public void setClub(ClubDao clubDao) {
        this.clubDao = clubDao;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Date getDateAdhesion() {
        return dateAdhesion;
    }

    public void setDateAdhesion(Date dateAdhesion) {
        this.dateAdhesion = dateAdhesion;
    }
}
