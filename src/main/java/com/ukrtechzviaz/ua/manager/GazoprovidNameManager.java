package com.ukrtechzviaz.ua.manager;

import com.ukrtechzviaz.ua.exception.NoSuchGazoprovidNameException;
import com.ukrtechzviaz.ua.model.GazoprovidName;

/**
 * Created by andrey on 01.04.15.
 */
public interface GazoprovidNameManager {

    void add(String name);

    GazoprovidName find(String name) throws NoSuchGazoprovidNameException;

}
