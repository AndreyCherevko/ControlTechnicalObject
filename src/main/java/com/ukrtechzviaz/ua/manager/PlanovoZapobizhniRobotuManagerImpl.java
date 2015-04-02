package com.ukrtechzviaz.ua.manager;

import com.ukrtechzviaz.ua.dao.PlanovoZapobizhniRobotuDao;
import com.ukrtechzviaz.ua.model.PlanovoZapobizhniRobotu;
import com.ukrtechzviaz.ua.model.TupRemonty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by andrey on 02.04.15.
 */
@Service
public class PlanovoZapobizhniRobotuManagerImpl implements PlanovoZapobizhniRobotuManager {

    @Autowired
    private PlanovoZapobizhniRobotuDao dao;

    public PlanovoZapobizhniRobotuManagerImpl() {
    }

    public PlanovoZapobizhniRobotuDao getDao() {
        return dao;
    }

    public void setDao(PlanovoZapobizhniRobotuDao dao) {
        this.dao = dao;
    }


    @Override
    public void add(Date pochatkovaDataRemonty, Date kinzhevaDataRemonty, TupRemonty type, String opusRobit, int vstanRezhimUkz, int vvimknP, int vvumkP, int anodR, int zahR) {
        dao.create(new PlanovoZapobizhniRobotu(pochatkovaDataRemonty,kinzhevaDataRemonty,type,opusRobit,vstanRezhimUkz,vvimknP,vvumkP,anodR,zahR));
    }

    @Override
    public void change(int id, Date pochatkovaDataRemonty, Date kinzhevaDataRemonty, TupRemonty type, String opusRobit, int vstanRezhimUkz, int vvimknP, int vvumkP, int anodR, int zahR) {

    }
}
