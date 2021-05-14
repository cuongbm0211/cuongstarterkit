package com.example.cuongstarterkit.rest.response;

import org.springframework.http.HttpStatus;

public class ErrorResponse {

    public ErrorResponse(String code, String message, HttpStatus httpStatus) {
        super();
        this.code = code;
        this.message = message;
        this.httpStatus = httpStatus;
        this.details = null;
    }

    private final String code;
    private final String message;
    private final HttpStatus httpStatus;
    private final Object details;
}
