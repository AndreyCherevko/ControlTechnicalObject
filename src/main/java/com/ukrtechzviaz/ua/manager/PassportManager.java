package com.ukrtechzviaz.ua.manager;

import com.ukrtechzviaz.ua.model.GazoprovidName;
import com.ukrtechzviaz.ua.model.Passport;

import java.util.List;

/**
 * Created by andrey on 01.04.15.
 */

public interface PassportManager {

    public int addPassport(String companyName, String filialName, String pidrozdilName, GazoprovidName gazoprovidName, int kmGazoprovid, String misto);

    public void changePassport(String companyName, String filialName, String pidrozdilName, GazoprovidName gazoprovidName, int diamedrGazoprovodu, int kmGazoprovid, String misto);

    public Passport find(int id);

    public List<Passport> fintAll();
}
