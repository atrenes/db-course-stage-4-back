package com.example.dbcoursestage4back.model;

import jakarta.persistence.*;

@Entity
@Table(name = "technique_to_ninja")
public class TechniqueToNinja {
    @EmbeddedId
    private TechniqueToNinjaId id;

    @MapsId("ninjaId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ninja_id", nullable = false)
    private Ninja ninja;

    @MapsId("techniqueId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "technique_id", nullable = false)
    private Technique technique;

    public Technique getTechnique() {
        return technique;
    }

    public void setTechnique(Technique technique) {
        this.technique = technique;
    }

    public Ninja getNinja() {
        return ninja;
    }

    public void setNinja(Ninja ninja) {
        this.ninja = ninja;
    }

    public TechniqueToNinjaId getId() {
        return id;
    }

    public void setId(TechniqueToNinjaId id) {
        this.id = id;
    }
}