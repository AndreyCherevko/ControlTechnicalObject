package com.ukrtechzviaz.ua.manager;

import com.ukrtechzviaz.ua.exception.NoSuchMainSpecificationException;
import com.ukrtechzviaz.ua.model.OdunutsiaObladnannia;
import com.ukrtechzviaz.ua.model.TehnHaraktKatodnogoZahusty;
import com.ukrtechzviaz.ua.model.TupZahusnogoPokruttia;

import java.util.Date;

/**
 * Created by andrey on 01.04.15.
 */
public interface TehnHaraktKatodnogoZahustyManager {

    void add(int id, Date dateMontazhu, OdunutsiaObladnannia odunutsiaObladnannia, Date dataVupysky, TupZahusnogoPokruttia typePokruttia, int p, int u, boolean telecontrol, String sposibZahusty, boolean sposibZahustyYes, String typeLichilnuka, int kilkLichilnika, int r, String prumitka);

    TehnHaraktKatodnogoZahusty find(int numberZavodskii) throws NoSuchMainSpecificationException;
}
