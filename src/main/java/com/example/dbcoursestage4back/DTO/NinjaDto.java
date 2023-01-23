package com.example.dbcoursestage4back.DTO;

import com.example.dbcoursestage4back.model.*;

import java.io.Serializable;
import java.util.Objects;

public class NinjaDto implements Serializable {
    private final Integer id;
    private final String name;
    private final String clan;
    private final String eye;
    private final String rank;
    private final Integer chakraAmount;
    private final Integer criminalNum;
    private final String criminalGroup;
    private final Boolean isCriminal;
    private final String village;

    public NinjaDto(Integer id, String name, String clan, String eye, String rank, Integer chakraAmount, Integer criminalNum, String criminalGroup, Boolean isCriminal, String village) {
        this.id = id;
        this.name = name;
        this.clan = clan;
        this.eye = eye;
        this.rank = rank;
        this.chakraAmount = chakraAmount;
        this.criminalNum = criminalNum;
        this.criminalGroup = criminalGroup;
        this.isCriminal = isCriminal;
        this.village = village;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClan() {
        return clan;
    }

    public String getEye() {
        return eye;
    }

    public String getRank() {
        return rank;
    }

    public Integer getChakraAmount() {
        return chakraAmount;
    }

    public Integer getCriminalNum() {
        return criminalNum;
    }

    public String getCriminalGroup() {
        return criminalGroup;
    }

    public Boolean getIsCriminal() {
        return isCriminal;
    }

    public String getVillage() {
        return village;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NinjaDto entity = (NinjaDto) o;
        return Objects.equals(this.name, entity.name) &&
                Objects.equals(this.clan, entity.clan) &&
                Objects.equals(this.eye, entity.eye) &&
                Objects.equals(this.rank, entity.rank) &&
                Objects.equals(this.chakraAmount, entity.chakraAmount) &&
                Objects.equals(this.criminalNum, entity.criminalNum) &&
                Objects.equals(this.criminalGroup, entity.criminalGroup) &&
                Objects.equals(this.isCriminal, entity.isCriminal) &&
                Objects.equals(this.village, entity.village);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, clan, eye, rank, chakraAmount, criminalNum, criminalGroup, isCriminal, village);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "name = " + name + ", " +
                "clan = " + clan + ", " +
                "eye = " + eye + ", " +
                "rank = " + rank + ", " +
                "chakraAmount = " + chakraAmount + ", " +
                "criminalNum = " + criminalNum + ", " +
                "criminalGroup = " + criminalGroup + ", " +
                "isCriminal = " + isCriminal + ", " +
                "village = " + village + ")";
    }
}
