package com.ukrtechzviaz.ua.dto;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by andrey on 05.04.15.
 */
public class EksKontrolDto {

    @DateTimeFormat(pattern="MM/dd/yyyy")
    private Date dataKontrol;

    @NotNull
    @Min(value = 0)
    private int pochankovaRobotaStrymy;

    @NotNull
    @Min(value = 0)
    private int pochankovaRobotaNaprygu;

    @NotNull
    @Min(value = 0)
    private int pochankoviiPotenzhvklvkl;

    @NotNull
    @Min(value = 0)
    private int pochankoviiPotenzhvklvukl;


    private int vstanovlenuiStrymRobotu;

    private int vstanobleniiRobotaNuprygu;

    private int vstanovlenuiiPotenzhvkl;

    private int vstanovlenuiiPotenzhvukl;

    @NotNull
    private int P;

    @NotNull
    private int pokazhLIchilnukaChasy;

    @NotNull
    private int chasProst;

    private String prumitku;

    public EksKontrolDto() {
    }

    public Date getDataKontrol() {
        return dataKontrol;
    }

    public void setDataKontrol(Date dataKontrol) {
        this.dataKontrol = dataKontrol;
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
