package com.ukrtechzviaz.ua.model;

import javax.persistence.*;

/**
 * Created by andrey on 01.04.15.
 * Цей класс описує довідник газопроводів, як сутність БД
 */
@Entity
@Table(name="nazvu_gazoprovodiv")
public class GazoprovidName {

    @Id
    @Column(name="gazoprovid_name")
    private String name;

    public GazoprovidName() {
    }

    public GazoprovidName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
