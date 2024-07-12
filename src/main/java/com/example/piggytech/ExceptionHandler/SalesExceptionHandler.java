package com.example.piggytech.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.piggytech.NotFoundException.SalesNotFoundException;

@RestControllerAdvice
public class SalesExceptionHandler {

    @ExceptionHandler(SalesNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String salesNotFoundHandler(SalesNotFoundException e){
        return e.getMessage();
    }
}