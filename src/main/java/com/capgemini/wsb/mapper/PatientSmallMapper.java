package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.PatientSmallTO;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.mapstruct.factory.Mappers;

public interface PatientSmallMapper {
    PatientSmallMapper INSTANCE = Mappers.getMapper(PatientSmallMapper.class);

    PatientSmallTO patientToPatientSmallTO(PatientEntity patientEntity);
}
