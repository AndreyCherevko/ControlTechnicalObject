package com.ukrtechzviaz.ua.dto;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

/**
 * Created by andrey on 05.04.15.
 */
public class PlanovoZapobizhniRemontuDto {

    @DateTimeFormat(pattern="MM/dd/yyyy")
    private Date pochatkovaDataRemonty;

    @DateTimeFormat(pattern="MM/dd/yyyy")
    private Date kinzhevaDataRemonty;

    @NotEmpty
    private String type;

    @NotEmpty
    private String opusRobit;

    @NotNull
    private int vstanRezhimUkz;

    @NotNull
    private int vstanRezhimUkzU;

    @NotNull
    private int vvimknP;

    @NotNull
    private int vvumkP;

    @NotNull
    private int anodR;

    @NotNull
    private int zahR;

    public PlanovoZapobizhniRemontuDto() {
    }

    public Date getPochatkovaDataRemonty() {
        return pochatkovaDataRemonty;
    }

    public void setPochatkovaDataRemonty(Date pochatkovaDataRemonty) {
        this.pochatkovaDataRemonty = pochatkovaDataRemonty;
    }

    public Date getKinzhevaDataRemonty() {
        return kinzhevaDataRemonty;
    }

    public void setKinzhevaDataRemonty(Date kinzhevaDataRemonty) {
        this.kinzhevaDataRemonty = kinzhevaDataRemonty;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOpusRobit() {
        return opusRobit;
    }

    public void setOpusRobit(String opusRobit) {
        this.opusRobit = opusRobit;
    }

    public int getVstanRezhimUkz() {
        return vstanRezhimUkz;
    }

    public void setVstanRezhimUkz(int vstanRezhimUkz) {
        this.vstanRezhimUkz = vstanRezhimUkz;
    }

    public int getVvimknP() {
        return vvimknP;
    }

    public void setVvimknP(int vvimknP) {
        this.vvimknP = vvimknP;
    }

    public int getVvumkP() {
        return vvumkP;
    }

    public void setVvumkP(int vvumkP) {
        this.vvumkP = vvumkP;
    }

    public int getAnodR() {
        return anodR;
    }

    public void setAnodR(int anodR) {
        this.anodR = anodR;
    }

    public int getZahR() {
        return zahR;
    }

    public void setZahR(int zahR) {
        this.zahR = zahR;
    }

    public int getVstanRezhimUkzU() {
        return vstanRezhimUkzU;
    }

    public void setVstanRezhimUkzU(int vstanRezhimUkzU) {
        this.vstanRezhimUkzU = vstanRezhimUkzU;
    }
}
