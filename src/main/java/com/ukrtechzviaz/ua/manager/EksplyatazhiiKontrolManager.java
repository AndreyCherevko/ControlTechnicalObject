package com.ukrtechzviaz.ua.manager;

import java.util.Date;

/**
 * Created by andrey on 02.04.15.
 */
public interface EksplyatazhiiKontrolManager {

    void add(Date dataKontrol, Date vremiaKontrol, int pochankovaRobotaStrymy, int pochankovaRobotaNaprygu, int pochankoviiPotenzhvklvkl, int pochankoviiPotenzhvklvukl, int vstanovlenuiStrymRobotu, int vstanobleniiRobotaNuprygu, int vstanovlenuiiPotenzhvkl, int vstanovlenuiiPotenzhvukl, int p, int pokazhLIchilnukaChasy, int chasProst, String prumitku);

    void change(int id, Date dataKontrol, Date vremiaKontrol, int pochankovaRobotaStrymy, int pochankovaRobotaNaprygu, int pochankoviiPotenzhvklvkl, int pochankoviiPotenzhvklvukl, int vstanovlenuiStrymRobotu, int vstanobleniiRobotaNuprygu, int vstanovlenuiiPotenzhvkl, int vstanovlenuiiPotenzhvukl, int p, int pokazhLIchilnukaChasy, int chasProst, String prumitku);
}
