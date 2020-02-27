package com.taskApp.springboot.backend.apirest.models.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taskApp.springboot.backend.apirest.models.dao.ITaskDao;
import com.taskApp.springboot.backend.apirest.models.entity.Task;

@Service
public class TaskServiceImpl  implements ITaskService{

	@Autowired
	private ITaskDao taskDao;
	@Override
	@Transactional(readOnly=true)
	public List<Task> findAll(){
		return (List<Task>) taskDao.findAll();
	}
	
	@Override
	@Transactional(readOnly=true)
	public Task findById(Long id) {
		return taskDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Task save(Task task) {
		return taskDao.save(task);
	}
	
	@Override
	public void deleteById(Long id) {
		taskDao.deleteById(id);
	}
}
