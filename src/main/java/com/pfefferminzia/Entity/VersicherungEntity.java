package com.pfefferminzia.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Versicherung")
public class VersicherungEntity {

    @Id
    @Column(name = "VersicherungsID")
    private int versicherungsID;

    @Column(name = "Sparte")
    private String sparte;

    @Column(name = "Tarif")
    private String tarif;

    public int getVersicherungsID() {
        return versicherungsID;
    }

    public String getSparte() {
        return sparte;
    }

    public String getTarif() {
        return tarif;
    }
}
