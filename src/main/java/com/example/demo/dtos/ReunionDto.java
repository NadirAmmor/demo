package com.example.demo.dtos;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.UniqueConstraint;

public class ReunionDto implements Serializable {

    private int idReunion;

    private String Intitule;

    private String Responsable;

    private Date date;

    private Time horaire;

    private String Lieu;

    private String Description;

    //getters

    public int getIdReunion() {
        return idReunion;
    }

    public String getIntitule() {
        return Intitule;
    }

    public String getResponsable() {
        return Responsable;
    }

    public Date getDate() {
        return date;
    }

    public Time getHoraire() {
        return horaire;
    }

    public String getLieu() {
        return Lieu;
    }

    public String getDescription() {
        return Description;
    }

    //setters

    public void setIdAdmin(int idAdmin) {
        this.idReunion = idAdmin;
    }

    public void setIntitule(String intitule) {
        Intitule = intitule;
    }

    public void setResponsable(String responsable) {
        Responsable = responsable;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setHoraire(Time horaire) {
        this.horaire = horaire;
    }

    public void setLieu(String lieu) {
        Lieu = lieu;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
