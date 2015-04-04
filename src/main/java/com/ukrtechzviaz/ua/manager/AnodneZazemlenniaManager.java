package com.ukrtechzviaz.ua.manager;

import com.ukrtechzviaz.ua.model.AnodneZazemlennia;
import com.ukrtechzviaz.ua.model.Passport;

import java.util.Date;
import java.util.List;

/**
 * Created by andrey on 02.04.15.
 */
public interface AnodneZazemlenniaManager {

    AnodneZazemlennia addAnodneZazemlennia(Date dataMontazhu, String typeElectrodiv, String vurobnuk, String kostrnAzs, int ktiElectrodiv, int glibinaZaliaginnia, int vidstanDoGazoprovody, int vidstanDoUkz, int dovzhunaAnodnogoPolia, int opirRoztikannia, int putomuiOpir, String budivelnaOrganizazhia, String prumitku);

    AnodneZazemlennia changeAnodneZazemlennia(Date dataMontazhu, String typeElectrodiv, String vurobnuk, String kostrnAzs, int ktiElectrodiv, int glibinaZaliaginnia, int vidstanDoGazoprovody, int vidstanDoUkz, int dovzhunaAnodnogoPolia, int opirRoztikannia, int putomuiOpir, String budivelnaOrganizazhia, String prumitku);

    List<AnodneZazemlennia> findAll();
}
