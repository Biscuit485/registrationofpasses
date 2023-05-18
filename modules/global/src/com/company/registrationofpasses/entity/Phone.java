package com.company.registrationofpasses.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "REGISTRATIONOFPASSES_PHONE")
@Entity(name = "registrationofpasses_Phone")
public class Phone extends StandardEntity {
    private static final long serialVersionUID = -7954540123184299762L;

    @Column(name = "NUMBERPHONE")
    @NotNull
    protected String numberPhone;

    @Column(name = "NUMBERWORKPHONE")
    @NotNull
    protected String numberWorkPhone;

    @JoinColumn(name = "EMPLOYEE")
    @ManyToOne(fetch = FetchType.LAZY)
    protected Employee employee;

    public Employee getEmployee(){ return employee;}

    public void setEmployee(Employee employee){ this.employee = employee; }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getNumberWorkPhone() {
        return numberWorkPhone;
    }

    public void setNumberWorkPhone(String numberWorkPhone) {
        this.numberWorkPhone = numberWorkPhone;
    }
}