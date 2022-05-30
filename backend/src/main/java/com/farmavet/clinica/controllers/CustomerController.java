package com.farmavet.clinica.controllers;

import com.farmavet.clinica.dto.CustomerDTO;
import com.farmavet.clinica.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@RestController
@RequestMapping("farmavet/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CustomerDTO> findAll() {

        return customerService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CustomerDTO findById(@PathVariable final Long id) {

        return customerService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDTO insert(@Valid @RequestBody final CustomerDTO customer) {

        return customerService.insert(customer);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDTO update(@Valid @RequestBody final CustomerDTO customer) {

        return customerService.insert(customer);
    }

    @GetMapping("cpf/{cpf}")
    @ResponseStatus(HttpStatus.OK)
    public CustomerDTO findByCpf(@PathVariable final String cpf){

        return customerService.findByCpf(cpf);
    }
}
