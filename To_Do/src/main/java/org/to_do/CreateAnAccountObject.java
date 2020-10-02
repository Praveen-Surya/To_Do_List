package org.to_do;

import java.util.ArrayList;
import java.util.List;

public class CreateAnAccountObject {

	private static CreateAnAccountObject instance = null;
	static List<UserDetails> userDetails = null;

	public static void addUserDetails(UserDetails ref) {
		userDetails.add(ref);
	}

	public static CreateAnAccountObject getInstance() {
		if (instance == null) {
			instance = new CreateAnAccountObject();
		}
		return instance;
	}

	private CreateAnAccountObject() {
		userDetails = new ArrayList<UserDetails>();
	}

}
