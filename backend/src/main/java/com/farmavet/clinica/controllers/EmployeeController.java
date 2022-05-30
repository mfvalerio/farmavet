package com.farmavet.clinica.controllers;

import com.farmavet.clinica.dto.EmployeeDTO;
import com.farmavet.clinica.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("farmavet/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<EmployeeDTO> findAll(){

        return employeeService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public EmployeeDTO findById(@Valid @PathVariable Long id){

        return employeeService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EmployeeDTO insert(@Valid @RequestBody EmployeeDTO employee){

        return employeeService.insert(employee);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public EmployeeDTO update(@Valid @RequestBody EmployeeDTO employee){

        return employeeService.insert(employee);
    }

}
