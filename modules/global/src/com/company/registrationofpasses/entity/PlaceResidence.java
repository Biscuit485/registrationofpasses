package com.company.registrationofpasses.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "REGISTRATIONOFPASSES_PLACE_RESIDENCE")
@Entity(name = "registrationofpasses_PlaceResidence")
public class PlaceResidence extends StandardEntity {
    private static final long serialVersionUID = -3925017639164982363L;

    @Column(name = "REGION")
    @NotNull
    private String region;

    @Column(name = "CITY")
    @NotNull
    private String city;

    @Column(name = "SETTLEMENT")
    private String settlement;

    @Column(name = "STREET")
    @NotNull
    private String street;

    @Column(name = "HOUSE")
    @NotNull
    private String house;

    @Column(name = "CORPUS")
    private String corpus;

    @Column(name = "FLAT")
    @NotNull
    private String flat;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSettlement() {
        return settlement;
    }

    public void setSettlement(String settlement) {
        this.settlement = settlement;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getCorpus() {
        return corpus;
    }

    public void setCorpus(String corpus) {
        this.corpus = corpus;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }
}