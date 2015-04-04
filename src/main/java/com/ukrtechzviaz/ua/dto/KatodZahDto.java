package com.ukrtechzviaz.ua.dto;

import java.util.Date;

/**
 * Created by andrey on 04.04.15.
 */
public class KatodZahDto {


    private Date dateMontazhu;

    private String typePeretvoriuvacha;

    private String vurobnuk;

    private Date dataVupysky;

    private int numberZavodskii;

    private String typePokruttia;

    private int P;

    private int U;

    private int A;

    private boolean telecontrol;

    private String sposibZahusty;

    private boolean sposibZahustyYes;

    private String typeLichilnuka;

    private int  kilkLichilnika;

    private int R;

    private String prumitka;

    public KatodZahDto() {
    }

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
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

    public Date getDataVupysky() {
        return dataVupysky;
    }

    public void setDataVupysky(Date dataVupysky) {
        this.dataVupysky = dataVupysky;
    }

    public int getNumberZavodskii() {
        return numberZavodskii;
    }

    public void setNumberZavodskii(int numberZavodskii) {
        this.numberZavodskii = numberZavodskii;
    }

    public String getTypePokruttia() {
        return typePokruttia;
    }

    public void setTypePokruttia(String typePokruttia) {
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
