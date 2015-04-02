package com.ukrtechzviaz.ua.dao;

import com.ukrtechzviaz.ua.model.Passport;

/**
 * Created by andrey on 01.04.15.
 */
public interface PassportDao {

    void create(Passport passport);

    void update(Passport passport);
}
