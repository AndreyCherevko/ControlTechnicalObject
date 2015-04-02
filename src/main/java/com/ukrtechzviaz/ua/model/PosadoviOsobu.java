package com.ukrtechzviaz.ua.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by andrey on 02.04.15.
 */
@Entity
@Table(name="posadovi_osobu")
public class PosadoviOsobu {

    @Id
    @Column(name="login",length = 15)
    private String login;

    @Column(name="pass",length = 12)
    private String password;

    @Column(name="pib",length = 60)
    private String pib;

    @Column(name="posada",length = 30)
    private String posada;

    @Column(name="vvedennia_tehn_obectiv")
    private boolean vvedennia;

    @Column(name="zvitnist")
    private boolean zvitnist;

    public PosadoviOsobu() {
    }

    public PosadoviOsobu(String login, String password, String pib, String posada, boolean vvedennia, boolean zvitnist) {
        this.login = login;
        this.password = password;
        this.pib = pib;
        this.posada = posada;
        this.vvedennia = vvedennia;
        this.zvitnist = zvitnist;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getPosada() {
        return posada;
    }

    public void setPosada(String posada) {
        this.posada = posada;
    }

    public boolean isVvedennia() {
        return vvedennia;
    }

    public void setVvedennia(boolean vvedennia) {
        this.vvedennia = vvedennia;
    }

    public boolean isZvitnist() {
        return zvitnist;
    }

    public void setZvitnist(boolean zvitnist) {
        this.zvitnist = zvitnist;
    }
}
