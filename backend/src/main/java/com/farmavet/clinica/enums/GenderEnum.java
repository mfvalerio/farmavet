package com.farmavet.clinica.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum GenderEnum {

    FEMALE("Fêmea"),
    MALE("Macho");

    private final String value;
}
