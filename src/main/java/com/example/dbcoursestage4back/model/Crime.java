package com.example.dbcoursestage4back.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "crime")
public class Crime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "date_of_crime", nullable = false)
    private String dateOfCrime;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "crime_rank_id", nullable = false)
    private CrimeRank crimeRank;

    @ManyToMany
    @JoinTable(name = "crime_to_ninja",
            joinColumns = @JoinColumn(name = "crime_id"),
            inverseJoinColumns = @JoinColumn(name = "ninja_id"))
    private Set<Ninja> ninjas = new LinkedHashSet<>();

    public Set<Ninja> getNinjas() {
        return ninjas;
    }

    public void setNinjas(Set<Ninja> ninjas) {
        this.ninjas = ninjas;
    }

    public CrimeRank getCrimeRank() {
        return crimeRank;
    }

    public void setCrimeRank(CrimeRank crimeRank) {
        this.crimeRank = crimeRank;
    }

    public String getDateOfCrime() {
        return dateOfCrime;
    }

    public void setDateOfCrime(String dateOfCrime) {
        this.dateOfCrime = dateOfCrime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}