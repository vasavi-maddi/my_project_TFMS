package com.revature.practise;

import java.util.Comparator;

import com.revature.model.Batch;

public class TopicNameComparator implements Comparator<Batch>{

	@Override
	public int compare(Batch o1, Batch o2) {
		// TODO Auto-generated method stub
		return o1.getTopicName().compareTo(o2.getTopicName());
	}

}
