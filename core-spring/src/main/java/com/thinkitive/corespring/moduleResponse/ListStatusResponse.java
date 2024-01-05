package com.thinkitive.corespring.moduleResponse;

import com.thinkitive.corespring.entity.Task;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListStatusResponse {
    private boolean status;
    private String message;
    private int count;
    private List<Task> data;

    public ListStatusResponse(boolean status, String message) {
        this.status = status;
        this.message = message;
    }
}
