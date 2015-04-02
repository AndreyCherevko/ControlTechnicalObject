package com.ukrtechzviaz.ua.dao.interfaces;

import com.ukrtechzviaz.ua.model.NazvuKompanii;

import java.util.List;

/**
 * Created by andrey on 02.04.15.
 */
public interface NazVuKompaniiDao {

    NazvuKompanii get(String name);

    void create(NazvuKompanii name);

    List<NazvuKompanii> getAll();
}
