package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.MedicalTreatmentTO;
import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.persistence.entity.MedicalTreatmentEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MedicalTreatmentMapper {
    MedicalTreatmentMapper INSTANCE = Mappers.getMapper(MedicalTreatmentMapper.class);

    MedicalTreatmentTO medicalTreatmentToMedicalTreatmentTO(MedicalTreatmentEntity medicalTreatmentEntity);

    List<MedicalTreatmentTO> medicalTreatmentListToMedicalTreatmentTOList(List<MedicalTreatmentEntity> medicalTreatmentEntityList);

}
