package com.example.dbcoursestage4back.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CrimeToNinjaId implements Serializable {
    private static final long serialVersionUID = 7218770027401667458L;
    @Column(name = "ninja_id", nullable = false)
    private Integer ninjaId;
    @Column(name = "crime_id", nullable = false)
    private Integer crimeId;

    public Integer getCrimeId() {
        return crimeId;
    }

    public void setCrimeId(Integer crimeId) {
        this.crimeId = crimeId;
    }

    public Integer getNinjaId() {
        return ninjaId;
    }

    public void setNinjaId(Integer ninjaId) {
        this.ninjaId = ninjaId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(crimeId, ninjaId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CrimeToNinjaId entity = (CrimeToNinjaId) o;
        return Objects.equals(this.crimeId, entity.crimeId) &&
                Objects.equals(this.ninjaId, entity.ninjaId);
    }
}