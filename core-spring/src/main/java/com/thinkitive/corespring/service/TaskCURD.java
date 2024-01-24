package com.thinkitive.corespring.service;

import com.thinkitive.corespring.entity.Task;
import com.thinkitive.corespring.moduleResponse.ListStatusResponse;
import com.thinkitive.corespring.moduleResponse.StatusResponse;
import com.thinkitive.corespring.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
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
        Objects.requireNonNull(
                task,
                 "Task Object cannot be Null"
                 );

        Optional<Task> optionalTask = taskRepository.findById(task.getId());
        optionalTask.ifPresent(foundTask -> {
            taskRepository.delete(foundTask);
        });

        return optionalTask.map(foundTask ->
                new StatusResponse(
                        true,
                        "Task Deleted Successfully",
                        foundTask
                )
        ).orElseGet(() ->
                new StatusResponse(
                        false,
                        "No Task Found you have provided"
                )
        );
    }

}
