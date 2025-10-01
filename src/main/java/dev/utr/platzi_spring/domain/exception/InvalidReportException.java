package dev.utr.platzi_spring.domain.exception;

public class InvalidReportException extends RuntimeException{
    public InvalidReportException(String msg){
        super("Invalid report structure: " + msg);
    }
}
