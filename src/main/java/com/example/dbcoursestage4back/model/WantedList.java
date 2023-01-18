package com.example.dbcoursestage4back.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "wanted_list")
public class WantedList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "wanted_ninja_id", nullable = false)
    private Ninja wantedNinja;

    @Column(name = "is_captured", nullable = false)
    private Boolean isCaptured = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "executor_ninja_id")
    private Ninja executorNinja;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "date_of_search_start", nullable = false)
    private LocalDate dateOfSearchStart;

    @Column(name = "date_of_capture")
    private LocalDate dateOfCapture;

    public LocalDate getDateOfCapture() {
        return dateOfCapture;
    }

    public void setDateOfCapture(LocalDate dateOfCapture) {
        this.dateOfCapture = dateOfCapture;
    }

    public LocalDate getDateOfSearchStart() {
        return dateOfSearchStart;
    }

    public void setDateOfSearchStart(LocalDate dateOfSearchStart) {
        this.dateOfSearchStart = dateOfSearchStart;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Ninja getExecutorNinja() {
        return executorNinja;
    }

    public void setExecutorNinja(Ninja executorNinja) {
        this.executorNinja = executorNinja;
    }

    public Boolean getIsCaptured() {
        return isCaptured;
    }

    public void setIsCaptured(Boolean isCaptured) {
        this.isCaptured = isCaptured;
    }

    public Ninja getWantedNinja() {
        return wantedNinja;
    }

    public void setWantedNinja(Ninja wantedNinja) {
        this.wantedNinja = wantedNinja;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}