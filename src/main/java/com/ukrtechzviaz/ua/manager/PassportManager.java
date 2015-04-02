package com.ukrtechzviaz.ua.manager;

import com.ukrtechzviaz.ua.model.GazoprovidName;

/**
 * Created by andrey on 01.04.15.
 */

public interface PassportManager {

    public void addPassport(String companyName, String filialName, String pidrozdilName, GazoprovidName gazoprovidName, int kmGazoprovid, String misto);

    public void changePassport(String companyName, String filialName, String pidrozdilName, GazoprovidName gazoprovidName, int diamedrGazoprovodu, int kmGazoprovid, String misto);
}
