package com.ukrtechzviaz.ua.dao.implementation;

import com.ukrtechzviaz.ua.dao.interfaces.NazvuFiliiDao;
import com.ukrtechzviaz.ua.model.NazvuFilii;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 * Created by andrey on 02.04.15.
 */
@Repository
public class NazvuFiliiDaoImpl implements NazvuFiliiDao {

    private final String GET="from NazvuFilii g where g.nazva = :name";

    private final String GET_ALL="from NazvuFilii";

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
        public NazvuFilii get(String name) {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            List<NazvuFilii> gazoprovidName = entityManager.createQuery(GET).setParameter("name",name).getResultList();
            return gazoprovidName.get(0);
        }

    @Override
    public void create(NazvuFilii name) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(name);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<NazvuFilii> getAll() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<NazvuFilii> gazoprovidName = entityManager.createQuery(GET_ALL).getResultList();
        return gazoprovidName;
    }
}

