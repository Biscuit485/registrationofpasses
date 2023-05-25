package com.company.registrationofpasses.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "REGISTRATIONOFPASSES_AREA")
@Entity(name = "registrationofpasses_Area")
public class Area extends StandardEntity {
    private static final long serialVersionUID = -6509753277320299873L;

    @Column(name = "NUMBERAREA")
    @NotNull
    protected String numberArea;
    public String getNumberArea() {
        return numberArea;
    }

    public void setNumberArea(String numberArea) {
        this.numberArea = numberArea;
    }

    @Column(name = "BUILDING")
    @NotNull
    protected String building;
    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}