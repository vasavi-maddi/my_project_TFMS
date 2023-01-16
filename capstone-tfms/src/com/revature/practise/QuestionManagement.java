package com.revature.practise;

public class QuestionManagement {
	protected String questionId;
    private String questionText;
    
    
	public QuestionManagement() {
		super();
	}


	public QuestionManagement(String questionId, String questionText) {
		super();
		this.questionId = questionId;
		this.questionText = questionText;
	}


	public String getQuestionId() {
		return questionId;
	}


	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}


	public String getQuestionText() {
		return questionText;
	}


	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
 
	
}
