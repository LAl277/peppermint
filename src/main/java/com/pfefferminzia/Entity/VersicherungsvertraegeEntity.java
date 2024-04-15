package com.pfefferminzia.Entity;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "Versicherungsvertraege")
public class VersicherungsvertraegeEntity {

    @Id
    @Column(name = "VertragsID")
    private int vertragsID;

    @Column(name = "Vv_KundenID")
    private int vv_kundenID;

    @Column(name = "Vv_VersicherungsID")
    private int vv_versicherungsID;

    @Column(name = "Vertragsbeginn")
    private Date vertragsbeginn;

    @Column(name = "Vertragsende")
    private Date vertragsende;

    // Beziehung zu Kunden
    @ManyToOne
    @JoinColumn(name = "Vv_KundenID", referencedColumnName = "KundenID", insertable=false, updatable=false)
    private KundenEntity kunde;

    // Beziehung zu Versicherungen
    @ManyToOne
    @JoinColumn(name = "Vv_VersicherungsID", referencedColumnName = "VersicherungsID", insertable=false, updatable=false)
    private VersicherungEntity versicherung;

    public int getVertragsID() {
        return vertragsID;
    }

    public void setVertragsID(int vertragsID) {
        this.vertragsID = vertragsID;
    }

    public int getVv_kundenID() {
        return vv_kundenID;
    }

    public void setVv_kundenID(int vv_kundenID) {
        this.vv_kundenID = vv_kundenID;
    }

    public int getVv_versicherungsID() {
        return vv_versicherungsID;
    }

    public void setVv_versicherungsID(int vv_versicherungsID) {
        this.vv_versicherungsID = vv_versicherungsID;
    }

    public Date getVertragsbeginn() {
        return vertragsbeginn;
    }

    public void setVertragsbeginn(Date vertragsbeginn) {
        this.vertragsbeginn = vertragsbeginn;
    }

    public Date getVertragsende() {
        return vertragsende;
    }

    public void setVertragsende(Date vertragsende) {
        this.vertragsende = vertragsende;
    }

    public KundenEntity getKunde() {
        return kunde;
    }

    public void setKunde(KundenEntity kunde) {
        this.kunde = kunde;
    }

    public VersicherungEntity getVersicherung() {
        return versicherung;
    }

    public void setVersicherung(VersicherungEntity versicherung) {
        this.versicherung = versicherung;
    }
}

