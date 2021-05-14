package com.example.cuongstarterkit.rest.response;

import org.springframework.http.HttpStatus;

public class BaseResponse<T> {

    public int code = HttpStatus.OK.value();

    private T data;

    private Metadata meta;

    public static class Metadata {

        String code;

        Integer page;

        Integer size;

        Long total;

        String message;

        Object details;

    }
}
