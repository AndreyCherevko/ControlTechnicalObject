package com.ukrtechzviaz.ua.dto;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

/**
 * Created by andrey on 03.04.15.
 */
public class AnodneZazemlenniaDto {

    private int id;

    @DateTimeFormat(pattern="MM/dd/yyyy")
    @Past
    private Date dataMontazhu;

    @NotEmpty
    private String typeElectrodiv;

    @NotEmpty
    private String vurobnuk;

    @NotEmpty
    private String kostrnAzs;

    @Range(min = 0)
    private Integer ktiElectrodiv;

    @Range(min = 0)
    private Integer glibinaZaliaginnia;

    @Range(min = 0)
    private Integer vidstanDoGazoprovody;

    @Range(min = 0)
    private Integer vidstanDoUkz;

    @Range(min = 0)
    private Integer dovzhunaAnodnogoPolia;

    @Range(min = 0)
    private Integer opirRoztikannia;

    @Range(min = 0)
    private Integer putomuiOpir;

    @NotEmpty
    private String budivelnaOrganizazhia;

    private String prumitku;

    public AnodneZazemlenniaDto() {
    }

    public AnodneZazemlenniaDto(int id, Date dataMontazhu, String typeElectrodiv, String vurobnuk, String kostrnAzs, int ktiElectrodiv, int glibinaZaliaginnia, int vidstanDoGazoprovody, int vidstanDoUkz, int dovzhunaAnodnogoPolia, int opirRoztikannia, int putomuiOpir, String budivelnaOrganizazhia, String prumitku) {
        this.id = id;
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

    public Integer getKtiElectrodiv() {
        return ktiElectrodiv;
    }

    public void setKtiElectrodiv(Integer ktiElectrodiv) {
        this.ktiElectrodiv = ktiElectrodiv;
    }

    public Integer getGlibinaZaliaginnia() {
        return glibinaZaliaginnia;
    }

    public void setGlibinaZaliaginnia(Integer glibinaZaliaginnia) {
        this.glibinaZaliaginnia = glibinaZaliaginnia;
    }

    public Integer getVidstanDoGazoprovody() {
        return vidstanDoGazoprovody;
    }

    public void setVidstanDoGazoprovody(Integer vidstanDoGazoprovody) {
        this.vidstanDoGazoprovody = vidstanDoGazoprovody;
    }

    public Integer getVidstanDoUkz() {
        return vidstanDoUkz;
    }

    public void setVidstanDoUkz(Integer vidstanDoUkz) {
        this.vidstanDoUkz = vidstanDoUkz;
    }

    public Integer getDovzhunaAnodnogoPolia() {
        return dovzhunaAnodnogoPolia;
    }

    public void setDovzhunaAnodnogoPolia(Integer dovzhunaAnodnogoPolia) {
        this.dovzhunaAnodnogoPolia = dovzhunaAnodnogoPolia;
    }

    public Integer getOpirRoztikannia() {
        return opirRoztikannia;
    }

    public void setOpirRoztikannia(Integer opirRoztikannia) {
        this.opirRoztikannia = opirRoztikannia;
    }

    public Integer getPutomuiOpir() {
        return putomuiOpir;
    }

    public void setPutomuiOpir(Integer putomuiOpir) {
        this.putomuiOpir = putomuiOpir;
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
