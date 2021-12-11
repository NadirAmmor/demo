package com.example.demo.entitee;

import javax.persistence.*;
import java.io.File;
import java.io.Serializable;

@Entity
@Table
public class Transaction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IdBudget;

    private float Amount;

    private File facture;
    //getters

    public int getIdBudget() {
        return IdBudget;
    }

    public float getAmount() {
        return Amount;
    }

    public File getFacture() {
        return facture;
    }

    //setters

    public void setIdBudget(int idBudget) {
        IdBudget = idBudget;
    }

    public void setAmount(float amount) {
        Amount = amount;
    }

    public void setFacture(File facture) {
        this.facture = facture;
    }
}
