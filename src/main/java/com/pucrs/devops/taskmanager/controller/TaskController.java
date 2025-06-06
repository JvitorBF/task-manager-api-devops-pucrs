package com.pucrs.devops.taskmanager.controller;

import com.pucrs.devops.taskmanager.dto.TaskDTO;
import com.pucrs.devops.taskmanager.service.ITaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TaskController {

    private final ITaskService service;

    public TaskController(ITaskService service) {
        this.service = service;
    }

    @PostMapping("/task")
    public ResponseEntity<TaskDTO> createTask(@RequestBody TaskDTO task) {
        TaskDTO created = service.create(task);
        return ResponseEntity.status(201).body(created);
    }

    @GetMapping("/task")
    public ResponseEntity<List<TaskDTO>> getAllTasks() {
        return ResponseEntity.ok(service.findAll());
    }

}
