package dev.utr.platzi_spring.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDateTime;

public record ReportDto(
        Integer id,
        String camion,

        @PastOrPresent(message = "Report must be past or present time")
        LocalDateTime fecha,

        @NotBlank(message = "Report must be accompanied by a student ID")
        String reportadoPor,

        Boolean paso,
        String comentarios
) {}
