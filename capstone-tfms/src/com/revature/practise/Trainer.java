package com.revature.practise;

public class Trainer {
	protected String trainerId;
    private String trainerName;
    private String qualification ;
	private String experience;
	
	
	public Trainer() {
		super();
	}


	public Trainer(String trainerId, String trainerName, String qualification, String experience) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.qualification = qualification;
		this.experience = experience;
	}


	public String getTrainerId() {
		return trainerId;
	}


	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}


	public String getTrainerName() {
		return trainerName;
	}


	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
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
