package com.company.registrationofpasses.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TypePass implements EnumClass<String> {

    CONSTANT("C"),
    TEMPORARY("T");

    private String id;

    TypePass(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static TypePass fromId(String id) {
        for (TypePass at : TypePass.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}