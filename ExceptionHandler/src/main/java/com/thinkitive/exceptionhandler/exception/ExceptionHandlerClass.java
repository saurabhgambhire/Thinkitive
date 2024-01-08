package com.thinkitive.exceptionhandler.exception;

import com.thinkitive.exceptionhandler.entity.NullObjectException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerClass {

    @ExceptionHandler(NullObjectException.class)
    public ResponseEntity<String> nullObject(NullObjectException exception) {
        return new ResponseEntity<>("Object Cannot be Null" + exception.getClass(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> exception(Exception exception) {
        return new ResponseEntity<>("An Error Accured at : " + exception.getClass(), HttpStatus.BAD_REQUEST);
    }
}
