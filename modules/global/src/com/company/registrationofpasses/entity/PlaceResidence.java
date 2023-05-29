package com.company.registrationofpasses.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "REGISTRATIONOFPASSES_PLACE_RESIDENCE")
@Entity(name = "registrationofpasses_PlaceResidence")
public class PlaceResidence extends StandardEntity {
    private static final long serialVersionUID = -3925017639164982363L;

    @Column(name = "REGION")
    @NotNull
    protected String region;

    @Column(name = "CITY")
    @NotNull
    protected String city;

    @Column(name = "SETTLEMENT")
    protected String settlement;

    @Column(name = "STREET")
    @NotNull
    protected String street;

    @Column(name = "HOUSE")
    @NotNull
    protected Integer house;

    @Column(name = "CORPUS")
    protected String corpus;

    @Column(name = "FLAT")
    @NotNull
    protected Integer flat;

    @Column(name = "TYPEADDRESS")
    @NotNull
    protected String typeAddress;

    public TypeAddress getTypeAddress() {
        return typeAddress == null ? null : TypeAddress.fromId(typeAddress);
    }
    public void setTypeAddress(TypeAddress typeAddress) {this.typeAddress = typeAddress == null ? null : typeAddress.getId();}

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

    public Integer getHouse() {
        return house;
    }
    public void setHouse(Integer house) {
        this.house = house;
    }

    public String getCorpus() {
        return corpus;
    }
    public void setCorpus(String corpus) {
        this.corpus = corpus;
    }

    public Integer getFlat() {
        return flat;
    }
    public void setFlat(Integer flat) {
        this.flat = flat;
    }
}