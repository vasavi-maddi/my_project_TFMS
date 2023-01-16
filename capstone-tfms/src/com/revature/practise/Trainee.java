package com.revature.practise;

public class Trainee {
	protected String traineeId;
	private String traineeName;
    private String qualification;
    private String experience;
    
    
	public Trainee() {
		super();
	}


	public Trainee(String traineeId, String traineeName, String qualification, String experience) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.qualification = qualification;
		this.experience = experience;
	}


	public String getTraineeId() {
		return traineeId;
	}


	public void setTraineeId(String traineeId) {
		this.traineeId = traineeId;
	}


	public String getTraineeName() {
		return traineeName;
	}


	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getExperience() {
		return experience;
	}


	public void setExperience(String experience) {
		this.experience = experience;
	}
    
}
