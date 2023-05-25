package com.company.registrationofpasses.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "REGISTRATIONOFPASSES_REQUEST")
@Entity(name = "registrationofpasses_Request")
public class Request extends StandardEntity {
    private static final long serialVersionUID = -3648759302354622702L;

    @JoinColumn(name = "EMPLOYEE")
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    protected Employee employee;

    public  Employee getEmployee(){ return employee; }

    public void setEmployee(Employee employee){ this.employee = employee;}

    @Column(name = "TYPEPASS")
    @NotNull
    protected String typePass;

    public TypePass getTypePass() {
        return typePass == null ? null : TypePass.fromId(typePass);
    }
    public void setTypePass(TypePass typePass) {
        this.typePass = typePass == null ? null : typePass.getId();
    }


    @Column(name = "TYPEREASON")
    @NotNull
    protected String typeReason;

    public TypeReason getTypeReason() {
        return typeReason == null ? null : TypeReason.fromId(typeReason);
    }
    public void setTypeReason(TypeReason typeReason) {
        this.typeReason = typeReason == null ? null : typeReason.getId();
    }



    @Column(name = "CREATEDATE")
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    protected Date createDate;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "ENDDATE")
    @NotNull
    @Temporal(TemporalType.DATE)
    protected Date endDate;

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}