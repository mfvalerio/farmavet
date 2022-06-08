package com.farmavet.clinica.mapper;

import com.farmavet.clinica.dto.ConsultationDTO;
import com.farmavet.clinica.dto.ConsultationResponse;
import com.farmavet.clinica.entities.ConsultationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel="spring")
public interface ConsultationMapper {

    @Mapping(source = "customer.id", target = "customerId")
    @Mapping(source = "pet.id", target = "petId")
    ConsultationDTO toDTO(ConsultationEntity consultationEntity);

    ConsultationResponse toResponse(ConsultationEntity consultationEntity);
    List<ConsultationResponse> toResponses(List<ConsultationEntity> consultationEntities);

    @Mapping(source = "customer.id", target = "customerId")
    @Mapping(source = "pet.id", target = "petId")
    List<ConsultationDTO> toDTOs(List<ConsultationEntity> consultationEntities);

    @Mapping(source = "customerId", target = "customer.id")
    @Mapping(source = "petId", target = "pet.id")
    ConsultationEntity toEntity(ConsultationDTO consultationDTO);

}
