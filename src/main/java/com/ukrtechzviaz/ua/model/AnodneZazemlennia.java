package com.ukrtechzviaz.ua.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by andrey on 01.04.15.
 * Цей клас описує 5-й аркуш(анодне заземлення) паспорту установки катодного захисту, як сутність БД
 */
@Entity
@Table(name="anodne_zezemlennia")
public class AnodneZazemlennia {

    @Id
    @Column(name="id")
    private int id;

    @Column(name="data_montazhy")
    private Date dataMontazhu;

    @ManyToOne
    @JoinColumn(name="odunutsia_obladnannia")
    private OdunutsiaObladnannia odunutsiaObladnannia;

    //@Column(name = "type_electrodiv",length=15)
    //private String typeElectrodiv;

    //@Column(name="vurobnuk",length = 15)
    //private String vurobnuk;

    //@Column(name="konstr_azs",length = 20)
    //private String kostrnAzs;

    //@Column(name="kti_electrodiv")
    //private int ktiElectrodiv;

    @Column(name="glubuna_zaliaginnia")
    private int glibinaZaliaginnia;

    //@Column(name="vidstan_do_gazoprovody")
    //private int vidstanDoGazoprovody;

    //@Column(name="vidstan_do_ukz")
    //private int vidstanDoUkz;

    //@Column(name = "dovzhuna_adnogo_polia")
    //private int dovzhunaAnodnogoPolia;

    //@Column(name = "opir_roztikannia")
    //private int opirRoztikannia;

    //@Column(name="putomui_opir")
    //private int putomuiOpir;

    @Column(name="budivelnaOrganizazhia",length = 20)
    private String budivelnaOrganizazhia;

    @Column(name="prumitku")
    private String prumitku;

    public AnodneZazemlennia() {
    }

    public AnodneZazemlennia(int id, Date dataMontazhu, OdunutsiaObladnannia odunutsiaObladnannia, int glibinaZaliaginnia, String budivelnaOrganizazhia, String prumitku) {
        this.id = id;
        this.dataMontazhu = dataMontazhu;
        this.odunutsiaObladnannia = odunutsiaObladnannia;
        this.glibinaZaliaginnia = glibinaZaliaginnia;
        this.budivelnaOrganizazhia = budivelnaOrganizazhia;
        this.prumitku = prumitku;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataMontazhu() {
        return dataMontazhu;
    }

    public void setDataMontazhu(Date dataMontazhu) {
        this.dataMontazhu = dataMontazhu;
    }

    public OdunutsiaObladnannia getOdunutsiaObladnannia() {
        return odunutsiaObladnannia;
    }

    public void setOdunutsiaObladnannia(OdunutsiaObladnannia odunutsiaObladnannia) {
        this.odunutsiaObladnannia = odunutsiaObladnannia;
    }

    public int getGlibinaZaliaginnia() {
        return glibinaZaliaginnia;
    }

    public void setGlibinaZaliaginnia(int glibinaZaliaginnia) {
        this.glibinaZaliaginnia = glibinaZaliaginnia;
    }

    public String getBudivelnaOrganizazhia() {
        return budivelnaOrganizazhia;
    }

    public void setBudivelnaOrganizazhia(String budivelnaOrganizazhia) {
        this.budivelnaOrganizazhia = budivelnaOrganizazhia;
    }

    public String getPrumitku() {
        return prumitku;
    }

    public void setPrumitku(String prumitku) {
        this.prumitku = prumitku;
    }
}
