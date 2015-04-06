package com.ukrtechzviaz.ua.dto;

import javax.validation.constraints.NotNull;

/**
 * Created by andrey on 05.04.15.
 */
public class PeregliadZvituDto {

    @NotNull
    private int id;

    public PeregliadZvituDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
