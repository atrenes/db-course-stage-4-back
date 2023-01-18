package com.example.dbcoursestage4back.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "technique")
public class Technique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clan_id")
    private Clan clan;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "type_id", nullable = false)
    private TechniqueType type;

    @Column(name = "chakra_cost", nullable = false)
    private Integer chakraCost;

    @ManyToMany
    @JoinTable(name = "technique_to_ninja",
            joinColumns = @JoinColumn(name = "technique_id"),
            inverseJoinColumns = @JoinColumn(name = "ninja_id"))
    private Set<Ninja> ninjas = new LinkedHashSet<>();

    public Set<Ninja> getNinjas() {
        return ninjas;
    }

    public void setNinjas(Set<Ninja> ninjas) {
        this.ninjas = ninjas;
    }

    public Integer getChakraCost() {
        return chakraCost;
    }

    public void setChakraCost(Integer chakraCost) {
        this.chakraCost = chakraCost;
    }

    public TechniqueType getType() {
        return type;
    }

    public void setType(TechniqueType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}