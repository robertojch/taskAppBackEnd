package com.taskApp.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.taskApp.springboot.backend.apirest.models.entity.Task;
import com.taskApp.springboot.backend.apirest.models.services.ITaskService;

@CrossOrigin(origins = { "http://localhost:4200","*" })
@RestController
@RequestMapping("/api")
public class TaskRestController {

	@Autowired
	private ITaskService taskService;

	@GetMapping("/tasks")
	public List<Task> index() {
		return taskService.findAll();
	}

	@Secured({"ROLE_ADMIN","ROLE_USER"})
	@GetMapping("/tasks/{id}")
	public Task findById(@PathVariable Long id) {
		return taskService.findById(id);
	}

	@Secured({"ROLE_ADMIN","ROLE_USER"})
	@PostMapping("/tasks")
	@ResponseStatus(HttpStatus.CREATED)
	public Task create(@RequestBody Task task) {
		return taskService.save(task);
	}

	@Secured({"ROLE_ADMIN","ROLE_USER"})
	@PutMapping("/tasks/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Task update(@RequestBody Task task,@PathVariable Long id) {
		Task taskActual = taskService.findById(id);
		taskActual.setDescription(task.getDescription());
		taskActual.setEditing(task.getEditing());
		taskActual.setStatus(task.getStatus());
		return taskService.save(taskActual);
		
	}

	@Secured({"ROLE_ADMIN","ROLE_USER"})
	@DeleteMapping("tasks/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteById(@PathVariable Long id) {
		taskService.deleteById(id);
	}

}
