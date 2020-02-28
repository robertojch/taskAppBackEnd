package com.taskApp.springboot.backend.apirest.models.services;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.Mock;

import com.sun.xml.bind.v2.TODO;
import com.taskApp.springboot.backend.apirest.models.dao.ITaskDao;
import com.taskApp.springboot.backend.apirest.models.entity.Task;

class TaskServiceImplTest {

	@Mock
	 ITaskDao taskDao;
	
	private TaskServiceImpl taskService;
	
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
	
		
	}

	@Test
	void testDeleteById() {
		assertNotNull(taskDao.findAll());
	}
	*/

}
