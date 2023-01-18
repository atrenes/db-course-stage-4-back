package com.example.dbcoursestage4back.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "technique_type")
public class TechniqueType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "type", nullable = false)
    private String type;

    @OneToMany(mappedBy = "type")
    private Set<Technique> techniques = new LinkedHashSet<>();

    public Set<Technique> getTechniques() {
        return techniques;
    }

    public void setTechniques(Set<Technique> techniques) {
        this.techniques = techniques;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}