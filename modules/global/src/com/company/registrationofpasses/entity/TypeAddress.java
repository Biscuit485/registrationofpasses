package com.company.registrationofpasses.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TypeAddress implements EnumClass<String> {

    DOMESTIC("D"),
    TEMPORARY("T");

    private String id;

    TypeAddress(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static TypeAddress fromId(String id) {
        for (TypeAddress at : TypeAddress.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}