package com.taskApp.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.taskApp.springboot.backend.apirest.models.entity.Task;

public interface ITaskDao extends CrudRepository<Task,Long>{

}
