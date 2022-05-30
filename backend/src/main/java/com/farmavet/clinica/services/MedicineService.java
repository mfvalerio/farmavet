package com.farmavet.clinica.services;

import com.farmavet.clinica.dto.MedicineDTO;
import com.farmavet.clinica.entities.MedicineEntity;
import com.farmavet.clinica.mapper.MedicineMapper;
import com.farmavet.clinica.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class MedicineService {

    @Autowired
    private MedicineRepository medicineRepository;

    @Autowired
    private MedicineMapper medicineMapper;

    public List<MedicineDTO> findAll() {

        return medicineMapper.toDTOs(medicineRepository.findAll());
    }

    public MedicineDTO findById(final Long id) {

        return medicineMapper.toDTO(medicineRepository.findById(id).get());
    }

    public MedicineDTO insert(final MedicineDTO medicineDTO) {
        MedicineEntity medicineEntity = medicineMapper.toEntity(medicineDTO);
        MedicineEntity save = medicineRepository.save(medicineEntity);

        return medicineMapper.toDTO(save);
    }

    public void delete(@RequestParam final Long id) {

        medicineRepository.deleteById(id);
    }
}
