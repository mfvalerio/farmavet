package com.farmavet.clinica.services;

import com.farmavet.clinica.dto.PetDTO;
import com.farmavet.clinica.entities.PetEntity;
import com.farmavet.clinica.mapper.PetMapper;
import com.farmavet.clinica.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private PetMapper petMapper;

    public List<PetDTO> findAll() {

        return petMapper.toDTOs(petRepository.findAll());
    }

    public PetDTO findById(final Long id) {

        return petMapper.toDTO(petRepository.findById(id).get());
    }

    public PetDTO insert(final PetDTO petDTO) {
        PetEntity petEntity = petMapper.toEntity(petDTO);
        PetEntity save = petRepository.save(petEntity);

        return petMapper.toDTO(save);
    }

    public List<PetDTO> findByCustomerId(final Long customerId){

        return petMapper.toDTOs(petRepository.findByCustomerId(customerId));
    }
}

