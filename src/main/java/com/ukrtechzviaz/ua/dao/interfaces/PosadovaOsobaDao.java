package com.ukrtechzviaz.ua.dao.interfaces;

import com.ukrtechzviaz.ua.model.PosadoviOsobu;

/**
 * Created by andrey on 02.04.15.
 */
public interface PosadovaOsobaDao {

    void create(PosadoviOsobu posadoviOsobu);

    PosadoviOsobu get(String login,String pass);

}
