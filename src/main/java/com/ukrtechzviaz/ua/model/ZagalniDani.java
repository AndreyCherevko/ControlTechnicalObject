package com.ukrtechzviaz.ua.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by andrey on 01.04.15.
 * Цей клас описує другий аркуш(загальні дані) паспорту установки катодного захисту, як сутність БД
 */
@Entity
@Table(name="zagalni_dani")
public class ZagalniDani {

    @Id
    @Column(name="id")
    private int id;

    @OneToOne
    @JoinColumn(name="passport_id")
    private Passport passport;

    @Column(name = "sposib_zahusty", length = 25)
    @Enumerated(EnumType.STRING)
    TupRemonty protectType;

    @Column(name="geografichna_priviazha",length = 15)
    private String geografichnaPriviazhka;

    @Column(name="start_ecsl_date")
    private Date startEcspl;

    @Column(name="project_organization")
    private String projectOrganization;

    @Column(name = "bydivelna_montazhna_organization")
    private String bmOrganization;

    @Column(name="zemlekorustyvach")
    private String zemlekorustyvach;


    public ZagalniDani() {
    }

    public Passport getPassport() {
        return passport;
    }

    public ZagalniDani(Passport passport, TupRemonty protectType, String geografichnaPriviazhka, Date startEcspl, String projectOrganization, String bmOrganization, String zemlekorustyvach) {
        this.passport = passport;
        this.protectType = protectType;
        this.geografichnaPriviazhka = geografichnaPriviazhka;
        this.startEcspl = startEcspl;
        this.projectOrganization = projectOrganization;
        this.bmOrganization = bmOrganization;
        this.zemlekorustyvach = zemlekorustyvach;
    }

    public TupRemonty getProtectType() {
        return protectType;
    }

    public void setProtectType(TupRemonty protectType) {
        this.protectType = protectType;
    }

    public void setPassport(Passport gazoprovidName) {
        this.passport = gazoprovidName;
    }

    public String getGeografichnaPriviazhka() {
        return geografichnaPriviazhka;
    }

    public void setGeografichnaPriviazhka(String geografichnaPriviazhka) {
        this.geografichnaPriviazhka = geografichnaPriviazhka;
    }

    public Date getStartEcspl() {
        return startEcspl;
    }

    public void setStartEcspl(Date startEcspl) {
        this.startEcspl = startEcspl;
    }

    public String getProjectOrganization() {
        return projectOrganization;
    }

    public void setProjectOrganization(String projectOrganization) {
        this.projectOrganization = projectOrganization;
    }

    public String getBmOrganization() {
        return bmOrganization;
    }

    public void setBmOrganization(String bmOrganization) {
        this.bmOrganization = bmOrganization;
    }

    public String getZemlekorustyvach() {
        return zemlekorustyvach;
    }

    public void setZemlekorustyvach(String zemlekorustyvach) {
        this.zemlekorustyvach = zemlekorustyvach;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
