package com.capgemini.wsb.repositories;

import com.capgemini.wsb.persistence.entity.VisitEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<VisitEntity, Long> {
}
