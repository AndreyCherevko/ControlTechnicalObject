package com.ukrtechzviaz.ua.dao.implementation;

import com.ukrtechzviaz.ua.dao.interfaces.TehnHaraktKatodnogoZahustyDao;
import com.ukrtechzviaz.ua.exception.NoSuchMainSpecificationException;
import com.ukrtechzviaz.ua.model.TehnHaraktKatodnogoZahusty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 * Created by andrey on 01.04.15.
 */
@Repository
public class TehnHaraktKatodnogoZahustyDaoImpl implements TehnHaraktKatodnogoZahustyDao {

    private final String GET="from TehnHaraktKatodnogoZahusty";
    private final String GET_ALL="from TehnHaraktKatodnogoZahusty";
    private final String GET_ID="from TehnHaraktKatodnogoZahusty t where t.id= :id";

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public TehnHaraktKatodnogoZahustyDaoImpl() {
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public void create(TehnHaraktKatodnogoZahusty tehnHaraktKatodnogoZahusty) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(tehnHaraktKatodnogoZahusty);
        entityManager.getTransaction().commit();
    }

    @Override
    public void update(TehnHaraktKatodnogoZahusty tehnHaraktKatodnogoZahusty) {

    }

    @Override
    public TehnHaraktKatodnogoZahusty get(int zavodNumber) throws NoSuchMainSpecificationException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<TehnHaraktKatodnogoZahusty> mainSpecName = entityManager.createQuery(GET).getResultList();
        if(mainSpecName.isEmpty())
            throw new NoSuchMainSpecificationException();
        return mainSpecName.get(0);
    }

    @Override
    public List<TehnHaraktKatodnogoZahusty> getAll() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<TehnHaraktKatodnogoZahusty> mainSpecName = entityManager.createQuery(GET_ALL).getResultList();
        return mainSpecName;
    }

    @Override
    public TehnHaraktKatodnogoZahusty fint(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<TehnHaraktKatodnogoZahusty> mainSpecName = entityManager.createQuery(GET_ID).setParameter("id",id).getResultList();
        return mainSpecName.get(0);
    }
}
