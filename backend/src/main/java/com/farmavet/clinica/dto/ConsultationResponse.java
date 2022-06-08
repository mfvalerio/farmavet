package com.farmavet.clinica.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ConsultationResponse {
    private Long id;
    private LocalDateTime dateTime;
    private CustomerDTO customer;
    private PetDTO pet;
}
