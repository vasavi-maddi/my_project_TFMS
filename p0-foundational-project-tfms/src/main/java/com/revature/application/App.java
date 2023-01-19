package com.revature.application;

import java.sql.SQLException;

import com.revature.service.impl.LoginImplementation;

public class App {
	public static void main(String[] args) {
		LoginImplementation a=new LoginImplementation();
		try {
			a.adminLogin();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
