package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.MedicalTreatmentTO;
import com.capgemini.wsb.mapper.MedicalTreatmentMapper;
import com.capgemini.wsb.persistence.dao.MedicalTreatmentDao;
import com.capgemini.wsb.persistence.entity.MedicalTreatmentEntity;
import com.capgemini.wsb.service.MedicalTreatmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MedicalTreatmentServiceImpl implements MedicalTreatmentService {

    private final MedicalTreatmentDao medicalTreatmentDao;

    public MedicalTreatmentServiceImpl(MedicalTreatmentDao medicalTreatmentDao) {
        this.medicalTreatmentDao = medicalTreatmentDao;
    }

    @Override
    public MedicalTreatmentTO findById(long id) {
        final MedicalTreatmentEntity medicalTreatmentEntity = medicalTreatmentDao.findOne(id);
        return MedicalTreatmentMapper.INSTANCE.medicalTreatmentToMedicalTreatmentTO(medicalTreatmentEntity);
    }
}
