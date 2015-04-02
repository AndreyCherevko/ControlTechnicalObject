package com.ukrtechzviaz.ua.manager;

import com.ukrtechzviaz.ua.model.OdunutsiaObladnannia;

import java.util.Date;

/**
 * Created by andrey on 02.04.15.
 */
public interface AnodneZazemlenniaManager {

    void addAnodneZazemlennia(int id, Date dataMontazhu, OdunutsiaObladnannia odunutsiaObladnannia, int glibinaZaliaginnia, String budivelnaOrganizazhia, String prumitku);

    void changeAnodneZazemlennia(int id, Date dataMontazhu, OdunutsiaObladnannia odunutsiaObladnannia, int glibinaZaliaginnia, String budivelnaOrganizazhia, String prumitku);
}
