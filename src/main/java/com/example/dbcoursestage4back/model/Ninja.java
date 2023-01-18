package com.example.dbcoursestage4back.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ninja")
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "clan_id", nullable = false)
    private Clan clan;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "eye_id", nullable = false)
    private Eye eye;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "rank_id", nullable = false)
    private NinjaRank rank;

    @Column(name = "chakra_amount")
    private Integer chakraAmount;

    @Column(name = "criminal_num")
    private Integer criminalNum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "criminal_group_id")
    private CriminalGroup criminalGroup;

    @Column(name = "is_criminal", nullable = false)
    private Boolean isCriminal = false;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "village_id", nullable = false)
    private Village village;

    public Village getVillage() {
        return village;
    }

    public void setVillage(Village village) {
        this.village = village;
    }

    public Boolean getIsCriminal() {
        return isCriminal;
    }

    public void setIsCriminal(Boolean isCriminal) {
        this.isCriminal = isCriminal;
    }

    public CriminalGroup getCriminalGroup() {
        return criminalGroup;
    }

    public void setCriminalGroup(CriminalGroup criminalGroup) {
        this.criminalGroup = criminalGroup;
    }

    public Integer getCriminalNum() {
        return criminalNum;
    }

    public void setCriminalNum(Integer criminalNum) {
        this.criminalNum = criminalNum;
    }

    public Integer getChakraAmount() {
        return chakraAmount;
    }

    public void setChakraAmount(Integer chakraAmount) {
        this.chakraAmount = chakraAmount;
    }

    public NinjaRank getRank() {
        return rank;
    }

    public void setRank(NinjaRank rank) {
        this.rank = rank;
    }

    public Eye getEye() {
        return eye;
    }

    public void setEye(Eye eye) {
        this.eye = eye;
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
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