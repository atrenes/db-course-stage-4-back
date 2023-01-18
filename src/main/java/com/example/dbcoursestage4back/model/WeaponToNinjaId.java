package com.example.dbcoursestage4back.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class WeaponToNinjaId implements Serializable {
    private static final long serialVersionUID = 2055980878822574728L;
    @Column(name = "ninja_id", nullable = false)
    private Integer ninjaId;
    @Column(name = "weapon_id", nullable = false)
    private Integer weaponId;

    public Integer getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(Integer weaponId) {
        this.weaponId = weaponId;
    }

    public Integer getNinjaId() {
        return ninjaId;
    }

    public void setNinjaId(Integer ninjaId) {
        this.ninjaId = ninjaId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weaponId, ninjaId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        WeaponToNinjaId entity = (WeaponToNinjaId) o;
        return Objects.equals(this.weaponId, entity.weaponId) &&
                Objects.equals(this.ninjaId, entity.ninjaId);
    }
}