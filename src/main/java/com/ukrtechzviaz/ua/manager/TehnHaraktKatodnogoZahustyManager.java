package com.ukrtechzviaz.ua.manager;

import com.ukrtechzviaz.ua.exception.NoSuchMainSpecificationException;
import com.ukrtechzviaz.ua.model.TehnHaraktKatodnogoZahusty;

import java.util.Date;
import java.util.List;

/**
 * Created by andrey on 01.04.15.
 */
public interface TehnHaraktKatodnogoZahustyManager {

    TehnHaraktKatodnogoZahusty add(Date dateMontazhu, String typePeretvoriuvacha, String vurobnuk, Date dataVupysky, int numberZavodskii, String typePokruttia, int p, int u, boolean telecontrol, String sposibZahustyYes, String typeLichilnuka, int kilkLichilnika, int r, String prumitka, int A);

    TehnHaraktKatodnogoZahusty find(int numberZavodskii) throws NoSuchMainSpecificationException;

    List<TehnHaraktKatodnogoZahusty> findAll();
}
