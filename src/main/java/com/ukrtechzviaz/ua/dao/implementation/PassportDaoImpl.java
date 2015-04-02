package com.ukrtechzviaz.ua.dao.implementation;

import com.ukrtechzviaz.ua.dao.interfaces.PassportDao;
import com.ukrtechzviaz.ua.model.Passport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 * Created by andrey on 01.04.15.
 */
@Repository
public class PassportDaoImpl implements PassportDao {

    private final String GET="from Passport p where p.id = :id";

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
    public int create(Passport passport) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(passport);
        entityManager.getTransaction().commit();
        return passport.getId();
    }

    @Override
    public void update(Passport passport) {

    }

    @Override
    public Passport get(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Passport> gazoprovidName = entityManager.createQuery(GET).setParameter("id",id).getResultList();
        return gazoprovidName.get(0);
    }
}
