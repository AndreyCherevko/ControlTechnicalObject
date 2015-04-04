package com.ukrtechzviaz.ua.manager;

import com.ukrtechzviaz.ua.dao.interfaces.AnodneZazemlenniaDao;
import com.ukrtechzviaz.ua.model.AnodneZazemlennia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by andrey on 02.04.15.
 */
@Service
public class AnodneZazemlenniaManagerImpl implements AnodneZazemlenniaManager {

    @Autowired
    private AnodneZazemlenniaDao dao;

    public AnodneZazemlenniaManagerImpl() {
    }

    public void setDao(AnodneZazemlenniaDao dao) {
        this.dao = dao;
    }

    @Override
    public AnodneZazemlennia addAnodneZazemlennia(Date dataMontazhu, String typeElectrodiv, String vurobnuk, String kostrnAzs, int ktiElectrodiv, int glibinaZaliaginnia, int vidstanDoGazoprovody, int vidstanDoUkz, int dovzhunaAnodnogoPolia, int opirRoztikannia, int putomuiOpir, String budivelnaOrganizazhia, String prumitku) {
        AnodneZazemlennia anodneZazemlennia = new AnodneZazemlennia(dataMontazhu, typeElectrodiv, vurobnuk, kostrnAzs,ktiElectrodiv,glibinaZaliaginnia, vidstanDoGazoprovody, vidstanDoUkz,dovzhunaAnodnogoPolia,opirRoztikannia,putomuiOpir,budivelnaOrganizazhia,prumitku);
        dao.create(anodneZazemlennia);
        return anodneZazemlennia;
    }

    @Override
    public AnodneZazemlennia changeAnodneZazemlennia(Date dataMontazhu, String typeElectrodiv, String vurobnuk, String kostrnAzs, int ktiElectrodiv, int glibinaZaliaginnia, int vidstanDoGazoprovody, int vidstanDoUkz, int dovzhunaAnodnogoPolia, int opirRoztikannia, int putomuiOpir, String budivelnaOrganizazhia, String prumitku) {
        return null;
    }

    @Override
    public List<AnodneZazemlennia> findAll() {
        return dao.getAll();
    }
}
