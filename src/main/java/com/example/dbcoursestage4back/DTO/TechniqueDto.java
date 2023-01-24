package com.example.dbcoursestage4back.DTO;

import java.io.Serializable;
import java.util.Objects;

public class TechniqueDto implements Serializable {
    private final Integer id;
    private final String clanName;
    private final String name;
    private final String typeType;
    private final Integer chakraCost;

    public TechniqueDto(Integer id, String clanName, String name, String typeType, Integer chakraCost) {
        this.id = id;
        this.clanName = clanName;
        this.name = name;
        this.typeType = typeType;
        this.chakraCost = chakraCost;
    }

    public Integer getId() {
        return id;
    }

    public String getClanName() {
        return clanName;
    }

    public String getName() {
        return name;
    }

    public String getTypeType() {
        return typeType;
    }

    public Integer getChakraCost() {
        return chakraCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TechniqueDto entity = (TechniqueDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.clanName, entity.clanName) &&
                Objects.equals(this.name, entity.name) &&
                Objects.equals(this.typeType, entity.typeType) &&
                Objects.equals(this.chakraCost, entity.chakraCost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clanName, name, typeType, chakraCost);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "clanName = " + clanName + ", " +
                "name = " + name + ", " +
                "typeType = " + typeType + ", " +
                "chakraCost = " + chakraCost + ")";
    }
}
