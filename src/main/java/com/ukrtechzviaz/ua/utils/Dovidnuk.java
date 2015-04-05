package com.ukrtechzviaz.ua.utils;

import com.ukrtechzviaz.ua.dao.interfaces.GazoprovidNameDao;
import com.ukrtechzviaz.ua.dao.interfaces.NazVuKompaniiDao;
import com.ukrtechzviaz.ua.dao.interfaces.NazvuFiliiDao;
import com.ukrtechzviaz.ua.exception.NoSuchGazoprovidNameException;
import com.ukrtechzviaz.ua.model.GazoprovidName;
import com.ukrtechzviaz.ua.model.NazvuFilii;
import com.ukrtechzviaz.ua.model.NazvuKompanii;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by andrey on 02.04.15.
 */
@Service
public class Dovidnuk {

    @Autowired
    GazoprovidNameDao gazoprovidNameDao;

    @Autowired
    NazVuKompaniiDao nazVuKompaniiDao;

    @Autowired
    NazvuFiliiDao nazvuFiliiDao;

    public Dovidnuk() {
    }

    public GazoprovidNameDao getGazoprovidNameDao() {
        return gazoprovidNameDao;
    }

    public void setGazoprovidNameDao(GazoprovidNameDao gazoprovidNameDao) {
        this.gazoprovidNameDao = gazoprovidNameDao;
    }

    public NazVuKompaniiDao getNazVuKompaniiDao() {
        return nazVuKompaniiDao;
    }

    public void setNazVuKompaniiDao(NazVuKompaniiDao nazVuKompaniiDao) {
        this.nazVuKompaniiDao = nazVuKompaniiDao;
    }

    public NazvuFiliiDao getNazvuFiliiDao() {
        return nazvuFiliiDao;
    }

    public void setNazvuFiliiDao(NazvuFiliiDao nazvuFiliiDao) {
        this.nazvuFiliiDao = nazvuFiliiDao;
    }

    public List<GazoprovidName> getGazoprovidNames() {
        return gazoprovidNameDao.getAll();
    }

    public GazoprovidName getGazoprovidName(String name)  {
        return gazoprovidNameDao.get(name);
    }

    public NazvuKompanii getNazvuKompanii(String name){
        return nazVuKompaniiDao.get(name);
    }

    public List<NazvuKompanii> getNazvuKompaniis(){
        return nazVuKompaniiDao.getAll();
    }

    public NazvuFilii getNazvuFilii(String name){
        return nazvuFiliiDao.get(name);
    }

    public List<NazvuFilii> getNazvuFiliis(){
        return nazvuFiliiDao.getAll();
    }

    public void addGazoprovidName(String name, int d){
        gazoprovidNameDao.create(new GazoprovidName(name,d));
    }

    public void addNazvuKompaniiName(String name){
        nazVuKompaniiDao.create(new NazvuKompanii(name));
    }

    public void addNazvuFiliiName(String name){
        nazvuFiliiDao.create(new NazvuFilii(name));
    }
}
