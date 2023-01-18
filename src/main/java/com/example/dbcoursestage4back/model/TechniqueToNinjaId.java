package com.example.dbcoursestage4back.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TechniqueToNinjaId implements Serializable {
    private static final long serialVersionUID = 9119990805354958667L;
    @Column(name = "ninja_id", nullable = false)
    private Integer ninjaId;
    @Column(name = "technique_id", nullable = false)
    private Integer techniqueId;

    public Integer getTechniqueId() {
        return techniqueId;
    }

    public void setTechniqueId(Integer techniqueId) {
        this.techniqueId = techniqueId;
    }

    public Integer getNinjaId() {
        return ninjaId;
    }

    public void setNinjaId(Integer ninjaId) {
        this.ninjaId = ninjaId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(techniqueId, ninjaId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TechniqueToNinjaId entity = (TechniqueToNinjaId) o;
        return Objects.equals(this.techniqueId, entity.techniqueId) &&
                Objects.equals(this.ninjaId, entity.ninjaId);
    }
}