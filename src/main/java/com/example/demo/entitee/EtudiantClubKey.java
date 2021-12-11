package com.example.demo.entitee;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;
@Embeddable
public class EtudiantClubKey implements Serializable {

    @Column(name = "etudiant_ID")
    private int IdEtudiant;

    @Column(name = "Club_ID")
    private int IdClub;
}
