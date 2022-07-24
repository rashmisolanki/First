package com.project.first.exception;

import lombok.*;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String detailMessage;
    private List<String> errors;

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public ErrorDetails(Date timestamp, String message, String detailMessage) {
        this.timestamp = timestamp;
        this.message = message;
        this.detailMessage = detailMessage;
    }
}
