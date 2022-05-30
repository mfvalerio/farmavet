package com.farmavet.clinica.entities;

import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Preenchimento de nome é obrigatório")
    private String name;

    @NotBlank(message = "Preenchimento do CPF é obrigatório")
    @CPF
    private String cpf;

    @NotBlank(message = "Preenchimento do telefone é obrigatório")
    private String telephone;

    private String telephoneForMessages;

    private String cep;

    @NotBlank(message = "Preenchimento da rua é obrigatório")
    private String streetName;

    @NotNull(message = "Preenchimento do número é obrigatório")
    private int number;

    @NotBlank(message = "Preenchimento do bairro é obrigatório")
    private String neighborhood;

    @NotBlank(message = "Preenchimento da cidade obrigatório")
    private String city;

}
