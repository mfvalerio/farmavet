package com.farmavet.clinica.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SpecieEnum {

    BIRD("Ave"),
    DOG("Cachorro"),
    BUNNY("Coelho"),
    CAT("Gato"),
    RODENT("Roedor"),
    OTHER("Outra");

    private final String value;

}
