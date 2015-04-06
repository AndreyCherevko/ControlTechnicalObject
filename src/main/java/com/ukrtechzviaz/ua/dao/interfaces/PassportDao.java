package com.ukrtechzviaz.ua.dao.interfaces;

import com.ukrtechzviaz.ua.model.Passport;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by andrey on 01.04.15.
 */
public interface PassportDao {

    int create(Passport passport, EntityManager entityManager);

    void update(Passport passport);

    Passport get(int id);

    List<Passport> getAll();

}
