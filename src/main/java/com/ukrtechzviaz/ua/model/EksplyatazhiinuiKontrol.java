package com.ukrtechzviaz.ua.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by andrey on 01.04.15
 * .Цей клас описує 6-й аркуш(експлуатаційний контроль) паспорту установки катодного захисту, як сутність БД
 */
@Entity
@Table(name="eksplyatazhiinui_kontrol")
public class EksplyatazhiinuiKontrol {

    @Column(name="data_kontrol")
    private Date dataKontrol;

    @Column(name="vremia_kontrol")
    private Date vremiaKontrol;

    @Column(name="pochankovia_robotu_strym")
    private int pochankovaRobotaStrymy;

    @Column(name="pochankova_robotu_napryga")
    private int pochankovaRobotaNaprygu;

    @Column(name="pochankovii_potenzhial_trybu_v_tdr_vkl")
    private int pochankoviiPotenzhvklvkl;

    @Column(name="pochankovii_potenzhial_trybu_v_tdr_vukl")
    private int pochankoviiPotenzhvklvukl;

    @Column(name="vstanovlenui_strym_robotu")
    private int vstanovlenuiStrymRobotu;

    @Column(name="vstanovlen_robotu_napryga")
    private int vstanobleniiRobotaNuprygu;

    @Column(name="vstanovlenii_potenzhial_trybu_v_tdr_vkl")
    private int vstanovlenuiiPotenzhvkl;

    @Column(name="vstanovlenii_potenzhial_trybu_v_tdr_vukl")
    private int vstanovlenuiiPotenzhvukl;

    @Column(name="pokazhu_lichilnuka")
    private int P;

    @Column(name="pokazhu_lichilnuka_chasy")
    private int pokazhLIchilnukaChasy;

    @Column(name="chas_prostoiy")
    private int chasProst;

    @Column(name="prumitku")
    private String prumitku;

    public EksplyatazhiinuiKontrol() {
    }

    public EksplyatazhiinuiKontrol(Date dataKontrol, Date vremiaKontrol, int pochankovaRobotaStrymy, int pochankovaRobotaNaprygu, int pochankoviiPotenzhvklvkl, int pochankoviiPotenzhvklvukl, int vstanovlenuiStrymRobotu, int vstanobleniiRobotaNuprygu, int vstanovlenuiiPotenzhvkl, int vstanovlenuiiPotenzhvukl, int p, int pokazhLIchilnukaChasy, int chasProst, String prumitku) {
        this.dataKontrol = dataKontrol;
        this.vremiaKontrol = vremiaKontrol;
        this.pochankovaRobotaStrymy = pochankovaRobotaStrymy;
        this.pochankovaRobotaNaprygu = pochankovaRobotaNaprygu;
        this.pochankoviiPotenzhvklvkl = pochankoviiPotenzhvklvkl;
        this.pochankoviiPotenzhvklvukl = pochankoviiPotenzhvklvukl;
        this.vstanovlenuiStrymRobotu = vstanovlenuiStrymRobotu;
        this.vstanobleniiRobotaNuprygu = vstanobleniiRobotaNuprygu;
        this.vstanovlenuiiPotenzhvkl = vstanovlenuiiPotenzhvkl;
        this.vstanovlenuiiPotenzhvukl = vstanovlenuiiPotenzhvukl;
        P = p;
        this.pokazhLIchilnukaChasy = pokazhLIchilnukaChasy;
        this.chasProst = chasProst;
        this.prumitku = prumitku;
    }

    public Date getDataKontrol() {
        return dataKontrol;
    }

    public void setDataKontrol(Date dataKontrol) {
        this.dataKontrol = dataKontrol;
    }

    public Date getVremiaKontrol() {
        return vremiaKontrol;
    }

    public void setVremiaKontrol(Date vremiaKontrol) {
        this.vremiaKontrol = vremiaKontrol;
    }

    public int getPochankovaRobotaStrymy() {
        return pochankovaRobotaStrymy;
    }

    public void setPochankovaRobotaStrymy(int pochankovaRobotaStrymy) {
        this.pochankovaRobotaStrymy = pochankovaRobotaStrymy;
    }

    public int getPochankovaRobotaNaprygu() {
        return pochankovaRobotaNaprygu;
    }

    public void setPochankovaRobotaNaprygu(int pochankovaRobotaNaprygu) {
        this.pochankovaRobotaNaprygu = pochankovaRobotaNaprygu;
    }

    public int getPochankoviiPotenzhvklvkl() {
        return pochankoviiPotenzhvklvkl;
    }

    public void setPochankoviiPotenzhvklvkl(int pochankoviiPotenzhvklvkl) {
        this.pochankoviiPotenzhvklvkl = pochankoviiPotenzhvklvkl;
    }

    public int getPochankoviiPotenzhvklvukl() {
        return pochankoviiPotenzhvklvukl;
    }

    public void setPochankoviiPotenzhvklvukl(int pochankoviiPotenzhvklvukl) {
        this.pochankoviiPotenzhvklvukl = pochankoviiPotenzhvklvukl;
    }

    public int getVstanovlenuiStrymRobotu() {
        return vstanovlenuiStrymRobotu;
    }

    public void setVstanovlenuiStrymRobotu(int vstanovlenuiStrymRobotu) {
        this.vstanovlenuiStrymRobotu = vstanovlenuiStrymRobotu;
    }

    public int getVstanobleniiRobotaNuprygu() {
        return vstanobleniiRobotaNuprygu;
    }

    public void setVstanobleniiRobotaNuprygu(int vstanobleniiRobotaNuprygu) {
        this.vstanobleniiRobotaNuprygu = vstanobleniiRobotaNuprygu;
    }

    public int getVstanovlenuiiPotenzhvkl() {
        return vstanovlenuiiPotenzhvkl;
    }

    public void setVstanovlenuiiPotenzhvkl(int vstanovlenuiiPotenzhvkl) {
        this.vstanovlenuiiPotenzhvkl = vstanovlenuiiPotenzhvkl;
    }

    public int getVstanovlenuiiPotenzhvukl() {
        return vstanovlenuiiPotenzhvukl;
    }

    public void setVstanovlenuiiPotenzhvukl(int vstanovlenuiiPotenzhvukl) {
        this.vstanovlenuiiPotenzhvukl = vstanovlenuiiPotenzhvukl;
    }

    public int getP() {
        return P;
    }

    public void setP(int p) {
        P = p;
    }

    public int getPokazhLIchilnukaChasy() {
        return pokazhLIchilnukaChasy;
    }

    public void setPokazhLIchilnukaChasy(int pokazhLIchilnukaChasy) {
        this.pokazhLIchilnukaChasy = pokazhLIchilnukaChasy;
    }

    public int getChasProst() {
        return chasProst;
    }

    public void setChasProst(int chasProst) {
        this.chasProst = chasProst;
    }

    public String getPrumitku() {
        return prumitku;
    }

    public void setPrumitku(String prumitku) {
        this.prumitku = prumitku;
    }
}
