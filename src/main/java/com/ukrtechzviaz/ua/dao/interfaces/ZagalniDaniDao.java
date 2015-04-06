package com.ukrtechzviaz.ua.dao.interfaces;

import com.ukrtechzviaz.ua.model.ZagalniDani;

import javax.persistence.EntityManager;

/**
 * Created by andrey on 02.04.15.
 */
public interface ZagalniDaniDao {

    void create(ZagalniDani zagalniDani, EntityManager entityManager);

    void update(ZagalniDani zagalniDani);
}
