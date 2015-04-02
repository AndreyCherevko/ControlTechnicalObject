package com.ukrtechzviaz.ua.dao.implementation;

import com.ukrtechzviaz.ua.dao.interfaces.PosadovaOsobaDao;
import com.ukrtechzviaz.ua.model.PosadoviOsobu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 * Created by andrey on 02.04.15.
 */
@Repository
public class PosadovaOsobaDaoImpl implements PosadovaOsobaDao {

    private final String GET="from PosadoviOsobu g where g.login = :login and g.password = :pass";

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public PosadovaOsobaDaoImpl() {
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public void create(PosadoviOsobu posadoviOsobu) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(posadoviOsobu);
        entityManager.getTransaction().commit();
    }

    @Override
    public PosadoviOsobu get(String login, String pass) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<PosadoviOsobu> gazoprovidName = entityManager.createQuery(GET).setParameter("login",login).setParameter("pass",pass).getResultList();
        return gazoprovidName.get(0);
    }
}
