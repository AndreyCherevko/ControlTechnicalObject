package com.ukrtechzviaz.ua.manager;

import com.ukrtechzviaz.ua.dao.PassportDao;
import com.ukrtechzviaz.ua.model.GazoprovidName;
import com.ukrtechzviaz.ua.model.Passport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by andrey on 01.04.15.
 */
@Service
public class PassportManagerImpl implements PassportManager {

    @Autowired
    private PassportDao dao;


    public PassportDao getDao() {
        return dao;
    }

    public void setDao(PassportDao dao) {
        this.dao = dao;
    }

    @Override
    public void addPassport(String companyName, String filialName, String pidrozdilName, GazoprovidName gazoprovidName, int kmGazoprovid, String misto) {
        dao.create(new Passport(companyName,filialName,pidrozdilName,gazoprovidName,kmGazoprovid,misto));
    }

    @Override
    public void changePassport(String companyName, String filialName, String pidrozdilName, GazoprovidName gazoprovidName, int diamedrGazoprovodu, int kmGazoprovid, String misto) {

    }
}
