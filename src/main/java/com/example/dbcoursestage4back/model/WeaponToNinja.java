package com.example.dbcoursestage4back.model;

import jakarta.persistence.*;

@Entity
@Table(name = "weapon_to_ninja")
public class WeaponToNinja {
    @EmbeddedId
    private WeaponToNinjaId id;

    @MapsId("ninjaId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ninja_id", nullable = false)
    private Ninja ninja;

    @MapsId("weaponId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "weapon_id", nullable = false)
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Ninja getNinja() {
        return ninja;
    }

    public void setNinja(Ninja ninja) {
        this.ninja = ninja;
    }

    public WeaponToNinjaId getId() {
        return id;
    }

    public void setId(WeaponToNinjaId id) {
        this.id = id;
    }
}