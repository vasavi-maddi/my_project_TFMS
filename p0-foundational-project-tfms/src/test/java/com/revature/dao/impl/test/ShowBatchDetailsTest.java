package com.revature.dao.impl.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.revature.dao.impl.BatchDetailsImplementation;

public class ShowBatchDetailsTest {
	@Test
	public void test()
	{
		BatchDetailsImplementation b=new BatchDetailsImplementation();
		b.showBatchDetails();
		int x=BatchDetailsImplementation.v;
		assertEquals(x,BatchDetailsImplementation.v);
	}
}

