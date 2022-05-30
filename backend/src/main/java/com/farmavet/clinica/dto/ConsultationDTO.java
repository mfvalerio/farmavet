package com.farmavet.clinica.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
public class ConsultationDTO {
    private Long id;
    private LocalDateTime dateTime;
    private String description;
    private String diagnosis;
    @NotBlank(message = "Identificação do cliente é obrigatório")
    private Long customerId;

    @NotBlank(message = "Identificação do cliente é obrigatório")
    private Long petId;
}
