package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.DoctorSmallTO;
import com.capgemini.wsb.persistence.entity.DoctorEntity;
import org.mapstruct.factory.Mappers;

public interface DoctorSmallMapper {
    DoctorSmallMapper INSTANCE = Mappers.getMapper(DoctorSmallMapper.class);

    DoctorSmallTO doctorToDoctorSmallTO(DoctorEntity doctorEntity);

}
