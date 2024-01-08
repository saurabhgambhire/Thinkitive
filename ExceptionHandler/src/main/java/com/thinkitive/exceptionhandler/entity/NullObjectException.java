package com.thinkitive.exceptionhandler.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NullObjectException extends RuntimeException {

    private int errorCode;
    private String errorMessage;
}
