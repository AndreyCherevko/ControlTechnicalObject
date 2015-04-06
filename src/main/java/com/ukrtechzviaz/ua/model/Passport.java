package com.ukrtechzviaz.ua.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by andrey on 01.04.15
 * Цей клас описує титульний аркуш паспорту установки катодного захисту, як сутність БД.
 */
@Entity
@Table(name = "passport")
public class Passport {

    @ManyToOne
    @JoinColumn(name="company_name")
    private NazvuKompanii companyName;

    @ManyToOne
    @JoinColumn(name="filial_name")
    private NazvuFilii filialName;

    @ManyToOne
    @JoinColumn(name="anodne_zezemlennia")
    private AnodneZazemlennia anodneZazemlennia;

    @ManyToOne
    @JoinColumn(name = "tehn_har_katodnogo_zahusty_id")
    private TehnHaraktKatodnogoZahusty tehnHaraktKatodnogoZahusty;

    @Column(name="pidrozdil_name",length = 20)
    private String pidrozdilName;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "gazoprovid_name")
    private GazoprovidName gazoprovidName;

    @Column(name="gazoprovid_km")
    private int kmGazoprovid;

    @Column(name="misto", length = 20)
    private String misto;

    @OneToOne(mappedBy = "passport")
    private ZagalniDani zagalniDani;

    @ManyToOne
    @JoinColumn(name="posadovi_osobu_login")
    private PosadoviOsobu author;

    @Column(name="data_stvorennia")
    private Date dataStvorennia = new Date();

    @OneToOne(mappedBy = "passport")
    private EksplyatazhiinuiKontrol eksplyatazhiinuiKontrol;

    @OneToOne(mappedBy = "passport")
    private PlanovoZapobizhniRobotu planovoZapobizhniRobotu;
    public Passport() {
    }

    public Passport(TehnHaraktKatodnogoZahusty tehnHaraktKatodnogoZahusty, AnodneZazemlennia anodneZazemlennia,NazvuKompanii companyName, NazvuFilii filialName, String pidrozdilName, GazoprovidName gazoprovidName, int kmGazoprovid, String misto, PosadoviOsobu author) {
        this.tehnHaraktKatodnogoZahusty = tehnHaraktKatodnogoZahusty;
        this.anodneZazemlennia = anodneZazemlennia;
        this.companyName = companyName;
        this.filialName = filialName;
        this.pidrozdilName = pidrozdilName;
        this.gazoprovidName = gazoprovidName;
        this.kmGazoprovid = kmGazoprovid;
        this.misto = misto;
        this.author = author;
    }

    public NazvuKompanii getCompanyName() {
        return companyName;
    }

    public void setCompanyName(NazvuKompanii companyName) {
        this.companyName = companyName;
    }

    public NazvuFilii getFilialName() {
        return filialName;
    }

    public void setFilialName(NazvuFilii filialName) {
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

    public ZagalniDani getZagalniDani() {
        return zagalniDani;
    }

    public void setZagalniDani(ZagalniDani zagalniDani) {
        this.zagalniDani = zagalniDani;
    }

    public AnodneZazemlennia getAnodneZazemlennia() {
        return anodneZazemlennia;
    }

    public void setAnodneZazemlennia(AnodneZazemlennia anodneZazemlennia) {
        this.anodneZazemlennia = anodneZazemlennia;
    }

    public TehnHaraktKatodnogoZahusty getTehnHaraktKatodnogoZahusty() {
        return tehnHaraktKatodnogoZahusty;
    }

    public void setTehnHaraktKatodnogoZahusty(TehnHaraktKatodnogoZahusty tehnHaraktKatodnogoZahusty) {
        this.tehnHaraktKatodnogoZahusty = tehnHaraktKatodnogoZahusty;
    }

    public EksplyatazhiinuiKontrol getEksplyatazhiinuiKontrol() {
        return eksplyatazhiinuiKontrol;
    }

    public void setEksplyatazhiinuiKontrol(EksplyatazhiinuiKontrol eksplyatazhiinuiKontrol) {
        this.eksplyatazhiinuiKontrol = eksplyatazhiinuiKontrol;
    }

    public void setDataStvorennia(Date dataStvorennia) {
        this.dataStvorennia = dataStvorennia;
    }

    public PosadoviOsobu getAuthor() {
        return author;
    }

    public void setAuthor(PosadoviOsobu author) {
        this.author = author;
    }

    public Date getDataStvorennia() {
        return dataStvorennia;
    }

    public PlanovoZapobizhniRobotu getPlanovoZapobizhniRobotu() {
        return planovoZapobizhniRobotu;
    }

    public void setPlanovoZapobizhniRobotu(PlanovoZapobizhniRobotu planovoZapobizhniRobotu) {
        this.planovoZapobizhniRobotu = planovoZapobizhniRobotu;
    }
}
