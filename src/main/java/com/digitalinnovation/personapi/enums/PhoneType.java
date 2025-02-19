package com.digitalinnovation.personapi.enums;


import lombok.Getter;

@Getter
public enum PhoneType {

    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    private final String description;

    PhoneType(String description) {
        this.description = description;
    }
}
