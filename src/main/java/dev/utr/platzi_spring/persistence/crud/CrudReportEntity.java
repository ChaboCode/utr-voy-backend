package dev.utr.platzi_spring.persistence.crud;

import dev.utr.platzi_spring.persistence.entity.ReportEntity;
import org.springframework.data.repository.CrudRepository;

public interface CrudReportEntity extends CrudRepository<ReportEntity, Integer> {
}
