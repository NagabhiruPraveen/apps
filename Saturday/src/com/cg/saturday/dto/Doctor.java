package com.cg.saturday.dto;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "sipcot")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Doc_Id")
	private Integer dId;

	@Column(name = "D_Name")
	@NotEmpty(message = "name should not be empty")
	private String dName;

	@Column(name = "D_spec")
	private String specialization;

	@Column(name = "D_sal")
	
	private Double salary;

	@Column(name = "D_gender")
	private String dGender;

	public Integer getdId() {
		return dId;
	}

	public void setdId(Integer dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getdGender() {
		return dGender;
	}

	public void setdGender(String dGender) {
		this.dGender = dGender;
	}

}
