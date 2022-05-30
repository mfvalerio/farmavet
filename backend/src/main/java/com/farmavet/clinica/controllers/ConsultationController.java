package com.farmavet.clinica.controllers;

import com.farmavet.clinica.dto.ConsultationDTO;
import com.farmavet.clinica.services.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("farmavet/consultations")
public class ConsultationController {

    @Autowired
    private ConsultationService consultationService;

    @GetMapping
    public List<ConsultationDTO> findAll(){

        return consultationService.findAll();
    }

    @GetMapping("/{id}")
    public ConsultationDTO findById(@PathVariable Long id){

        return consultationService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ConsultationDTO insert(@RequestBody ConsultationDTO consultation){

        return consultationService.insert(consultation);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ConsultationDTO update(@RequestBody ConsultationDTO consultation){

        return consultationService.insert(consultation);
    }

    @DeleteMapping
    @ResponseBody
    public void delete(@RequestParam Long id){
        consultationService.delete(id);
    }
}
