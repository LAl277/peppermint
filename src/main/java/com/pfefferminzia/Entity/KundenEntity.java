package com.pfefferminzia.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="Kunden")
public class KundenEntity {
    @Id
    @Column(name = "KundenID")
    private Long kundenId;
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

    public Long getKundenId() {
        return kundenId;
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

    public void setKundenId(Long kundenId) {
        this.kundenId = kundenId;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }
}
