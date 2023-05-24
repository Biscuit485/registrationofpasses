package com.company.registrationofpasses.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

@Table(name = "REGISTRATIONOFPASSES_EMPLOYEE")
@Entity(name = "registrationofpasses_Employee")
@NamePattern("%s %s %s|middleName, firstName, lastName")
public class Employee extends StandardEntity {
    private static final long serialVersionUID = -6413025411645155462L;

    @JoinTable(name = "EMPLOYEE_PLACERESIDENCE_LINK", joinColumns = @JoinColumn(name = "EMPLOYEE_ID"), inverseJoinColumns = @JoinColumn(name = "PLACERESIDENCE_ID"))
    @ManyToMany(mappedBy = "")
    protected Set<PlaceResidence> placeResidences;

    @Column(name = "MIDDLENAME")
    @NotNull
    protected String middleName;

    @Column(name = "FIRSTNAME")
    @NotNull
    protected String firstName;

    @Column(name = "LASTNAME")
    @NotNull
    protected String lastName;

    @Column(name = "DATEBIRTH")
    @NotNull
    @Temporal(TemporalType.DATE)
    protected Date dateBirth;

    @JoinColumn(name = "PLACEWORK")
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    protected PlaceWork placeWork;

    public  PlaceWork getPlaceWork(){ return placeWork; }

    public void setPlaceWork(PlaceWork placeWork){ this.placeWork = placeWork;}
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
}