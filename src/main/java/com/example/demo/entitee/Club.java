package com.example.demo.entitee;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table
public class Club implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idClub;

    @Column(length = 50)
    private String NomC;

    private Date dateCreation;

    //getters


    public int getIdClub() {
        return idClub;
    }

    public String getNomC() {
        return NomC;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    //setters

    public void setIdClub(int idClub) {
        this.idClub = idClub;
    }

    public void setNomC(String nomC) {
        NomC = nomC;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
