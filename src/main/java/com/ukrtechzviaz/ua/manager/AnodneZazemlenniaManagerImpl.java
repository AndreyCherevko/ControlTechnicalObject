package com.ukrtechzviaz.ua.manager;

import com.ukrtechzviaz.ua.dao.AnodneZazemlenniaDao;
import com.ukrtechzviaz.ua.model.AnodneZazemlennia;
import com.ukrtechzviaz.ua.model.OdunutsiaObladnannia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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
    public void addAnodneZazemlennia(int id, Date dataMontazhu, OdunutsiaObladnannia odunutsiaObladnannia, int glibinaZaliaginnia, String budivelnaOrganizazhia, String prumitku) {
        dao.create(new AnodneZazemlennia(id,dataMontazhu,odunutsiaObladnannia,glibinaZaliaginnia,budivelnaOrganizazhia,prumitku));
    }

    @Override
    public void changeAnodneZazemlennia(int id, Date dataMontazhu, OdunutsiaObladnannia odunutsiaObladnannia, int glibinaZaliaginnia, String budivelnaOrganizazhia, String prumitku) {

    }
}
