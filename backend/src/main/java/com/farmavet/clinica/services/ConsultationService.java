package com.farmavet.clinica.services;

import com.farmavet.clinica.dto.ConsultationDTO;
import com.farmavet.clinica.dto.ConsultationResponse;
import com.farmavet.clinica.entities.ConsultationEntity;
import com.farmavet.clinica.mapper.ConsultationMapper;
import com.farmavet.clinica.repository.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class ConsultationService {

    @Autowired
    private ConsultationRepository consultationRepository;

    @Autowired
    private ConsultationMapper consultationMapper;

    public List<ConsultationResponse> findAll(){

        return consultationMapper.toResponses(consultationRepository.findByOrderByDateTimeDesc());
    }

    public ConsultationDTO findById(Long id){

        return consultationMapper.toDTO(consultationRepository.findById(id).get());
    }

    public ConsultationDTO insert(@RequestBody ConsultationDTO consultationDTO){
        ConsultationEntity consultationEntity = consultationMapper.toEntity(consultationDTO);
        ConsultationEntity save = consultationRepository.save(consultationEntity);

        return consultationMapper.toDTO(save);
    }

    public void delete(@RequestParam Long id){

        consultationRepository.deleteById(id);
    }
}
