package com.example.cuongstarterkit.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ErrorResponse {
    private final String code;
    private final String message;
    private final HttpStatus httpStatus;
    private final Throwable rootCause;

    public ErrorResponse(String code, String message, HttpStatus httpStatus) {
        super();
        this.code = code;
        this.message = message;
        this.httpStatus = httpStatus;
        this.rootCause = null;
    }

    public ErrorResponse(String code, String message, HttpStatus httpStatus,
        Throwable rootCause) {
        this.code = code;
        this.message = message;
        this.httpStatus = httpStatus;
        this.rootCause = rootCause;
    }
}
