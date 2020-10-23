package com.mockito.data.api;

import java.util.Arrays;
import java.util.List;

import com.mockito.data.api.TodoService;

public class TodoServiceStub implements TodoService {
	// Dynamic Condition
	// Service Definition

	public List<String> retrieveTodos(String user) {
		return Arrays.asList("Learn Spring MVC", "Learn Spring",
				"Learn to Dance");
	}

	public void deleteTodo(String todo) {
		// TODO Auto-generated method stub
		
	}

}
