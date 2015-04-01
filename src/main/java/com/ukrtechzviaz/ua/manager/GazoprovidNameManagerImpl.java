package com.ukrtechzviaz.ua.manager;

import com.ukrtechzviaz.ua.dao.GazoprovidNameDao;
import com.ukrtechzviaz.ua.exception.NoSuchGazoprovidNameException;
import com.ukrtechzviaz.ua.model.GazoprovidName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by andrey on 01.04.15.
 */
@Service
public class GazoprovidNameManagerImpl implements GazoprovidNameManager {

    @Autowired
    private GazoprovidNameDao gazoprovidNameDao;

    public GazoprovidNameManagerImpl() {
    }

    public void setGazoprovidNameDao(GazoprovidNameDao gazoprovidNameDao) {
        this.gazoprovidNameDao = gazoprovidNameDao;
    }

    public GazoprovidNameDao getGazoprovidNameDao() {
        return gazoprovidNameDao;
    }

    @Override
    public void add(String name) {
            gazoprovidNameDao.create(name);
    }

    @Override
    public GazoprovidName find(String name) throws NoSuchGazoprovidNameException {
        return gazoprovidNameDao.get(name);
    }
}
