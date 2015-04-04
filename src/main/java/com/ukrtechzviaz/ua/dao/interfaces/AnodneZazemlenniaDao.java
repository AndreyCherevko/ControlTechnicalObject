package com.ukrtechzviaz.ua.dao.interfaces;

import com.ukrtechzviaz.ua.model.AnodneZazemlennia;

import java.util.List;

/**
 * Created by andrey on 02.04.15.
 */
public interface AnodneZazemlenniaDao {

    void create(AnodneZazemlennia anodneZazemlennia);

    void update(int id,AnodneZazemlennia anodneZazemlennia);

    List<AnodneZazemlennia> getAll();
}
