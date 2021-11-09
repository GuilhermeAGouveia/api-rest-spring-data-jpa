package com.learn.sdj.API.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class InsertExceptionResponse {
    @ExceptionHandler(InsertException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody String insertErrorResponse(InsertException ex) {
        return ex.getMessage();
    }
}
