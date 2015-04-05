package com.ukrtechzviaz.ua.dto;




import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;


import java.util.Date;

/**
 * Created by andrey on 04.04.15.
 */
public class KatodZahDto {

    @DateTimeFormat(pattern="MM/dd/yyyy")
    private Date dateMontazhu;

    @NotEmpty(message = "?? ???? ?? ???? ???? ??????")
    private String typePeretvoriuvacha;

    @NotEmpty
    private String vurobnuk;

    @DateTimeFormat(pattern="MM/dd/yyyy")
    private Date dataVupysky;

    @Range(min = 0)
    private Integer numberZavodskii;

    @NotEmpty
    private String typePokruttia;

    @Range(min = 0)
    private Integer P;

    @Range(min = 0)
    private Integer U;

    @Range(min = 0)
    private Integer A;

    private boolean telecontrol;

    @NotEmpty
    private String sposibZahusty;

    private boolean sposibZahustyYes;

    @NotEmpty
    private String typeLichilnuka;

    @Range(min = 0)
    private Integer  kilkLichilnika;

    @Range(min = 0)
    private Integer R;

    private String prumitka;

    public KatodZahDto() {
    }

    public KatodZahDto(Date dateMontazhu, String typePeretvoriuvacha, String vurobnuk, Date dataVupysky, Integer numberZavodskii, String typePokruttia, Integer p, Integer u, Integer a, boolean telecontrol, String sposibZahusty, boolean sposibZahustyYes, String typeLichilnuka, Integer kilkLichilnika, Integer r, String prumitka) {
        this.dateMontazhu = dateMontazhu;
        this.typePeretvoriuvacha = typePeretvoriuvacha;
        this.vurobnuk = vurobnuk;
        this.dataVupysky = dataVupysky;
        this.numberZavodskii = numberZavodskii;
        this.typePokruttia = typePokruttia;
        P = p;
        U = u;
        A = a;
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

    public Date getDataVupysky() {
        return dataVupysky;
    }

    public void setDataVupysky(Date dataVupysky) {
        this.dataVupysky = dataVupysky;
    }

    public Integer getNumberZavodskii() {
        return numberZavodskii;
    }

    public void setNumberZavodskii(Integer numberZavodskii) {
        this.numberZavodskii = numberZavodskii;
    }

    public String getTypePokruttia() {
        return typePokruttia;
    }

    public void setTypePokruttia(String typePokruttia) {
        this.typePokruttia = typePokruttia;
    }

    public Integer getP() {
        return P;
    }

    public void setP(Integer p) {
        P = p;
    }

    public Integer getU() {
        return U;
    }

    public void setU(Integer u) {
        U = u;
    }

    public Integer getA() {
        return A;
    }

    public void setA(Integer a) {
        A = a;
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

    public Integer getKilkLichilnika() {
        return kilkLichilnika;
    }

    public void setKilkLichilnika(Integer kilkLichilnika) {
        this.kilkLichilnika = kilkLichilnika;
    }

    public Integer getR() {
        return R;
    }

    public void setR(Integer r) {
        R = r;
    }

    public String getPrumitka() {
        return prumitka;
    }

    public void setPrumitka(String prumitka) {
        this.prumitka = prumitka;
    }
}
