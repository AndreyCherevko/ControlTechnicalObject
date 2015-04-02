package com.ukrtechzviaz.ua.dao;

import com.ukrtechzviaz.ua.model.AnodneZazemlennia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created by andrey on 02.04.15.
 */
@Repository
public class AnodneZazemlenniaDaoImpl implements AnodneZazemlenniaDao {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public AnodneZazemlenniaDaoImpl() {
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public void create(AnodneZazemlennia anodneZazemlennia) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(anodneZazemlennia);
        entityManager.getTransaction().commit();
            }

    @Override
    public void update(int id, AnodneZazemlennia anodneZazemlennia) {

    }
}
