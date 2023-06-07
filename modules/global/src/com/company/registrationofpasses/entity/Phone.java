package com.company.registrationofpasses.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "REGISTRATIONOFPASSES_PHONE")
@Entity(name = "registrationofpasses_Phone")
@NamePattern("%s|numberWorkPhone")
public class Phone extends StandardEntity {
    private static final long serialVersionUID = -7954540123184299762L;

    @Column(name = "NUMBERWORKPHONE")
    @NotNull
    protected String numberWorkPhone;

    public String getNumberWorkPhone() {
        return numberWorkPhone;
    }
    public void setNumberWorkPhone(String numberWorkPhone) {
        this.numberWorkPhone = numberWorkPhone;
    }
}