package com.company.registrationofpasses.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TypePhone implements EnumClass<String> {

    Work("W"),
    MOBILE("M");

    private String id;

    TypePhone(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static TypePhone fromId(String id) {
        for (TypePhone at : TypePhone.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}