package com.example.demo.daos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

public class EtudiantClubKeyDao implements Serializable {

    private int IdEtudiant;

    private int IdClub;
}
