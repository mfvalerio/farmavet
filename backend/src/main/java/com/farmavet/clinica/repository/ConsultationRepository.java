package com.farmavet.clinica.repository;

import com.farmavet.clinica.entities.ConsultationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultationRepository extends JpaRepository<ConsultationEntity, Long> {

    List<ConsultationEntity> findByOrderByDateTimeDesc();
}
