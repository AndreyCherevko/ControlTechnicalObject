package com.ukrtechzviaz.ua.dao;

import com.ukrtechzviaz.ua.model.AnodneZazemlennia;

/**
 * Created by andrey on 02.04.15.
 */
public interface AnodneZazemlenniaDao {

    void create(AnodneZazemlennia anodneZazemlennia);

    void update(int id,AnodneZazemlennia anodneZazemlennia);
}