package com.example.cuongstarterkit.exceptions;

import org.springframework.http.HttpStatus;

public final class AppErrorCode {

    public static final ErrorResponse PERSON_NOT_FOUND = new ErrorResponse("000100",
        "Person not found", HttpStatus.BAD_REQUEST);

}
