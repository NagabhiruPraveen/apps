package com.capgemini.doctor.bean;

import javax.persistence.Embeddable;

@Embeddable
public class Qualification {
	private int experience;
	private String qualification;
	
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	@Override
	public String toString() {
		return "Qualification [experience=" + experience + ", qualification="
				+ qualification + "]";
	}
}
