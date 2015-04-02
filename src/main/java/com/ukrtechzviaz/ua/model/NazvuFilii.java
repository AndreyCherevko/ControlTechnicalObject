package com.ukrtechzviaz.ua.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by andrey on 02.04.15.
 */
@Entity
@Table(name="nazvu_filii")
public class NazvuFilii {

    @Id
    @Column(name="nazva",length=20)
    private String nazva;

    public NazvuFilii() {
    }

    public NazvuFilii(String nazva) {
        this.nazva = nazva;
    }

    public String getNazva() {
        return nazva;
    }

    public void setNazva(String nazva) {
        this.nazva = nazva;
    }
}
