package com.ukrtechzviaz.ua.manager;

import com.ukrtechzviaz.ua.dao.interfaces.TehnHaraktKatodnogoZahustyDao;
import com.ukrtechzviaz.ua.exception.NoSuchMainSpecificationException;
import com.ukrtechzviaz.ua.model.TehnHaraktKatodnogoZahusty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by andrey on 01.04.15.
 */
@Service
public class TehnHaraktKatodnogoZahustyManagerImpl implements TehnHaraktKatodnogoZahustyManager {

    @Autowired
    private TehnHaraktKatodnogoZahustyDao dao;

    public TehnHaraktKatodnogoZahustyManagerImpl() {
    }

    public TehnHaraktKatodnogoZahustyDao getDao() {
        return dao;
    }

    public void setDao(TehnHaraktKatodnogoZahustyDao dao) {
        this.dao = dao;
    }

    @Override
    public TehnHaraktKatodnogoZahusty add(Date dateMontazhu, String typePeretvoriuvacha, String vurobnuk, Date dataVupysky, int numberZavodskii, String typePokruttia, int p, int u, boolean telecontrol, String sposibZahusty, String typeLichilnuka, int kilkLichilnika, int r, String prumitka,int A) {
        TehnHaraktKatodnogoZahusty tehnHaraktKatodnogoZahusty = new TehnHaraktKatodnogoZahusty(dateMontazhu,typePeretvoriuvacha,vurobnuk, dataVupysky,numberZavodskii, typePokruttia, p,u, telecontrol,sposibZahusty ,typeLichilnuka,kilkLichilnika, r,prumitka,A);
        dao.create(tehnHaraktKatodnogoZahusty);
        return tehnHaraktKatodnogoZahusty;
    }

    @Override
    public TehnHaraktKatodnogoZahusty find(int numberZavodskii) throws NoSuchMainSpecificationException {
        return dao.get(numberZavodskii);
    }

    @Override
    public List<TehnHaraktKatodnogoZahusty> findAll() {
        return dao.getAll();
    }
}
