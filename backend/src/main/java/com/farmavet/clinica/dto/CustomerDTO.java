package com.farmavet.clinica.dto;

import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class CustomerDTO {

    private Long id;

    @NotBlank(message = "Preenchimento de nome é obrigatório")
    private String name;

    @NotBlank(message = "Preenchimento de CPF é obrigatório")
    private String cpf;

    @NotBlank(message = "Preenchimento de telefone é obrigatório")
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
