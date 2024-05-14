package com.capgemini.wsb.repositories;

import com.capgemini.wsb.persistence.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {
}
