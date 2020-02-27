package com.taskApp.springboot.backend.apirest.models.services;

import java.util.List;

import com.taskApp.springboot.backend.apirest.models.entity.Task;

public interface ITaskService {
	
	public List<Task> findAll();
	public Task findById(Long id);
	public Task save(Task task);
	public void deleteById(Long id);

}
