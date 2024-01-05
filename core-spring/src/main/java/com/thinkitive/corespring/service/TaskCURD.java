package com.thinkitive.corespring.service;

import com.thinkitive.corespring.entity.Task;
import com.thinkitive.corespring.moduleResponse.ListStatusResponse;
import com.thinkitive.corespring.moduleResponse.StatusResponse;
import com.thinkitive.corespring.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskCURD {

    @Autowired
    private TaskRepository taskRepository;

    public StatusResponse createTask(Task task) {

        if (task == null) {
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

    public ListStatusResponse getAllTask() {
        List<Task> all = taskRepository.findAll();
        if (all.isEmpty()) {
            return new ListStatusResponse(
                    false,
                    "No Task Found"
            );
        }

        return new ListStatusResponse(
                true,
                "Tasks founds Successfully",
                all.size(),
                all
        );
    }

    public StatusResponse deleteTask(Task task) {
        if (task == null) {
            return new StatusResponse(
                    false,
                    "Task Object cannot be Null"
            );
        }

        Optional<Task> byId = taskRepository.findById(task.getId());
        if (byId.isEmpty()) {
            return new StatusResponse(
                    false,
                    "No Task Found you have provided"
            );
        }

        taskRepository.delete(byId.get());
        return new StatusResponse(
                true,
                "Task Deleted Successfully",
                byId.get()
        );
    }
}
