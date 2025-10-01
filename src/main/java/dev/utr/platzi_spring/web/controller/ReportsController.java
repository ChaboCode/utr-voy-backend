package dev.utr.platzi_spring.web.controller;

import dev.utr.platzi_spring.domain.dto.ReportDto;
import dev.utr.platzi_spring.domain.service.ReportService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reports")
public class ReportsController {
    private final ReportService reportService;

    public ReportsController(ReportService reportController) {
        this.reportService = reportController;
    }

    @GetMapping("/all")
    public List<ReportDto> getReports() {
        return this.reportService.getAll();
    }

    @GetMapping("/cuca")
    public String getCuca() {
        return "¡Cuca!";
    }

    @GetMapping("/cutucar")
    public String getCutucar() {
        return "Cutucar de volta";
    }

    @PostMapping("/")
    public ResponseEntity<ReportDto> saveReport(@RequestBody ReportDto reportDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.reportService.add(reportDto));
    }
}
