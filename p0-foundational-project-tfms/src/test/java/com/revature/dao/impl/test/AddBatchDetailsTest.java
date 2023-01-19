package com.revature.dao.impl.test;


import static org.junit.Assert.assertEquals;
import com.revature.dao.BatchDetails;
import com.revature.dao.impl.BatchDetailsImplementation;
import com.revature.model.Batch;

public class AddBatchDetailsTest {
	@org.junit.Test
	public void Test(){
	Batch toBeInserted=new Batch("maven","2022-12-19","2023-03-19",1500,"1003","103");
	Batch inserted=null;
	try {
		BatchDetails a=new BatchDetailsImplementation();
		a.addBatchDetails(toBeInserted);
		inserted=a.getBatch(toBeInserted);
	} catch (Exception e) {}
	assertEquals(toBeInserted.getTopicName(),inserted.getTopicName());
	assertEquals(toBeInserted.getStartDate(), inserted.getStartDate());
	assertEquals(toBeInserted.getEndDate(), inserted.getEndDate());
	assertEquals(toBeInserted.getDuration(), inserted.getDuration());
	assertEquals(toBeInserted.getTrainerId(), inserted.getTrainerId());
	assertEquals(toBeInserted.getAssociateId(), inserted.getAssociateId());
	}
}

