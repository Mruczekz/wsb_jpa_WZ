package com.capgemini.wsb.repositories;

import com.capgemini.wsb.persistence.entity.MedicalTreatmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalTreatmentRepository extends JpaRepository<MedicalTreatmentEntity, Long> {
}
