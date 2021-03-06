package com.ukrtechzviaz.ua.model;

import javax.persistence.*;

/**
 * Created by andrey on 01.04.15
 * Цей клас описує титульний аркуш паспорту установки катодного захисту, як сутність БД.
 */
@Entity
@Table(name = "title")
public class Title {


    @Column(name="company_name",length=20)
    private String companyName;

    @Column(name="filial_name",length=20)
    private String filialName;

    @Column(name="pidrozdil_name",length = 20)
    private String pidrozdilName;

    @Id
    @Column(name="passport_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "gezoprovid_name")
    private GazoprovidName gazoprovidName;

    @Column(name="diametr_gazoprovodu")
    private int diamedrGazoprovodu;

    @Column(name="gazoprovid_km")
    private int kmGazoprovid;

    @Column(name="misto", length = 20)
    private String misto;

    public Title() {
    }

    public Title(String companyName, String filialName, String pidrozdilName, GazoprovidName gazoprovidName, int diamedrGazoprovodu, int kmGazoprovid, String misto) {
        this.companyName = companyName;
        this.filialName = filialName;
        this.pidrozdilName = pidrozdilName;
        this.gazoprovidName = gazoprovidName;
        this.diamedrGazoprovodu = diamedrGazoprovodu;
        this.kmGazoprovid = kmGazoprovid;
        this.misto = misto;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getFilialName() {
        return filialName;
    }

    public void setFilialName(String filialName) {
        this.filialName = filialName;
    }

    public String getPidrozdilName() {
        return pidrozdilName;
    }

    public void setPidrozdilName(String pidrozdilName) {
        this.pidrozdilName = pidrozdilName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GazoprovidName getGazoprovidName() {
        return gazoprovidName;
    }

    public void setGazoprovidName(GazoprovidName gazoprovidName) {
        this.gazoprovidName = gazoprovidName;
    }

    public int getDiamedrGazoprovodu() {
        return diamedrGazoprovodu;
    }

    public void setDiamedrGazoprovodu(int diamedrGazoprovodu) {
        this.diamedrGazoprovodu = diamedrGazoprovodu;
    }

    public int getKmGazoprovid() {
        return kmGazoprovid;
    }

    public void setKmGazoprovid(int kmGazoprovid) {
        this.kmGazoprovid = kmGazoprovid;
    }

    public String getMisto() {
        return misto;
    }

    public void setMisto(String misto) {
        this.misto = misto;
    }
}
