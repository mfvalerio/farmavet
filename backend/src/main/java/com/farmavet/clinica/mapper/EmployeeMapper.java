package com.farmavet.clinica.mapper;

import com.farmavet.clinica.dto.EmployeeDTO;
import com.farmavet.clinica.entities.EmployeeEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel="spring")
public interface EmployeeMapper {

    EmployeeDTO toDTO(EmployeeEntity employeeEntity);

    List<EmployeeDTO> toDTOs(List<EmployeeEntity> employeeEntities);

    EmployeeEntity toEntity(EmployeeDTO employeeDTO);

}
