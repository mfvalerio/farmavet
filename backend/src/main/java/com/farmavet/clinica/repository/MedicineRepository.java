package com.farmavet.clinica.repository;

import com.farmavet.clinica.entities.MedicineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<MedicineEntity, Long> {
}
