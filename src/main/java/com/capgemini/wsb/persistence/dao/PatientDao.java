package com.capgemini.wsb.persistence.dao;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.persistence.entity.PatientEntity;

import java.util.List;

public interface PatientDao extends Dao<PatientEntity, Long> {
    List<PatientEntity> findPatientByLastName(String LastName);

    List<PatientEntity> findPatientsWithMoreThanSpecifiedVisits (int numberOfVisits);
}
