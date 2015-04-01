package com.ukrtechzviaz.ua.manager;

import com.ukrtechzviaz.ua.exception.NoSuchMainSpecificationException;
import com.ukrtechzviaz.ua.model.MainSpecification;
import com.ukrtechzviaz.ua.model.ProtectTypeCovering;

import java.util.Date;

/**
 * Created by andrey on 01.04.15.
 */
public interface MainSpecificationManager {

    void add(Date dateMontazhu, String typePeretvoriuvacha, String vurobnuk, Date dateVupysky, int numberZavodskii, ProtectTypeCovering typePokruttia, int p, int u, boolean telecontrol, String sposibZahusty, boolean sposibZahustyYes, String typeLichilnuka, int kilkLichilnika, int r, String prumitka);

    MainSpecification find(int numberZavodskii) throws NoSuchMainSpecificationException;
}
