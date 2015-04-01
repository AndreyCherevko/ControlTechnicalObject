package com.ukrtechzviaz.ua.dao;

import com.ukrtechzviaz.ua.exception.NoSuchGazoprovidNameException;
import com.ukrtechzviaz.ua.exception.NoSuchMainSpecificationException;
import com.ukrtechzviaz.ua.model.GazoprovidName;
import com.ukrtechzviaz.ua.model.MainSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 * Created by andrey on 01.04.15.
 */
@Repository
public class MainSpecificationDaoImpl implements MainSpecificationDao {

    private final String GET="from MainSpecification g where g.numberZavodskii = :number";
    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public MainSpecificationDaoImpl() {
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public void create(MainSpecification mainSpecification) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(mainSpecification);
        entityManager.getTransaction().commit();
    }

    @Override
    public void update(MainSpecification mainSpecification) {

    }

    @Override
    public MainSpecification get(int zavodNumber) throws NoSuchMainSpecificationException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<MainSpecification> mainSpecName = entityManager.createQuery(GET).setParameter("number",zavodNumber).getResultList();
        if(mainSpecName.isEmpty())
            throw new NoSuchMainSpecificationException();
        return mainSpecName.get(0);
    }
}
