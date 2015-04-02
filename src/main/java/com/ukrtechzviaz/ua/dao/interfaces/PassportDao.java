package com.ukrtechzviaz.ua.dao.interfaces;

import com.ukrtechzviaz.ua.model.Passport;

/**
 * Created by andrey on 01.04.15.
 */
public interface PassportDao {

    int create(Passport passport);

    void update(Passport passport);

    Passport get(int id);

}
