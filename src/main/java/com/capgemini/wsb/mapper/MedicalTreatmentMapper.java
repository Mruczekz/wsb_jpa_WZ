package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.MedicalTreatmentTO;
import com.capgemini.wsb.persistence.entity.MedicalTreatmentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MedicalTreatmentMapper {
    MedicalTreatmentMapper INSTANCE = Mappers.getMapper(MedicalTreatmentMapper.class);

    MedicalTreatmentTO medicalTreatmentToMedicalTreatmentTO(MedicalTreatmentEntity medicalTreatmentEntity);
}
