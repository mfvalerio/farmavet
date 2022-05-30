package com.farmavet.clinica.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class EmployeeDTO {
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
}

