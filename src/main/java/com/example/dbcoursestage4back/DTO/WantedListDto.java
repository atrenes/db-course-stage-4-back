package com.example.dbcoursestage4back.DTO;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class WantedListDto implements Serializable {
    private final String wantedNinjaName;
    private final Boolean isCaptured;
    private final String executorNinjaName;
    private final String description;
    private final LocalDate dateOfSearchStart;
    private final LocalDate dateOfCapture;

    public WantedListDto(String wantedNinjaName, Boolean isCaptured, String executorNinjaName, String description, LocalDate dateOfSearchStart, LocalDate dateOfCapture) {
        this.wantedNinjaName = wantedNinjaName;
        this.isCaptured = isCaptured;
        this.executorNinjaName = executorNinjaName;
        this.description = description;
        this.dateOfSearchStart = dateOfSearchStart;
        this.dateOfCapture = dateOfCapture;
    }

    public String getWantedNinjaName() {
        return wantedNinjaName;
    }

    public Boolean getIsCaptured() {
        return isCaptured;
    }

    public String getExecutorNinjaName() {
        return executorNinjaName;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDateOfSearchStart() {
        return dateOfSearchStart;
    }

    public LocalDate getDateOfCapture() {
        return dateOfCapture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WantedListDto entity = (WantedListDto) o;
        return Objects.equals(this.wantedNinjaName, entity.wantedNinjaName) &&
                Objects.equals(this.isCaptured, entity.isCaptured) &&
                Objects.equals(this.executorNinjaName, entity.executorNinjaName) &&
                Objects.equals(this.description, entity.description) &&
                Objects.equals(this.dateOfSearchStart, entity.dateOfSearchStart) &&
                Objects.equals(this.dateOfCapture, entity.dateOfCapture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wantedNinjaName, isCaptured, executorNinjaName, description, dateOfSearchStart, dateOfCapture);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "wantedNinjaName = " + wantedNinjaName + ", " +
                "isCaptured = " + isCaptured + ", " +
                "executorNinjaName = " + executorNinjaName + ", " +
                "description = " + description + ", " +
                "dateOfSearchStart = " + dateOfSearchStart + ", " +
                "dateOfCapture = " + dateOfCapture + ")";
    }
}
