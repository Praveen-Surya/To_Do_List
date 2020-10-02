package org.to_do;

import java.util.ArrayList;
import java.util.List;

public class CreateAListObject {

	private static CreateAListObject instance = null;
	static List<Todo> todo = null;

	public static void addTodo(Todo ref) {
		todo.add(ref);
	}

	public void removeTodo(Todo ref) {
		todo.remove(ref);
	}

	public static CreateAListObject getInstance() {
		if (instance == null) {
			instance = new CreateAListObject();
		}
		return instance;
	}

	private CreateAListObject() {
		todo = new ArrayList<Todo>();
	}

}
