package com.ukrtechzviaz.ua.dao.interfaces;

import com.ukrtechzviaz.ua.model.PlanovoZapobizhniRobotu;

import javax.persistence.EntityManager;

/**
 * Created by andrey on 02.04.15.
 */
public interface PlanovoZapobizhniRobotuDao {

     void create(PlanovoZapobizhniRobotu planovoZapobizhniRobotu, EntityManager entityManager);

     void update(PlanovoZapobizhniRobotu planovoZapobizhniRobotu);
}
