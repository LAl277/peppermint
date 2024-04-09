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

    // Getter und Setter

    public int getVersicherungsID() {
        return versicherungsID;
    }

    public void setVersicherungsID(int versicherungsID) {
        this.versicherungsID = versicherungsID;
    }

    public String getSparte() {
        return sparte;
    }

    public void setSparte(String sparte) {
        this.sparte = sparte;
    }

    public String getTarif() {
        return tarif;
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }
}
