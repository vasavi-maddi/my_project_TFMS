package com.revature.dao;
import java.util.ArrayList;

import com.revature.model.Batch;

public interface BatchDetails {
	public abstract void addBatchDetails();

	public abstract void showBatchDetails();

	public abstract void deleteBatchDetails();

	public abstract void updateBatchDetails();

	static ArrayList<Batch> batchList = new ArrayList<Batch>();
}
