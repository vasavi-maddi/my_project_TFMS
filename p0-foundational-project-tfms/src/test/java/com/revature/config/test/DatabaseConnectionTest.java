package com.revature.config.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.revature.config.DatabaseConnection;

public class DatabaseConnectionTest {
	@Test
	public void testGetConnection() {
		assertNotNull(new DatabaseConnection().getConnection());
	}
}
