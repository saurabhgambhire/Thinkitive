package com.thinkitive.corespring.service;

import com.thinkitive.corespring.entity.Task;
import com.thinkitive.corespring.moduleResponse.StatusResponse;
import com.thinkitive.corespring.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskCURD {

    @Autowired
    private TaskRepository taskRepository;

    public StatusResponse createTask(Task task) {

        if (task == null){
            return new StatusResponse(
                    false,
                    "Task Object cannot be Null"
            );
        }

        Task save = taskRepository.save(task);
        return new StatusResponse(
                true,
                "Task Saved Successfully",
                save
        );
    }
}
