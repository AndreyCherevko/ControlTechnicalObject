package com.ukrtechzviaz.ua.dao.interfaces;

import com.ukrtechzviaz.ua.model.EksplyatazhiinuiKontrol;

import javax.persistence.EntityManager;

/**
 * Created by andrey on 02.04.15.
 */
public interface EksplyatazhiinuiKontrolDao {

    void create(EksplyatazhiinuiKontrol eksplyatazhiinuiKontrol, EntityManager entityManager);

    void update(EksplyatazhiinuiKontrol eksplyatazhiinuiKontrol);
}
