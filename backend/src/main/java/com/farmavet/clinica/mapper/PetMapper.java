package com.farmavet.clinica.mapper;

import com.farmavet.clinica.dto.PetDTO;
import com.farmavet.clinica.entities.PetEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel="spring")
public interface PetMapper {

    @Mapping(source = "customer.id", target = "customerId")
    PetDTO toDTO(PetEntity PetEntity);

    @Mapping(source = "customer.id", target = "customerId")
    List<PetDTO>toDTOs(List<PetEntity> petEntityies);

    @Mapping(source = "customerId", target = "customer.id")
    PetEntity toEntity(PetDTO petDTO);

}
