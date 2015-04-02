package com.ukrtechzviaz.ua.model;

import com.ukrtechzviaz.ua.dao.EksplyatazhiinuiKontrolDao;
import com.ukrtechzviaz.ua.manager.EksplyatazhiiKontrolManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by andrey on 02.04.15.
 */
@Service
public class EksplyatazhiiKontrolManagerImpl implements EksplyatazhiiKontrolManager {

    @Autowired
    private  EksplyatazhiinuiKontrolDao dao;

    public EksplyatazhiiKontrolManagerImpl() {
    }

    public EksplyatazhiinuiKontrolDao getDao() {
        return dao;
    }

    public void setDao(EksplyatazhiinuiKontrolDao dao) {
        this.dao = dao;
    }

    @Override
    public void add(Date dataKontrol, Date vremiaKontrol, int pochankovaRobotaStrymy, int pochankovaRobotaNaprygu, int pochankoviiPotenzhvklvkl, int pochankoviiPotenzhvklvukl, int vstanovlenuiStrymRobotu, int vstanobleniiRobotaNuprygu, int vstanovlenuiiPotenzhvkl, int vstanovlenuiiPotenzhvukl, int p, int pokazhLIchilnukaChasy, int chasProst, String prumitku) {
        dao.create(new EksplyatazhiinuiKontrol(dataKontrol,vremiaKontrol,pochankovaRobotaStrymy,pochankovaRobotaNaprygu,pochankoviiPotenzhvklvkl,pochankoviiPotenzhvklvukl,vstanovlenuiStrymRobotu,vstanobleniiRobotaNuprygu,vstanovlenuiiPotenzhvkl,vstanovlenuiiPotenzhvukl,p,pokazhLIchilnukaChasy,chasProst,prumitku));
    }

    @Override
    public void change(int id, Date dataKontrol, Date vremiaKontrol, int pochankovaRobotaStrymy, int pochankovaRobotaNaprygu, int pochankoviiPotenzhvklvkl, int pochankoviiPotenzhvklvukl, int vstanovlenuiStrymRobotu, int vstanobleniiRobotaNuprygu, int vstanovlenuiiPotenzhvkl, int vstanovlenuiiPotenzhvukl, int p, int pokazhLIchilnukaChasy, int chasProst, String prumitku) {

    }
}
