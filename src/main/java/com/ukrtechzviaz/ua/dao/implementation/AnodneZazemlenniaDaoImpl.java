package com.ukrtechzviaz.ua.dao.implementation;

import com.ukrtechzviaz.ua.dao.interfaces.AnodneZazemlenniaDao;
import com.ukrtechzviaz.ua.model.AnodneZazemlennia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 * Created by andrey on 02.04.15.
 */
@Repository
public class
        AnodneZazemlenniaDaoImpl implements AnodneZazemlenniaDao {

    private final String GET_ALL="from AnodneZazemlennia";


    private final String GET_ID="from AnodneZazemlennia a where a.id = :id";

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

    @Override
    public List<AnodneZazemlennia> getAll() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<AnodneZazemlennia> gazoprovidName = entityManager.createQuery(GET_ALL).getResultList();
        return gazoprovidName;
    }

    @Override
    public AnodneZazemlennia find(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<AnodneZazemlennia> gazoprovidName = entityManager.createQuery(GET_ID).setParameter("id",id).getResultList();
        return gazoprovidName.get(0);
    }
}
