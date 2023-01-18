package com.example.dbcoursestage4back.model;

import jakarta.persistence.*;

@Entity
@Table(name = "crime_to_ninja")
public class CrimeToNinja {
    @EmbeddedId
    private CrimeToNinjaId id;

    @MapsId("ninjaId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ninja_id", nullable = false)
    private Ninja ninja;

    @MapsId("crimeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "crime_id", nullable = false)
    private Crime crime;

    public Crime getCrime() {
        return crime;
    }

    public void setCrime(Crime crime) {
        this.crime = crime;
    }

    public Ninja getNinja() {
        return ninja;
    }

    public void setNinja(Ninja ninja) {
        this.ninja = ninja;
    }

    public CrimeToNinjaId getId() {
        return id;
    }

    public void setId(CrimeToNinjaId id) {
        this.id = id;
    }
}