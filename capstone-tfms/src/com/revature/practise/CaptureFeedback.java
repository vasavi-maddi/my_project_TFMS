package com.revature.practise;

public class CaptureFeedback {
	private String Topic_name;
    private String Question_text;
    private int Rating;
    
    
	public CaptureFeedback() {
		super();
	}


	public CaptureFeedback(String topic_name, String question_text, int rating) {
		super();
		Topic_name = topic_name;
		Question_text = question_text;
		Rating = rating;
	}


	public String getTopic_name() {
		return Topic_name;
	}


	public void setTopic_name(String topic_name) {
		Topic_name = topic_name;
	}


	public String getQuestion_text() {
		return Question_text;
	}


	public void setQuestion_text(String question_text) {
		Question_text = question_text;
	}


	public int getRating() {
		return Rating;
	}


	public void setRating(int rating) {
		Rating = rating;
	}
    
    
}
