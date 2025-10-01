package dev.utr.platzi_spring.web.exception;

import dev.utr.platzi_spring.domain.exception.InvalidReportException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> handleException(InvalidReportException e) {
        Error error = new Error("invalid-report", e.getMessage());
        return ResponseEntity.badRequest().body(error);
    }
}
