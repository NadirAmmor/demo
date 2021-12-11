package com.example.demo.dtos;

import javax.persistence.*;
import java.io.Serializable;

public class UserDto implements Serializable {
    private int idU;

    private String login;

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
