package com.pfefferminzia.Entity;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "Versicherungsvertraege")
public class VersicherungsvertraegeEntity {

    @Id
    private int vertragsID;

    @Column(name = "Vv_KundenID")
    private int kundenID;

    @Column(name = "Vv_VersicherungsID")
    private int versicherungsID;

    @Column(name = "Vertragsbeginn")
    private Date vertragsbeginn;

    @Column(name = "Vertragsende")
    private Date vertragsende;

    // Beziehung zu Kunden
    @ManyToOne
    @JoinColumn(name = "Vv_KundenID", referencedColumnName = "KundenID")
    private KundenEntity kunde;

    // Beziehung zu Versicherungen
    @ManyToOne
    @JoinColumn(name = "Vv_VersicherungsID", referencedColumnName = "VersicherungsID")
    private VersicherungEntity versicherung;

    public int getVertragsID() {
        return vertragsID;
    }

    public int getKundenID() {
        return kundenID;
    }

    public int getVersicherungsID() {
        return versicherungsID;
    }

    public Date getVertragsbeginn() {
        return vertragsbeginn;
    }

    public Date getVertragsende() {
        return vertragsende;
    }

    public KundenEntity getKunde() {
        return kunde;
    }

    public VersicherungEntity getVersicherung() {
        return versicherung;
    }
}

