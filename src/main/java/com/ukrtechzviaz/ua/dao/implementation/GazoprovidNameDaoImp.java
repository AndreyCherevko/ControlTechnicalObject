package com.ukrtechzviaz.ua.dao.implementation;

import com.ukrtechzviaz.ua.dao.interfaces.GazoprovidNameDao;
import com.ukrtechzviaz.ua.exception.NoSuchGazoprovidNameException;
import com.ukrtechzviaz.ua.model.GazoprovidName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 * Created by andrey on 01.04.15.
 */
@Repository
public class GazoprovidNameDaoImp implements GazoprovidNameDao {

    private final String GET="from GazoprovidName g where g.name = :name";
    private final String GET_ALL="from GazoprovidName";

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public GazoprovidNameDaoImp() {
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    @Override
    public void create(GazoprovidName name) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(name);
        entityManager.getTransaction().commit();
    }

    @Override
    public GazoprovidName get(String name) throws NoSuchGazoprovidNameException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<GazoprovidName> gazoprovidName = entityManager.createQuery(GET).setParameter("name",name).getResultList();
        if(gazoprovidName.isEmpty())
            throw new NoSuchGazoprovidNameException();
        return gazoprovidName.get(0);
    }

    @Override
    public List<GazoprovidName> getAll() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<GazoprovidName> gazoprovidName = entityManager.createQuery(GET_ALL).getResultList();
        return gazoprovidName;
    }


}
