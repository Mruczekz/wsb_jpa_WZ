package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PatientDaoImpl extends AbstractDao<PatientEntity, Long> implements PatientDao {
    @Override
    public List<PatientEntity> findPatientByLastName(String LastName) {
        return null;
    }

    @Override
    public List<PatientEntity> findPatientsWithMoreThanSpecifiedVisits(int numberOfVisits) {
        return null;
    }
}
