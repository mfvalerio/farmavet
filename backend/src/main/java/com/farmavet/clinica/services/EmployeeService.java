package com.farmavet.clinica.services;

import com.farmavet.clinica.dto.EmployeeDTO;
import com.farmavet.clinica.entities.EmployeeEntity;
import com.farmavet.clinica.mapper.EmployeeMapper;
import com.farmavet.clinica.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<EmployeeDTO> findAll() {

        return employeeMapper.toDTOs(employeeRepository.findAll());
    }

    public EmployeeDTO findById(final Long id) {

        return employeeMapper.toDTO(employeeRepository.findById(id).get());
    }

    public EmployeeDTO insert(final EmployeeDTO employee) {
        EmployeeEntity employeeEntity = employeeMapper.toEntity(employee);
        EmployeeEntity save = employeeRepository.save(employeeEntity);

        return employeeMapper.toDTO(save);
    }
    public void delete(final Long id){

        employeeRepository.deleteById(id);
    }
}
