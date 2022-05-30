package com.farmavet.clinica.mapper;

import com.farmavet.clinica.dto.CustomerDTO;
import com.farmavet.clinica.entities.CustomerEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel="spring")
public interface CustomerMapper {

    CustomerDTO toDTO(CustomerEntity customer);
    List<CustomerDTO> toDTOs(List<CustomerEntity> customerEntities);
    CustomerEntity toEntity(CustomerDTO customerDTO);
}
