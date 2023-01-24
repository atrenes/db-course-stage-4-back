package com.example.dbcoursestage4back.DTO;

import java.io.Serializable;

public class DescriptionDto implements Serializable {
    private final Integer id;
    private final String description;

    public DescriptionDto(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {return this.id;}

    public String getDescription() {return this.description;}
}
