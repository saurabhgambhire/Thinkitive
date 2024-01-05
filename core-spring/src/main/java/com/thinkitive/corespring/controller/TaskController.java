package com.thinkitive.corespring.controller;

import com.thinkitive.corespring.entity.Task;
import com.thinkitive.corespring.moduleResponse.StatusResponse;
import com.thinkitive.corespring.service.TaskCURD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskCURD taskCURD;

    @PostMapping("/create")
    public StatusResponse createTask(@RequestBody Task task){
        return taskCURD.createTask(task);
    }
}
