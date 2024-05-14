package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface VisitMapper {
    VisitMapper INSTANCE = Mappers.getMapper(VisitMapper.class);

    VisitTO visitToVisitTO(VisitEntity visitEntity);

    List<VisitTO> visitListToVisitTOList(List<VisitEntity> visitEntityList);
}
