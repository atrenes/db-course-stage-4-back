package com.example.dbcoursestage4back.model;

import jakarta.persistence.*;

@Entity
@Table(name = "crime_rank")
public class CrimeRank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //TODO Reverse Engineering! Migrate other columns to the entity
}