package com.ukrtechzviaz.ua.utils;

import com.ukrtechzviaz.ua.dao.interfaces.*;
import com.ukrtechzviaz.ua.exception.BrokenQueuePassportBuilderException;
import com.ukrtechzviaz.ua.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by andrey on 02.04.15.
 */
@Service
public class PassportBuilder {

    @Autowired
    private PassportDao passportDao;
    @Autowired
    private ZagalniDaniDao zagalniDaniDao;

    @Autowired
    private TehnHaraktKatodnogoZahustyDao tehnHaraktKatodnogoZahustyDao;

    @Autowired
    private AnodneZazemlenniaDao anodneZazemlenniaDao;

    @Autowired
    private EksplyatazhiinuiKontrolDao eksplyatazhiinuiKontrolDao;

    @Autowired
    private PlanovoZapobizhniRobotuDao planovoZapobizhniRobotuDao;

    private Passport passport;

    private ZagalniDani zagalniDani;

    private TehnHaraktKatodnogoZahusty tehnHaraktKatodnogoZahusty;

    private AnodneZazemlennia anodneZazemlennia;

    private EksplyatazhiinuiKontrol eksplyatazhiinuiKontrol;

    private PlanovoZapobizhniRobotu planovoZapobizhniRobotu;


    public PassportBuilder() {
    }

    public PassportDao getPassportDao() {
        return passportDao;
    }

    public void setPassportDao(PassportDao passportDao) {
        this.passportDao = passportDao;
    }

    public ZagalniDaniDao getZagalniDaniDao() {
        return zagalniDaniDao;
    }

    public void setZagalniDaniDao(ZagalniDaniDao zagalniDaniDao) {
        this.zagalniDaniDao = zagalniDaniDao;
    }

    public TehnHaraktKatodnogoZahustyDao getTehnHaraktKatodnogoZahustyDao() {
        return tehnHaraktKatodnogoZahustyDao;
    }

    public void setTehnHaraktKatodnogoZahustyDao(TehnHaraktKatodnogoZahustyDao tehnHaraktKatodnogoZahustyDao) {
        this.tehnHaraktKatodnogoZahustyDao = tehnHaraktKatodnogoZahustyDao;
    }

    public AnodneZazemlenniaDao getAnodneZazemlenniaDao() {
        return anodneZazemlenniaDao;
    }

    public void setAnodneZazemlenniaDao(AnodneZazemlenniaDao anodneZazemlenniaDao) {
        this.anodneZazemlenniaDao = anodneZazemlenniaDao;
    }

    public EksplyatazhiinuiKontrolDao getEksplyatazhiinuiKontrolDao() {
        return eksplyatazhiinuiKontrolDao;
    }

    public void setEksplyatazhiinuiKontrolDao(EksplyatazhiinuiKontrolDao eksplyatazhiinuiKontrolDao) {
        this.eksplyatazhiinuiKontrolDao = eksplyatazhiinuiKontrolDao;
    }

    public PlanovoZapobizhniRobotuDao getPlanovoZapobizhniRobotuDao() {
        return planovoZapobizhniRobotuDao;
    }

    public void setPlanovoZapobizhniRobotuDao(PlanovoZapobizhniRobotuDao planovoZapobizhniRobotuDao) {
        this.planovoZapobizhniRobotuDao = planovoZapobizhniRobotuDao;
    }

    public void addPassport(NazvuKompanii companyName, NazvuFilii filialName, String pidrozdilName, GazoprovidName gazoprovidName, int kmGazoprovid, String misto){
        passport = new Passport(companyName, filialName, pidrozdilName, gazoprovidName, kmGazoprovid, misto);
        passportDao.create(passport);
    }

    public void addZagalniDani( TupRemonty protectType, String geografichnaPriviazhka, Date startEcspl, String projectOrganization, String bmOrganization, String zemlekorustyvach) throws BrokenQueuePassportBuilderException {
        if(passport==null)
            throw new BrokenQueuePassportBuilderException();
        zagalniDani = new ZagalniDani(passport,protectType,geografichnaPriviazhka,startEcspl,projectOrganization,bmOrganization,zemlekorustyvach);
        zagalniDaniDao.create(zagalniDani);
    }

