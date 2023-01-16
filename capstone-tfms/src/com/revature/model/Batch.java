package com.revature.model;

public class Batch {
	private String topicName;
    private int duration;
    private String startDate;
    private String endDate;
    
    
	public Batch() {
		super();
	}


	public Batch(String topicName, int duration, String startDate, String endDate) {
		super();
		this.topicName = topicName;
		this.duration = duration;
		this.startDate = startDate;
		this.endDate = endDate;
	}


	public String getTopicName() {
		return topicName;
	}


	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public String getEndDate() {
		return endDate;
	}


	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}


	@Override
	public String toString() {
		return "Batch [topicName=" + topicName + ", duration=" + duration + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}
    
    
}
