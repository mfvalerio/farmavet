package com.farmavet.clinica.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Primeiro nome é obrigatório")
    private String firstName;

    @NotBlank(message = "Sobrenome é obrigatório")
    private String lastName;

    @NotBlank(message = "E-mail é obrigatório")
    @Email
    private String email;
    
}
