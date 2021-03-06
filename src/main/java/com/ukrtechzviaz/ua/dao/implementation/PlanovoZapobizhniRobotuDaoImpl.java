package com.ukrtechzviaz.ua.dao.implementation;

import com.ukrtechzviaz.ua.dao.interfaces.PlanovoZapobizhniRobotuDao;
import com.ukrtechzviaz.ua.model.PlanovoZapobizhniRobotu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created by andrey on 02.04.15.
 */
@Repository
public class PlanovoZapobizhniRobotuDaoImpl implements PlanovoZapobizhniRobotuDao {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public PlanovoZapobizhniRobotuDaoImpl() {
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public void create(PlanovoZapobizhniRobotu planovoZapobizhniRobotu, EntityManager entityManager) {
        entityManager.persist(planovoZapobizhniRobotu);
    }

    @Override
    public void update(PlanovoZapobizhniRobotu planovoZapobizhniRobotu) {

    }
}
