package com.pfefferminzia.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Versicherungen")
public class VersicherungEntity {

    @Id
    @Column(name = "VersicherungsID")
    private int versicherungsID;

    @Column(name = "Sparte")
    private String sparte;

    @Column(name = "Tarif")
    private String tarif;

    public void setVersicherungsID(int versicherungsID) {
        this.versicherungsID = versicherungsID;
    }

    public void setSparte(String sparte) {
        this.sparte = sparte;
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }

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
