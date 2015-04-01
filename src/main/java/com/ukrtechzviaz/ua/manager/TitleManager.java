package com.ukrtechzviaz.ua.manager;

import com.ukrtechzviaz.ua.model.GazoprovidName;

/**
 * Created by andrey on 01.04.15.
 */

public interface TitleManager {

    public void addTitle(String companyName, String filialName, String pidrozdilName, GazoprovidName gazoprovidName, int diamedrGazoprovodu, int kmGazoprovid, String misto);

    public void changeTitle(String companyName, String filialName, String pidrozdilName, GazoprovidName gazoprovidName, int diamedrGazoprovodu, int kmGazoprovid, String misto);
}
