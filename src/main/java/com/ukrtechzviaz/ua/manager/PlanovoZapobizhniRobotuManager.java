package com.ukrtechzviaz.ua.manager;

import com.ukrtechzviaz.ua.model.PlanovoZapobizhniRobotu;
import com.ukrtechzviaz.ua.model.TupRemonty;

import java.util.Date;

/**
 * Created by andrey on 02.04.15.
 */
public interface PlanovoZapobizhniRobotuManager {

    void add(Date pochatkovaDataRemonty, Date kinzhevaDataRemonty, TupRemonty type, String opusRobit, int vstanRezhimUkz, int vvimknP, int vvumkP, int anodR, int zahR);

    void change(int id, Date pochatkovaDataRemonty, Date kinzhevaDataRemonty, TupRemonty type, String opusRobit, int vstanRezhimUkz, int vvimknP, int vvumkP, int anodR, int zahR);
}
