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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="data_montazhy")
    private Date dataMontazhu;

    @Column(name = "type_electrodiv",length=15)
    private String typeElectrodiv;

    @Column(name="vurobnuk",length = 15)
    private String vurobnuk;

    @Column(name="konstr_azs",length = 20)
    private String kostrnAzs;

    @Column(name="kti_electrodiv")
    private int ktiElectrodiv;

    @Column(name="glubuna_zaliaginnia")
    private int glibinaZaliaginnia;

    @Column(name="vidstan_do_gazoprovody")
    private int vidstanDoGazoprovody;

    @Column(name="vidstan_do_ukz")
    private int vidstanDoUkz;

    @Column(name = "dovzhuna_adnogo_polia")
    private int dovzhunaAnodnogoPolia;

    @Column(name = "opir_roztikannia")
    private int opirRoztikannia;

    @Column(name="putomui_opir")
    private int putomuiOpir;

    @Column(name="budivelnaOrganizazhia",length = 20)
    private String budivelnaOrganizazhia;

    @Column(name="prumitku")
    private String prumitku;

    public AnodneZazemlennia() {
    }

    public AnodneZazemlennia(Date dataMontazhu, String typeElectrodiv, String vurobnuk, String kostrnAzs, int ktiElectrodiv, int glibinaZaliaginnia, int vidstanDoGazoprovody, int vidstanDoUkz, int dovzhunaAnodnogoPolia, int opirRoztikannia, int putomuiOpir, String budivelnaOrganizazhia, String prumitku) {
        this.dataMontazhu = dataMontazhu;
        this.typeElectrodiv = typeElectrodiv;
        this.vurobnuk = vurobnuk;
        this.kostrnAzs = kostrnAzs;
        this.ktiElectrodiv = ktiElectrodiv;
        this.glibinaZaliaginnia = glibinaZaliaginnia;
        this.vidstanDoGazoprovody = vidstanDoGazoprovody;
        this.vidstanDoUkz = vidstanDoUkz;
        this.dovzhunaAnodnogoPolia = dovzhunaAnodnogoPolia;
        this.opirRoztikannia = opirRoztikannia;
        this.putomuiOpir = putomuiOpir;
        this.budivelnaOrganizazhia = budivelnaOrganizazhia;
        this.prumitku = prumitku;
    }

    public String getTypeElectrodiv() {
        return typeElectrodiv;
    }

    public void setTypeElectrodiv(String typeElectrodiv) {
        this.typeElectrodiv = typeElectrodiv;
    }

    public String getVurobnuk() {
        return vurobnuk;
    }

    public void setVurobnuk(String vurobnuk) {
        this.vurobnuk = vurobnuk;
    }

    public String getKostrnAzs() {
        return kostrnAzs;
    }

    public void setKostrnAzs(String kostrnAzs) {
        this.kostrnAzs = kostrnAzs;
    }

    public int getKtiElectrodiv() {
        return ktiElectrodiv;
    }

    public void setKtiElectrodiv(int ktiElectrodiv) {
        this.ktiElectrodiv = ktiElectrodiv;
    }

    public int getVidstanDoGazoprovody() {
        return vidstanDoGazoprovody;
    }

    public void setVidstanDoGazoprovody(int vidstanDoGazoprovody) {
        this.vidstanDoGazoprovody = vidstanDoGazoprovody;
    }

    public int getVidstanDoUkz() {
        return vidstanDoUkz;
    }

    public void setVidstanDoUkz(int vidstanDoUkz) {
        this.vidstanDoUkz = vidstanDoUkz;
    }

    public int getDovzhunaAnodnogoPolia() {
        return dovzhunaAnodnogoPolia;
    }

    public void setDovzhunaAnodnogoPolia(int dovzhunaAnodnogoPolia) {
        this.dovzhunaAnodnogoPolia = dovzhunaAnodnogoPolia;
    }

    public int getOpirRoztikannia() {
        return opirRoztikannia;
    }

    public void setOpirRoztikannia(int opirRoztikannia) {
        this.opirRoztikannia = opirRoztikannia;
    }

    public int getPutomuiOpir() {
        return putomuiOpir;
    }

    public void setPutomuiOpir(int putomuiOpir) {
        this.putomuiOpir = putomuiOpir;
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
