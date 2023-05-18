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

    @Column(name = "TYPEPHONE")
    @NotNull
    protected String typePhone;

    @JoinColumn(name = "EMPLOYEE")
    @ManyToOne(fetch = FetchType.LAZY)
    protected Employee employee;

    public Employee getEmployee(){ return employee;}

    public void setEmployee(Employee employee){ this.employee = employee; }

    public TypePhone getTypePhone() {
        return typePhone == null ? null : TypePhone.fromId(typePhone);
    }
    public void setTypePhone(TypePhone typePhone) {
        this.typePhone = typePhone == null ? null : typePhone.getId();
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }
}