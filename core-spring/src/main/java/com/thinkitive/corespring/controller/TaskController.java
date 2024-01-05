package com.thinkitive.corespring.controller;

import com.thinkitive.corespring.entity.Task;
import com.thinkitive.corespring.moduleResponse.ListStatusResponse;
import com.thinkitive.corespring.moduleResponse.StatusResponse;
import com.thinkitive.corespring.service.TaskCURD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskCURD taskCURD;

    @PostMapping("/create")
    public StatusResponse createTask(@RequestBody Task task) {
        return taskCURD.createTask(task);
    }

    @GetMapping("/get-all")
    public ListStatusResponse getAllTask() {
        return taskCURD.getAllTask();
    }

    @PutMapping("/update")
    public StatusResponse updateTask(@RequestBody Task task) {
        return taskCURD.createTask(task);
    }

    @DeleteMapping("/delete")
    public StatusResponse deleteTask(@RequestBody Task task){
        return taskCURD.deleteTask(task);
    }
}
