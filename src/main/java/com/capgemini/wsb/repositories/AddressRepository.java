package com.capgemini.wsb.repositories;

import com.capgemini.wsb.persistence.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressEntity, Long> {
}
