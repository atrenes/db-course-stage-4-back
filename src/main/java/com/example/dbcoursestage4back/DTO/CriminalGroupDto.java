package com.example.dbcoursestage4back.DTO;

import java.io.Serializable;
import java.util.Objects;

public class CriminalGroupDto implements Serializable {
    private final String name;
    private final Integer crimeNum;
    private final String description;

    public CriminalGroupDto(String name, Integer crimeNum, String description) {
        this.name = name;
        this.crimeNum = crimeNum;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Integer getCrimeNum() {
        return crimeNum;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CriminalGroupDto entity = (CriminalGroupDto) o;
        return Objects.equals(this.name, entity.name) &&
                Objects.equals(this.crimeNum, entity.crimeNum) &&
                Objects.equals(this.description, entity.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, crimeNum, description);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "name = " + name + ", " +
                "crimeNum = " + crimeNum + ", " +
                "description = " + description + ")";
    }
}
