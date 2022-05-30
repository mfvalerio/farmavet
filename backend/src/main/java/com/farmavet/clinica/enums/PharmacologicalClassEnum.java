package com.farmavet.clinica.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PharmacologicalClassEnum {
    CAPSULE("Capsula"),
    PILL("Comprimido"),
    INJECTION("Injetável"),
    LIQUID("Líquido"),
    OINTMENT("Pomada"),
    OTHER("Outro");

    private final String value;
}
