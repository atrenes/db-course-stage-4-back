package com.example.dbcoursestage4back.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "eyes")
public class Eye {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "type", nullable = false)
    private String type;

    @OneToMany(mappedBy = "eye")
    private Set<Ninja> ninjas = new LinkedHashSet<>();

    public Set<Ninja> getNinjas() {
        return ninjas;
    }

    public void setNinjas(Set<Ninja> ninjas) {
        this.ninjas = ninjas;
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