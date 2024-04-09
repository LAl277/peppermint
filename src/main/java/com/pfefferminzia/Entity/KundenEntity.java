package com.pfefferminzia.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="kunden")
public class KundenEntity {
    @Id
    @Column(name = "KundenID")
    private Long kundenID;
    @Column(name = "Vorname")
    private String vorname;
    @Column(name = "Nachname")
    private String nachname;
    @Column(name = "Geburtsdatum")
    private Date geburtsdatum;
    @Column(name = "PLZ")
    private String plz;
    @Column(name = "Ort")
    private String ort;
    @Column(name = "Telefonnummer")
    private String telefonnummer;

    public Long getKundenID() {
        return kundenID;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    public String getPlz() {
        return plz;
    }

    public String getOrt() {
        return ort;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }
}
