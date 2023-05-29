package com.company.registrationofpasses.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "REGISTRATIONOFPASSES_PLACE_WORK")
@Entity(name = "registrationofpasses_PlaceWork")
@NamePattern("%s %s|placeWork, post")
public class PlaceWork extends StandardEntity {
    private static final long serialVersionUID = 3874625550550514090L;

    @Column(name = "PLACEWORK")
    @NotNull
    protected String placeWork;

    @Column(name = "POST")
    @NotNull
    protected String post;

    public String getPlaceWork() {
        return placeWork;
    }
    public void setPlaceWork(String placeWork) {
        this.placeWork = placeWork;
    }

    public String getPost() {
        return post;
    }
    public void setPost(String post) {
        this.post = post;
    }
}