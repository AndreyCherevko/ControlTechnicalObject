package com.ukrtechzviaz.ua.dao.interfaces;

import com.ukrtechzviaz.ua.model.NazvuFilii;

import java.util.List;

/**
 * Created by andrey on 02.04.15.
 */
public interface NazvuFiliiDao {

   NazvuFilii get(String name);

    void create(NazvuFilii name);

    List<NazvuFilii> getAll();
}
