package com.ukrtechzviaz.ua.utils;

import com.ukrtechzviaz.ua.dao.interfaces.PosadovaOsobaDao;
import com.ukrtechzviaz.ua.model.PosadoviOsobu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by andrey on 02.04.15.
 */
@Service
public class AccessChecker {

    @Autowired
    private PosadovaOsobaDao dao;

    public AccessChecker() {
    }

    public PosadovaOsobaDao getDao() {
        return dao;
    }

    public void setDao(PosadovaOsobaDao dao) {
        this.dao = dao;
    }

    public boolean accessVvedenniaTehnichnuxObectiv(String login,String pass){
        PosadoviOsobu posadoviOsobu = dao.get(login, pass);
        return posadoviOsobu.isVvedennia();
    }

    public boolean accessZvitnist(String login,String pass){
        PosadoviOsobu posadoviOsobu = dao.get(login, pass);
        return posadoviOsobu.isZvitnist();
    }
}
