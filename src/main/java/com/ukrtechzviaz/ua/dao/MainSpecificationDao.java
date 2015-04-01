package com.ukrtechzviaz.ua.dao;

import com.ukrtechzviaz.ua.exception.NoSuchMainSpecificationException;
import com.ukrtechzviaz.ua.model.MainSpecification;

/**
 * Created by andrey on 01.04.15.
 */
public interface MainSpecificationDao {

    void create(MainSpecification mainSpecification);

    void update(MainSpecification mainSpecification);

    MainSpecification get(int zavodNumber) throws NoSuchMainSpecificationException;
}
