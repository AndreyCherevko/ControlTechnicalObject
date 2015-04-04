package com.ukrtechzviaz.ua.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by andrey on 01.04.15.
 * Цей клас описує 8-й аркуш(Планово-запобіжні-ремонти) паспорту установки катодного захисту, як сутність БД
 */
@Entity
@Table(name="planovo_zapobizhni_robotu")
public class PlanovoZapobizhniRobotu {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="pochatkova_data_remonty")
    private Date pochatkovaDataRemonty;

    @Column(name="kinzheva_data_remonty")
    private Date kinzhevaDataRemonty;

    @Column(name = "vud_remonty", length = 25)
    @Enumerated(EnumType.STRING)
    private TupRemonty type;

    @Column(name = "opus_provedenux_robit",length = 200)
    private String opusRobit;

    @Column(name="vstanovlenui_rezhim_ykz")
    private int vstanRezhimUkz;

    @Column(name = "potenzhial_trybu_vkl_ykz")
    private int vvimknP;

    @Column(name="potenzhail_trybu_vukl_ykz")
    private int vvumkP;

    @Column(name="opir_zazhemlennia_anodnui")
    private int anodR;

    @Column(name="opir_zazeml_zahusn")
    private int zahR;

    @OneToOne
    @JoinColumn(name="passport_id")
    private Passport passport;

    public PlanovoZapobizhniRobotu() {
    }

    public PlanovoZapobizhniRobotu(Passport passport, Date pochatkovaDataRemonty, Date kinzhevaDataRemonty, TupRemonty type, String opusRobit, int vstanRezhimUkz, int vvimknP, int vvumkP, int anodR, int zahR) {
        this.pochatkovaDataRemonty = pochatkovaDataRemonty;
        this.kinzhevaDataRemonty = kinzhevaDataRemonty;
        this.type = type;
        this.opusRobit = opusRobit;
        this.vstanRezhimUkz = vstanRezhimUkz;
        this.vvimknP = vvimknP;
        this.vvumkP = vvumkP;
        this.anodR = anodR;
        this.zahR = zahR;
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

    public TupRemonty getType() {
        return type;
    }

    public void setType(TupRemonty type) {
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

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
