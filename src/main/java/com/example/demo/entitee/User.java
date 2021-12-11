package com.example.demo.entitee;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table
public class User implements Serializable {
    @Id
    private int idU;

    @Column(length = 50)
    private String login;

    @Column(length = 50)
    private String password;

    private boolean IsAdmin;

    //getters

    public int getIdU() {
        return idU;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return IsAdmin;
    }


    //Setters

    public void setIdU(int idU) {
        this.idU = idU;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdmin(boolean admin) {
        IsAdmin = admin;
    }
}
