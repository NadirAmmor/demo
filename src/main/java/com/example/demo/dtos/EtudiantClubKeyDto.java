package com.example.demo.dtos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

public class EtudiantClubKeyDto implements Serializable {

    private int IdEtudiant;

    private int IdClub;
}
