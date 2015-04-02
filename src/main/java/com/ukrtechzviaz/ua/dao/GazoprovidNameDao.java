package com.ukrtechzviaz.ua.dao;

import com.ukrtechzviaz.ua.exception.NoSuchGazoprovidNameException;
import com.ukrtechzviaz.ua.model.GazoprovidName;

/**
 * Created by andrey on 01.04.15.
 */
public interface GazoprovidNameDao {

    void create(GazoprovidName name);

    GazoprovidName get(String name) throws NoSuchGazoprovidNameException;
}

