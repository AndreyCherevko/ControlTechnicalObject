package com.ukrtechzviaz.ua.manager;

import com.ukrtechzviaz.ua.dao.TehnHaraktKatodnogoZahustyDao;
import com.ukrtechzviaz.ua.exception.NoSuchMainSpecificationException;
import com.ukrtechzviaz.ua.model.OdunutsiaObladnannia;
import com.ukrtechzviaz.ua.model.TehnHaraktKatodnogoZahusty;
import com.ukrtechzviaz.ua.model.TupZahusnogoPokruttia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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
    public void add(int id, Date dateMontazhu, OdunutsiaObladnannia odunutsiaObladnannia, Date dataVupysky, TupZahusnogoPokruttia typePokruttia, int p, int u, boolean telecontrol, String sposibZahusty, boolean sposibZahustyYes, String typeLichilnuka, int kilkLichilnika, int r, String prumitka) {
        dao.create(new TehnHaraktKatodnogoZahusty(dateMontazhu, odunutsiaObladnannia, dataVupysky, typePokruttia, p, u, telecontrol, sposibZahusty,sposibZahustyYes,typeLichilnuka,kilkLichilnika, r,prumitka));
    }

    @Override
    public TehnHaraktKatodnogoZahusty find(int numberZavodskii) throws NoSuchMainSpecificationException {
        return dao.get(numberZavodskii);
    }
}
