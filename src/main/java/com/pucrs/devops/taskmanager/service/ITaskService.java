package com.pucrs.devops.taskmanager.service;

import com.pucrs.devops.taskmanager.dto.TaskDTO;

public interface ITaskService {
    TaskDTO create(TaskDTO task);
}
