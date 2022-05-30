package com.farmavet.clinica.mapper;

import com.farmavet.clinica.dto.MedicineDTO;
import com.farmavet.clinica.entities.MedicineEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel="spring")
public interface MedicineMapper {
    //uma entidade => DTO
    MedicineDTO toDTO(MedicineEntity medicineEntity);

    //lista de entidades => DTOs
    List<MedicineDTO> toDTOs(List<MedicineEntity> medicineEntities);

    //DTO => Entidade
    MedicineEntity toEntity(MedicineDTO medicineDTO);
}
