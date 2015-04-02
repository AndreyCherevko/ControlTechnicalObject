package com.ukrtechzviaz.ua.dao;

import com.ukrtechzviaz.ua.model.OdunutsiaObladnannia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created by andrey on 02.04.15.
 */
@Repository
public class OdunutsiaObladnanniaDaopImpl implements OdunutisaObladnanniaDao {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public OdunutsiaObladnanniaDaopImpl() {
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    @Override
    public void create(OdunutsiaObladnannia odunutsiaObladnannia) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(odunutsiaObladnannia);
        entityManager.getTransaction().commit();
    }

    @Override
    public void change(OdunutsiaObladnannia odunutsiaObladnannia) {

    }
}
