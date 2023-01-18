package com.example.dbcoursestage4back.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "criminal_group")
public class CriminalGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "crime_num", nullable = false)
    private Integer crimeNum;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToMany(mappedBy = "criminalGroup")
    private Set<Ninja> ninjas = new LinkedHashSet<>();

    public Set<Ninja> getNinjas() {
        return ninjas;
    }

    public void setNinjas(Set<Ninja> ninjas) {
        this.ninjas = ninjas;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCrimeNum() {
        return crimeNum;
    }

    public void setCrimeNum(Integer crimeNum) {
        this.crimeNum = crimeNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}