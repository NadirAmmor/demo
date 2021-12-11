package com.example.demo.dtos;

import java.io.Serializable;
import java.util.Date;

public class AdhesionDto implements Serializable {

    EtudiantClubKeyDto id;

    EtudiantDto etudiantDto;

    ClubDto clubDto;


    private String statut;

    private Date dateAdhesion;

    //getters

    public EtudiantClubKeyDto getId() {
        return id;
    }

    public void setId(EtudiantClubKeyDto id) {
        this.id = id;
    }

    public EtudiantDto getEtudiant() {
        return etudiantDto;
    }

    public void setEtudiant(EtudiantDto etudiantDto) {
        this.etudiantDto = etudiantDto;
    }

    public ClubDto getClub() {
        return clubDto;
    }

    public void setClub(ClubDto clubDto) {
        this.clubDto = clubDto;
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
