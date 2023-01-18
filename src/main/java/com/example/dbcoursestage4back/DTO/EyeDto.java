package com.example.dbcoursestage4back.DTO;

import java.io.Serializable;
import java.util.Objects;

public class EyeDto implements Serializable {
    private final String type;

    public EyeDto(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EyeDto entity = (EyeDto) o;
        return Objects.equals(this.type, entity.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "type = " + type + ")";
    }
}
