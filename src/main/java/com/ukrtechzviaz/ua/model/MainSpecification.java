package com.ukrtechzviaz.ua.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by andrey on 01.04.15.
 * Цей клас описує 4-й аркуш(основні технічні характеристики установки катодного захисту) паспорту установки катодного захисту, як сутність БД
 */
@Entity
@Table(name = "main_specification")
public class MainSpecification {

    @Column(name="date_montazhu")
    private Date dateMontazhu;

    @Column(name="type_peretvoriuvacha",length = 15)
    private String typePeretvoriuvacha;

    @Column(name="vurobnuk",length = 20)
    private String vurobnuk;

    @Column(name="date_vupysky")
    private Date dateVupysky;

    @Id
    @Column(name = "number_zavodskii")
    private int numberZavodskii;

    @Column(name = "type_pokruttia", length = 15)
    @Enumerated(EnumType.STRING)
    private ProtectTypeCovering typePokruttia;

    @Column(name = "potuzhnist")
    private int P;

    @Column(name = "napruga")
    private int U;

    @Column(name="telecontrol")
    private boolean telecontrol;

    @Column(name = "sposib_zahusty",length = 15)
    private String sposibZahusty;

    @Column(name = "naiavnist_sposoby_saxusty")
    private boolean sposibZahustyYes;

    @Column(name="type_lichilnuka",length = 15)
    private String typeLichilnuka;

    @Column(name = "kilk_lichilnuka")
    private int  kilkLichilnika;

    @Column(name = "opir_zazemlennia")
    private int R;

    @Column(name="prumitka")
    private String prumitka;

    public MainSpecification() {
    }

    public MainSpecification(Date dateMontazhu, String typePeretvoriuvacha, String vurobnuk, Date dateVupysky, int numberZavodskii, ProtectTypeCovering typePokruttia, int p, int u, boolean telecontrol, String sposibZahusty, boolean sposibZahustyYes, String typeLichilnuka, int kilkLichilnika, int r, String prumitka) {
        this.dateMontazhu = dateMontazhu;
        this.typePeretvoriuvacha = typePeretvoriuvacha;
        this.vurobnuk = vurobnuk;
        this.dateVupysky = dateVupysky;
        this.numberZavodskii = numberZavodskii;
        this.typePokruttia = typePokruttia;
        P = p;
        U = u;
        this.telecontrol = telecontrol;
        this.sposibZahusty = sposibZahusty;
        this.sposibZahustyYes = sposibZahustyYes;
        this.typeLichilnuka = typeLichilnuka;
        this.kilkLichilnika = kilkLichilnika;
        R = r;
        this.prumitka = prumitka;
    }

    public Date getDateMontazhu() {
        return dateMontazhu;
    }

    public void setDateMontazhu(Date dateMontazhu) {
        this.dateMontazhu = dateMontazhu;
    }

    public String getTypePeretvoriuvacha() {
        return typePeretvoriuvacha;
    }

    public void setTypePeretvoriuvacha(String typePeretvoriuvacha) {
        this.typePeretvoriuvacha = typePeretvoriuvacha;
    }

    public String getVurobnuk() {
        return vurobnuk;
    }

    public void setVurobnuk(String vurobnuk) {
        this.vurobnuk = vurobnuk;
    }

    public Date getDateVupysky() {
        return dateVupysky;
    }

    public void setDateVupysky(Date dateVupysky) {
        this.dateVupysky = dateVupysky;
    }

    public int getNumberZavodskii() {
        return numberZavodskii;
    }

    public void setNumberZavodskii(int numberZavodskii) {
        this.numberZavodskii = numberZavodskii;
    }

    public ProtectTypeCovering getTypePokruttia() {
        return typePokruttia;
    }

    public void setTypePokruttia(ProtectTypeCovering typePokruttia) {
        this.typePokruttia = typePokruttia;
    }

    public int getP() {
        return P;
    }

    public void setP(int p) {
        P = p;
    }

    public int getU() {
        return U;
    }

    public void setU(int u) {
        U = u;
    }

    public boolean isTelecontrol() {
        return telecontrol;
    }

    public void setTelecontrol(boolean telecontrol) {
        this.telecontrol = telecontrol;
    }

    public String getSposibZahusty() {
        return sposibZahusty;
    }

    public void setSposibZahusty(String sposibZahusty) {
        this.sposibZahusty = sposibZahusty;
    }

    public boolean isSposibZahustyYes() {
        return sposibZahustyYes;
    }

    public void setSposibZahustyYes(boolean sposibZahustyYes) {
        this.sposibZahustyYes = sposibZahustyYes;
    }

    public String getTypeLichilnuka() {
        return typeLichilnuka;
    }

    public void setTypeLichilnuka(String typeLichilnuka) {
        this.typeLichilnuka = typeLichilnuka;
    }

    public int getKilkLichilnika() {
        return kilkLichilnika;
    }

    public void setKilkLichilnika(int kilkLichilnika) {
        this.kilkLichilnika = kilkLichilnika;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    public String getPrumitka() {
        return prumitka;
    }

    public void setPrumitka(String prumitka) {
        this.prumitka = prumitka;
    }
}

