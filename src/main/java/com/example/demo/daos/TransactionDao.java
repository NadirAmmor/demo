package com.example.demo.daos;

import javax.persistence.*;
import java.io.File;
import java.io.Serializable;

public class TransactionDao implements Serializable {
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
