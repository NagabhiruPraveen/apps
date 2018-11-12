package com.cg.course;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class FeeDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int fid;
	double totalFees;
	int noOfInstalments;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public double getTotalFees() {
		return totalFees;
	}
	public void setTotalFees(double totalFees) {
		this.totalFees = totalFees;
	}
	public int getNoOfInstalments() {
		return noOfInstalments;
	}
	public void setNoOfInstalments(int noOfInstalments) {
		this.noOfInstalments = noOfInstalments;
	}

}
