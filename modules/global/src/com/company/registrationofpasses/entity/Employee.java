package com.company.registrationofpasses.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "REGISTRATIONOFPASSES_EMPLOYEE")
@Entity(name = "registrationofpasses_Employee")
public class Employee extends StandardEntity {
    private static final long serialVersionUID = -6413025411645155462L;
}