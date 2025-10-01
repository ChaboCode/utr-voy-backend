package dev.utr.platzi_spring.domain.service;

import dev.utr.platzi_spring.domain.dto.ReportDto;
import dev.utr.platzi_spring.domain.repository.ReportRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {
    private final ReportRepository reportRepository;

    public ReportService(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    public List<ReportDto> getAll() {
        return this.reportRepository.getAll();
    }

    public ReportDto add(ReportDto reportDto) {
        return this.reportRepository.save(reportDto);
    }
}
