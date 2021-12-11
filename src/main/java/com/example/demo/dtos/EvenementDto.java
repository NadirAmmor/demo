package com.example.demo.dtos;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


public class EvenementDto implements Serializable {
    private int idEvenement;

    private String Intitule;

    private String Responsable;

    private Date dateDebut;
    private Date dateFin;

    private String Lieu;

    private String Description;


    private float budget;
    //getters


    public int getIdEvenement() {
        return idEvenement;
    }

    public String getIntitule() {
        return Intitule;
    }

    public String getResponsable() {
        return Responsable;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public String getLieu() {
        return Lieu;
    }

    public String getDescription(){
        return Description;
    }

    public float getBudget() {
        return budget;
    }
    //setters

    public void setIdEvenement(int idEvenement) {
        this.idEvenement = idEvenement;
    }

    public void setIntitule(String intitule) {
        Intitule = intitule;
    }

    public void setResponsable(String responsable) {
        Responsable = responsable;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public void setLieu(String lieu) {
        Lieu = lieu;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }
}
