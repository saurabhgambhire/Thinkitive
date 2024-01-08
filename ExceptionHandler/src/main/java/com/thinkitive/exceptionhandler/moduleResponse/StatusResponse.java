package com.thinkitive.exceptionhandler.moduleResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusResponse {
    private boolean status;
    private String message;
    private Object data;

    public StatusResponse(boolean status, String message) {
        this.status = status;
        this.message = message;
    }
}
