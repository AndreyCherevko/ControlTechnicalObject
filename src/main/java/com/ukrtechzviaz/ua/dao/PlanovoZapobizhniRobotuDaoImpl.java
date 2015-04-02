package com.ukrtechzviaz.ua.dao;

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
    public void create(PlanovoZapobizhniRobotu planovoZapobizhniRobotu) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(planovoZapobizhniRobotu);
        entityManager.getTransaction().commit();
    }

    @Override
    public void update(PlanovoZapobizhniRobotu planovoZapobizhniRobotu) {

    }
}
