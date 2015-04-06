package com.ukrtechzviaz.ua.dao.implementation;

import com.ukrtechzviaz.ua.dao.interfaces.EksplyatazhiinuiKontrolDao;
import com.ukrtechzviaz.ua.model.EksplyatazhiinuiKontrol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created by andrey on 02.04.15.
 */
@Repository
public class EksplyatazhiiKontrolDaoImpl implements EksplyatazhiinuiKontrolDao {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public EksplyatazhiiKontrolDaoImpl() {
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }


    @Override
    public void create(EksplyatazhiinuiKontrol eksplyatazhiinuiKontrol, EntityManager entityManager) {
        entityManager.persist(eksplyatazhiinuiKontrol);
    }

    @Override
    public void update(EksplyatazhiinuiKontrol eksplyatazhiinuiKontrol) {

    }
}
