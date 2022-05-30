package com.farmavet.clinica.dto;

import com.farmavet.clinica.enums.GenderEnum;
import com.farmavet.clinica.enums.SpecieEnum;
import lombok.Data;

import java.time.LocalDate;

@Data
public class PetDTO {
    private Long id;
    private SpecieEnum specie;
    private String name;
    private LocalDate birthDate;
    private String breed;
    private GenderEnum gender;
    private Long customerId;
}
