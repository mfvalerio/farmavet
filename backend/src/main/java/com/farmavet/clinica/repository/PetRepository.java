package com.farmavet.clinica.repository;

import com.farmavet.clinica.entities.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PetRepository extends JpaRepository<PetEntity, Long> {

    List<PetEntity> findByCustomerId(Long customerId);
}
