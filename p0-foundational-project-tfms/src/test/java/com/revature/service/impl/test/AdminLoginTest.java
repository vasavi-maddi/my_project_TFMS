package com.revature.service.impl.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.revature.model.User;
import com.revature.service.Login;
import com.revature.service.impl.LoginImplementation;

public class AdminLoginTest {
	Login l=new LoginImplementation();
	User res=new User();
	@Test
	public void test() {
		User uu=new User("pp","@123","");
		res=l.getUser(uu);
		assertEquals(res.getUsername(),uu.getUsername());
	}
}
