package org.to_do;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserTodo {

	private static UserTodo instance = null;
	static Map<String, List<Todo>> todo1;

	public static void createTodo(String emailId, Todo ref) {

		UserTodo.todo1.put(emailId, new ArrayList<Todo>());
		UserTodo.todo1.get(emailId).add(ref);

	}

	public static void addTodo(String emailId, Todo ref) {

		UserTodo.todo1.get(emailId).add(ref);

	}

	public static UserTodo getInstance() {
		if (instance == null) {
			instance = new UserTodo();
		}
		return instance;
	}

	private UserTodo() {
		todo1 = new HashMap<String, List<Todo>>();
	}

}
