package dev.utr.platzi_spring.persistence;

import dev.utr.platzi_spring.domain.dto.ReportDto;
import dev.utr.platzi_spring.domain.repository.ReportRepository;
import dev.utr.platzi_spring.persistence.crud.CrudReportEntity;
import dev.utr.platzi_spring.persistence.entity.ReportEntity;
import dev.utr.platzi_spring.persistence.mapper.ReportMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReportEntityRepository implements ReportRepository {
    private final CrudReportEntity crudReportEntity;
    private final ReportMapper reportMapper;

    public ReportEntityRepository(CrudReportEntity crudReportEntity, ReportMapper reportMapper) {
        this.crudReportEntity = crudReportEntity;
        this.reportMapper = reportMapper;
    }

    @Override
    public List<ReportDto> getAll() {
        return this.reportMapper.toDto(this.crudReportEntity.findAll());
    }

    @Override
    public ReportDto save(ReportDto reportDto) {
        ReportEntity reportEntity = this.reportMapper.toEntity(reportDto);
        this.crudReportEntity.save(reportEntity);
        return this.reportMapper.toDto(reportEntity);
    }
}
