package com.farmavet.clinica.controllers;

import com.farmavet.clinica.dto.PetDTO;
import com.farmavet.clinica.services.CustomerService;
import com.farmavet.clinica.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("farmavet/pets")
public class PetController {

    @Autowired
    private PetService petService;

    @Autowired
    private CustomerService customerService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PetDTO> findAll() {

        return petService.findAll();
    }

    @GetMapping("/customers/{customerId}")
    @ResponseStatus(HttpStatus.OK)
    public List<PetDTO> findByCustomerId(@PathVariable Long customerId) {
        return petService.findByCustomerId(customerId);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PetDTO findById(@PathVariable Long id) {

        return petService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PetDTO insert(@RequestBody PetDTO petDTO) {

        return petService.insert(petDTO);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public PetDTO update(@RequestBody final PetDTO petDTO) {

        return petService.insert(petDTO);

    }
}
