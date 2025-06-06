package com.pucrs.devops.taskmanager.service;

import com.pucrs.devops.taskmanager.dto.TaskDTO;
import com.pucrs.devops.taskmanager.model.Task;
import com.pucrs.devops.taskmanager.repository.ITaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService implements  ITaskService{
    private final ITaskRepository repository;

    public TaskService(ITaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public TaskDTO create(TaskDTO dto) {
        Task task = toEntity(dto);
        task.setCompleted(false);
        Task saved = repository.save(task);
        return toDTO(saved);
    }

    @Override
    public List<TaskDTO> findAll() {
        List<Task> tasks = repository.findAll();
        return tasks.stream().map(this::toDTO).toList();
    }

    private Task toEntity(TaskDTO dto) {
        Task task = new Task();
        task.setId(dto.id());
        task.setTitle(dto.title());
        task.setDescription(dto.description());
        task.setCompleted(dto.completed());
        return task;
    }

    private TaskDTO toDTO(Task task) {
        return new TaskDTO(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.isCompleted()
        );
    }

}
