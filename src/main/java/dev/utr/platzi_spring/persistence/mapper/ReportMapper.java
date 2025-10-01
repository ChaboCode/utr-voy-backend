package dev.utr.platzi_spring.persistence.mapper;

import dev.utr.platzi_spring.domain.dto.ReportDto;
import dev.utr.platzi_spring.persistence.entity.ReportEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReportMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "bus", target = "camion")
    @Mapping(source = "student", target = "reportadoPor")
    @Mapping(source = "date", target = "fecha")
    @Mapping(source = "passed" ,target = "paso")
    @Mapping(source = "extra", target = "comentarios")
    ReportDto toDto(ReportEntity reportEntity);
    List<ReportDto> toDto(Iterable<ReportEntity> all);

    @InheritInverseConfiguration
    ReportEntity toEntity(ReportDto dto);
}
