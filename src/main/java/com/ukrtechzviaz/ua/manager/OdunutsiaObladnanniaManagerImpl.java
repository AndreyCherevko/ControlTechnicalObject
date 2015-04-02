package com.ukrtechzviaz.ua.manager;

import com.ukrtechzviaz.ua.dao.OdunutisaObladnanniaDao;
import com.ukrtechzviaz.ua.model.OdunutsiaObladnannia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by andrey on 02.04.15.
 */
@Service
public class OdunutsiaObladnanniaManagerImpl implements OdunutsiaObladnanniaManager {

    @Autowired
    private OdunutisaObladnanniaDao dao;

    public OdunutsiaObladnanniaManagerImpl() {
    }

    public OdunutisaObladnanniaDao getDao() {
        return dao;
    }

    public void setDao(OdunutisaObladnanniaDao dao) {
        this.dao = dao;
    }

    @Override
    public void add(String tupPeretvoriuvacha, String vurobnuk, int zavodskuiNomer, String konstr_anodnogo_zahusty, int ktElectrodiv, int vidstanGazoprovody, int vidstanDoUKZ, int dovzhunaAnodnogoPolia, int opirRoztikanniy, int putOpirGrynty) {
        dao.create(new OdunutsiaObladnannia(tupPeretvoriuvacha,vurobnuk,zavodskuiNomer,konstr_anodnogo_zahusty,ktElectrodiv,vidstanGazoprovody,vidstanDoUKZ,dovzhunaAnodnogoPolia,opirRoztikanniy,putOpirGrynty));
    }

    @Override
    public void change(int id, String tupPeretvoriuvacha, String vurobnuk, int zavodskuiNomer, String konstr_anodnogo_zahusty, int ktElectrodiv, int vidstanGazoprovody, int vidstanDoUKZ, int dovzhunaAnodnogoPolia, int opirRoztikanniy, int putOpirGrynty) {

    }
}
