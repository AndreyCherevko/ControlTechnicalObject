package com.ukrtechzviaz.ua.dao;

import com.ukrtechzviaz.ua.model.Passport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created by andrey on 01.04.15.
 */
@Repository
public class PassportDaoImpl implements PassportDao {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public PassportDaoImpl() {
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    @Override
    public void create(Passport passport) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(passport);
        entityManager.getTransaction().commit();
    }

    @Override
    public void update(Passport passport) {

    }
}
