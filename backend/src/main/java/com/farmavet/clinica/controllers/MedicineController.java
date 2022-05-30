package com.farmavet.clinica.controllers;

import com.farmavet.clinica.dto.MedicineDTO;
import com.farmavet.clinica.services.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("farmavet/medicines")
public class MedicineController {
    @Autowired
    private MedicineService medicineService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<MedicineDTO> findAll() {

        return medicineService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MedicineDTO findById(@PathVariable Long id) {

        return medicineService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MedicineDTO insert(@RequestBody MedicineDTO medicine) {

        return medicineService.insert(medicine);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public MedicineDTO update(@RequestBody MedicineDTO medicine) {

        return medicineService.insert(medicine);
    }
}
