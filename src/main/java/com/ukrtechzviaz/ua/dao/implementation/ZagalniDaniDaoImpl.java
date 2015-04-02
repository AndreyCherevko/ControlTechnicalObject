package com.ukrtechzviaz.ua.dao.implementation;

import com.ukrtechzviaz.ua.dao.interfaces.ZagalniDaniDao;
import com.ukrtechzviaz.ua.model.ZagalniDani;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created by andrey on 02.04.15.
 */
@Repository
public class ZagalniDaniDaoImpl implements ZagalniDaniDao {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public ZagalniDaniDaoImpl() {
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public void create(ZagalniDani zagalniDani) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(zagalniDani);
        entityManager.getTransaction().commit();
    }

    @Override
    public void update(ZagalniDani zagalniDani) {

    }
}
