package com.ukrtechzviaz.ua.manager;

import com.ukrtechzviaz.ua.dao.TitleDao;
import com.ukrtechzviaz.ua.model.GazoprovidName;
import com.ukrtechzviaz.ua.model.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by andrey on 01.04.15.
 */
@Service
public class TitleManagerImpl implements TitleManager {

    @Autowired
    private TitleDao dao;

    public TitleManagerImpl() {
    }

    public TitleDao getDao() {
        return dao;
    }

    public void setDao(TitleDao dao) {
        this.dao = dao;
    }

    @Override
    public void addTitle(String companyName, String filialName, String pidrozdilName, GazoprovidName gazoprovidName, int diamedrGazoprovodu, int kmGazoprovid, String misto) {
        dao.create(new Title(companyName,filialName,pidrozdilName,gazoprovidName,diamedrGazoprovodu,kmGazoprovid,misto));
    }

    @Override
    public void changeTitle(String companyName, String filialName, String pidrozdilName, GazoprovidName gazoprovidName, int diamedrGazoprovodu, int kmGazoprovid, String misto) {

    }
}
