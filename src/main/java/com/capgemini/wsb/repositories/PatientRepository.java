package com.capgemini.wsb.repositories;

import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientEntity, Long> {
}
