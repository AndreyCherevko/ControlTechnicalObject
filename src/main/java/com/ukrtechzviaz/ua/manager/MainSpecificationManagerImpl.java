package com.ukrtechzviaz.ua.manager;

import com.ukrtechzviaz.ua.dao.MainSpecificationDao;
import com.ukrtechzviaz.ua.exception.NoSuchMainSpecificationException;
import com.ukrtechzviaz.ua.model.MainSpecification;
import com.ukrtechzviaz.ua.model.ProtectTypeCovering;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by andrey on 01.04.15.
 */
@Service
public class MainSpecificationManagerImpl implements MainSpecificationManager {

    @Autowired
    private MainSpecificationDao dao;

    public MainSpecificationManagerImpl() {
    }

    public MainSpecificationDao getDao() {
        return dao;
    }

    public void setDao(MainSpecificationDao dao) {
        this.dao = dao;
    }

    @Override
    public void add(Date dateMontazhu, String typePeretvoriuvacha, String vurobnuk, Date dateVupysky, int numberZavodskii, ProtectTypeCovering typePokruttia, int p, int u, boolean telecontrol, String sposibZahusty, boolean sposibZahustyYes, String typeLichilnuka, int kilkLichilnika, int r, String prumitka) {
        dao.create(new MainSpecification(dateMontazhu,typePeretvoriuvacha,vurobnuk,dateVupysky,numberZavodskii,typePokruttia,p,u,telecontrol,sposibZahusty,sposibZahustyYes,typeLichilnuka,kilkLichilnika,r,prumitka));
    }

    @Override
    public MainSpecification find(int numberZavodskii) throws NoSuchMainSpecificationException {
        return dao.get(numberZavodskii);
    }
}
