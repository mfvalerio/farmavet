package com.farmavet.clinica.services;

import com.farmavet.clinica.dto.CustomerDTO;
import com.farmavet.clinica.entities.CustomerEntity;
import com.farmavet.clinica.mapper.CustomerMapper;
import com.farmavet.clinica.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerMapper customerMapper;

    public List<CustomerDTO> findAll() {

        return customerMapper.toDTOs(customerRepository.findAll());
    }

    public CustomerDTO findById(final Long id) {

        return customerMapper.toDTO(customerRepository.findById(id).get());
    }

    public CustomerDTO insert(final CustomerDTO customer) {
        CustomerEntity customerEntity = customerMapper.toEntity(customer);
        CustomerEntity save = customerRepository.save(customerEntity);

        return customerMapper.toDTO(save);
    }

    public CustomerDTO findByCpf(final String cpf){

        return customerMapper.toDTO(customerRepository.findByCpf(cpf).get());
    }
}
