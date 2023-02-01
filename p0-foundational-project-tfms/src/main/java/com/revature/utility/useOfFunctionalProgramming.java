package com.revature.utility;

import java.util.function.*;
import com.revature.model.User;
import com.revature.model.Menu;
public class useOfFunctionalProgramming {
	public static void main(String[] args) {
		Menu m =new Menu();
		Predicate<User> checkUserRole = User -> (User.getRole() == "Admin");
		if(checkUserRole.test(new User("pp", "@123", "Admin"))) {
			m.menu();
		}
	}

}
