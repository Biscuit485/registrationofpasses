package com.company.registrationofpasses.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TypeReason implements EnumClass<String> {

    WORK("W"),
    RENAME("R"),
    REMOVING_CIPHER("R_C"),
    ADD_CIPHER("A_C"),
    DAMAGE("D"),
    LOSS("L"),
    END("E"),
    APPEARANCE("A");

    private String id;

    TypeReason(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static TypeReason fromId(String id) {
        for (TypeReason at : TypeReason.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}