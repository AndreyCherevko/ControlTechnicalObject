package com.ukrtechzviaz.ua.dao;

import com.ukrtechzviaz.ua.model.GazoprovidName;
import com.ukrtechzviaz.ua.model.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created by andrey on 01.04.15.
 */
@Repository
public class TitleDaoImpl implements TitleDao {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public TitleDaoImpl() {
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    @Override
    public void create(Title title) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(title);
        entityManager.getTransaction().commit();
    }

    @Override
    public void update(Title title) {

    }
}
