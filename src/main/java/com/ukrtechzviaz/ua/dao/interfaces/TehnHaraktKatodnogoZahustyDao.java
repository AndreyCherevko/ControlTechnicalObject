package com.ukrtechzviaz.ua.dao.interfaces;

import com.ukrtechzviaz.ua.exception.NoSuchMainSpecificationException;
import com.ukrtechzviaz.ua.model.TehnHaraktKatodnogoZahusty;

/**
 * Created by andrey on 01.04.15.
 */
public interface TehnHaraktKatodnogoZahustyDao {

    void create(TehnHaraktKatodnogoZahusty tehnHaraktKatodnogoZahusty);

    void update(TehnHaraktKatodnogoZahusty tehnHaraktKatodnogoZahusty);

    TehnHaraktKatodnogoZahusty get(int zavodNumber) throws NoSuchMainSpecificationException;
}
