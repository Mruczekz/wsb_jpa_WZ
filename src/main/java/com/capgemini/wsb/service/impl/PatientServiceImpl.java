package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.mapper.PatientMapper;
import com.capgemini.wsb.mapper.VisitMapper;
import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import com.capgemini.wsb.service.PatientService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {
    private final PatientDao patientDao;

    public PatientServiceImpl(PatientDao patientDao) {
        this.patientDao = patientDao;
    }

    @Override
    public PatientTO findById(long id) {
        final PatientEntity patientEntity = patientDao.findOne(id);
        return PatientMapper.INSTANCE.patientToPatientTO(patientEntity);
    }

    @Override
    public long deleteById(long patientId) {
        patientDao.delete(patientId);
        return patientId;
    }

    @Override
    public PatientTO addPatient(PatientTO patientTO) {
        return null;
    }

    @Override
    public List<VisitTO> getPatientVisits(long patientId) {
        return VisitMapper.INSTANCE.visitListToVisitTOList(patientDao.findOne(patientId).getVisits());
    }

    @Override
    public List<PatientTO> getPatientsByLastName(String lastName) {
        return PatientMapper.INSTANCE.patientListToPatientTOList(patientDao.findPatientByLastName(lastName));
    }
}
