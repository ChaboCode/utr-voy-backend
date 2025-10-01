package dev.utr.platzi_spring.domain.repository;

import dev.utr.platzi_spring.domain.dto.ReportDto;

import java.util.List;

public interface ReportRepository {
    List<ReportDto> getAll();
    ReportDto save(ReportDto reportDto);
}