    public void addTehnHarKatod(Date dateMontazhu, String typePeretvoriuvacha, String vurobnuk, Date dataVupysky, int numberZavodskii, TupZahusnogoPokruttia typePokruttia, int p, int u, boolean telecontrol, String sposibZahusty, boolean sposibZahustyYes, String typeLichilnuka, int kilkLichilnika, int r, String prumitka) throws BrokenQueuePassportBuilderException {
        if(passport==null)
            throw new BrokenQueuePassportBuilderException();
        tehnHaraktKatodnogoZahusty = new TehnHaraktKatodnogoZahusty(dateMontazhu, typePeretvoriuvacha,  vurobnuk, dataVupysky, numberZavodskii, typePokruttia,  passport,  p, u, telecontrol,sposibZahusty,sposibZahustyYes,typeLichilnuka, kilkLichilnika, r,prumitka);
        tehnHaraktKatodnogoZahustyDao.create(tehnHaraktKatodnogoZahusty);
    }

    public void addAnodneZazemlennia(Date dataMontazhu, String typeElectrodiv, String vurobnuk, String kostrnAzs, int ktiElectrodiv, int glibinaZaliaginnia, int vidstanDoGazoprovody, int vidstanDoUkz, int dovzhunaAnodnogoPolia, int opirRoztikannia, int putomuiOpir, String budivelnaOrganizazhia, String prumitku) throws BrokenQueuePassportBuilderException {
        if(passport==null)
            throw new BrokenQueuePassportBuilderException();
        anodneZazemlennia = new AnodneZazemlennia(passport,dataMontazhu,typeElectrodiv,vurobnuk,kostrnAzs,ktiElectrodiv, glibinaZaliaginnia, vidstanDoGazoprovody,vidstanDoUkz, dovzhunaAnodnogoPolia,opirRoztikannia,putomuiOpir, budivelnaOrganizazhia,prumitku);
        anodneZazemlenniaDao.create(anodneZazemlennia);
    }

    public void addEksplyatKontrol(Date dataKontrol, Date vremiaKontrol, int pochankovaRobotaStrymy, int pochankovaRobotaNaprygu, int pochankoviiPotenzhvklvkl, int pochankoviiPotenzhvklvukl, int vstanovlenuiStrymRobotu, int vstanobleniiRobotaNuprygu, int vstanovlenuiiPotenzhvkl, int vstanovlenuiiPotenzhvukl, int p, int pokazhLIchilnukaChasy, int chasProst, String prumitku) throws BrokenQueuePassportBuilderException {
        if(passport==null)
            throw new BrokenQueuePassportBuilderException();
        eksplyatazhiinuiKontrol = new EksplyatazhiinuiKontrol(passport, dataKontrol,vremiaKontrol,pochankovaRobotaStrymy,pochankovaRobotaNaprygu,pochankoviiPotenzhvklvkl,pochankoviiPotenzhvklvukl,vstanovlenuiStrymRobotu,vstanobleniiRobotaNuprygu,vstanovlenuiiPotenzhvkl,vstanovlenuiiPotenzhvukl,p,pokazhLIchilnukaChasy,chasProst,prumitku);
        eksplyatazhiinuiKontrolDao.create(eksplyatazhiinuiKontrol);
    }

    public void addPlanovoZapobizhniRobotu(Date pochatkovaDataRemonty, Date kinzhevaDataRemonty, TupRemonty type, String opusRobit, int vstanRezhimUkz, int vvimknP, int vvumkP, int anodR, int zahR) throws BrokenQueuePassportBuilderException {
        if(passport==null)
            throw new BrokenQueuePassportBuilderException();
        planovoZapobizhniRobotu = new PlanovoZapobizhniRobotu(passport,pochatkovaDataRemonty,kinzhevaDataRemonty,type,opusRobit,vstanRezhimUkz,vvimknP,vvumkP,anodR,zahR);
        planovoZapobizhniRobotuDao.create(planovoZapobizhniRobotu);
    }



}
