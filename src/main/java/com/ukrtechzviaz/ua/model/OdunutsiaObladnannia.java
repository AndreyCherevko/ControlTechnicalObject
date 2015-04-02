package com.ukrtechzviaz.ua.model;

import javax.persistence.*;

/**
 * Created by andrey on 02.04.15.
 */
@Entity
@Table(name="odunutsia_obladnannia")
public class OdunutsiaObladnannia {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="tup_peretvoriuvacha",length = 15)
    private String tupPeretvoriuvacha;

    @Column(name = "vurobnuk",length = 20)
    private String vurobnuk;

    @Column(name="zavodskui_nomer")
    private int zavodskuiNomer;

    @Column(name="konstr_anodnogo_zahusty",length = 20)
    private String konstr_anodnogo_zahusty;

    @Column(name="kt_electroniv")
    private int ktElectrodiv;

    @Column(name="vidstan_gazoprovody")
    private int vidstanGazoprovody;

    @Column(name = "vidstan_do_ukz")
    private int vidstanDoUKZ;

    @Column(name="dovzhuna_anodnogo_polia")
    private int dovzhunaAnodnogoPolia;

    @Column(name="opir_roztikanniu")
    private int opirRoztikanniy;

    @Column(name="put_opir_grynty")
    private int putOpirGrynty;

    public OdunutsiaObladnannia() {
    }

    public OdunutsiaObladnannia(String tupPeretvoriuvacha, String vurobnuk, int zavodskuiNomer, String konstr_anodnogo_zahusty, int ktElectrodiv, int vidstanGazoprovody, int vidstanDoUKZ, int dovzhunaAnodnogoPolia, int opirRoztikanniy, int putOpirGrynty) {
        this.tupPeretvoriuvacha = tupPeretvoriuvacha;
        this.vurobnuk = vurobnuk;
        this.zavodskuiNomer = zavodskuiNomer;
        this.konstr_anodnogo_zahusty = konstr_anodnogo_zahusty;
        this.ktElectrodiv = ktElectrodiv;
        this.vidstanGazoprovody = vidstanGazoprovody;
        this.vidstanDoUKZ = vidstanDoUKZ;
        this.dovzhunaAnodnogoPolia = dovzhunaAnodnogoPolia;
        this.opirRoztikanniy = opirRoztikanniy;
        this.putOpirGrynty = putOpirGrynty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTupPeretvoriuvacha() {
        return tupPeretvoriuvacha;
    }

    public void setTupPeretvoriuvacha(String tupPeretvoriuvacha) {
        this.tupPeretvoriuvacha = tupPeretvoriuvacha;
    }

    public String getVurobnuk() {
        return vurobnuk;
    }

    public void setVurobnuk(String vurobnuk) {
        this.vurobnuk = vurobnuk;
    }

    public int getZavodskuiNomer() {
        return zavodskuiNomer;
    }

    public void setZavodskuiNomer(int zavodskuiNomer) {
        this.zavodskuiNomer = zavodskuiNomer;
    }

    public String getKonstr_anodnogo_zahusty() {
        return konstr_anodnogo_zahusty;
    }

    public void setKonstr_anodnogo_zahusty(String konstr_anodnogo_zahusty) {
        this.konstr_anodnogo_zahusty = konstr_anodnogo_zahusty;
    }

    public int getKtElectrodiv() {
        return ktElectrodiv;
    }

    public void setKtElectrodiv(int ktElectrodiv) {
        this.ktElectrodiv = ktElectrodiv;
    }

    public int getVidstanGazoprovody() {
        return vidstanGazoprovody;
    }

    public void setVidstanGazoprovody(int vidstanGazoprovody) {
        this.vidstanGazoprovody = vidstanGazoprovody;
    }

    public int getVidstanDoUKZ() {
        return vidstanDoUKZ;
    }

    public void setVidstanDoUKZ(int vidstanDoUKZ) {
        this.vidstanDoUKZ = vidstanDoUKZ;
    }

    public int getDovzhunaAnodnogoPolia() {
        return dovzhunaAnodnogoPolia;
    }

    public void setDovzhunaAnodnogoPolia(int dovzhunaAnodnogoPolia) {
        this.dovzhunaAnodnogoPolia = dovzhunaAnodnogoPolia;
    }

    public int getOpirRoztikanniy() {
        return opirRoztikanniy;
    }

    public void setOpirRoztikanniy(int opirRoztikanniy) {
        this.opirRoztikanniy = opirRoztikanniy;
    }

    public int getPutOpirGrynty() {
        return putOpirGrynty;
    }

    public void setPutOpirGrynty(int putOpirGrynty) {
        this.putOpirGrynty = putOpirGrynty;
    }
}
