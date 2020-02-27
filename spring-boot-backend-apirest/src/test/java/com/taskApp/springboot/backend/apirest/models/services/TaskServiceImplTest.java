package com.taskApp.springboot.backend.apirest.models.services;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.Mock;


import com.taskApp.springboot.backend.apirest.models.dao.ITaskDao;
import com.taskApp.springboot.backend.apirest.models.entity.Task;

class TaskServiceImplTest {

	@Mock
	 ITaskDao taskDao;
	
	@BeforeEach
	void setUp() throws Exception {
	}
/*
	@Test
	void testFindAll() {
		
		assertNotNull(taskDao.findAll());
	}

	@Test
	void testFindById() {
		assertNotNull(taskDao.findAll());
	}

	@Test
	void testSave() {
		assertNotNull(taskDao.findAll());
	}

	@Test
	void testDeleteById() {
		assertNotNull(taskDao.findAll());
	}
	*/

}
