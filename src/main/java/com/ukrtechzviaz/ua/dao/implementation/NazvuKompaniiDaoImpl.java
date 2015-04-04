package com.ukrtechzviaz.ua.dao.implementation;

import com.ukrtechzviaz.ua.dao.interfaces.NazVuKompaniiDao;
import com.ukrtechzviaz.ua.model.NazvuKompanii;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 * Created by andrey on 02.04.15.
 */
@Repository
public class NazvuKompaniiDaoImpl implements NazVuKompaniiDao {

    private final String GET="from NazvuKompanii g where g.nazva = :name";

    private final String GET_ALL="from NazvuKompanii";

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public NazvuKompaniiDaoImpl() {
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public NazvuKompanii get(String name) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<NazvuKompanii> gazoprovidName = entityManager.createQuery(GET).setParameter("name",name).getResultList();
        return gazoprovidName.get(0);
    }

    @Override
    public void create(NazvuKompanii name) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(name);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<NazvuKompanii> getAll() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<NazvuKompanii> gazoprovidName = entityManager.createQuery(GET_ALL).getResultList();
        return gazoprovidName;
    }
}
