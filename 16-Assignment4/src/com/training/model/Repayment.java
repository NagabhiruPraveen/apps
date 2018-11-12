package com.training.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RP_MASTER")
public class Repayment {
	@Id
	int repaymentId;
	double repayAmount;
	int installmentNumber;
	public int getRepaymentId() {
		return repaymentId;
	}
	public void setRepaymentId(int repaymentId) {
		this.repaymentId = repaymentId;
	}
	public double getRepayAmount() {
		return repayAmount;
	}
	public void setRepayAmount(double repayAmount) {
		this.repayAmount = repayAmount;
	}
	public int getInstallmentNumber() {
		return installmentNumber;
	}
	public void setInstallmentNumber(int installmentNumber) {
		this.installmentNumber = installmentNumber;
	}
	@Override
	public String toString() {
		return "Repayment [repaymentId=" + repaymentId + ", repayAmount="
				+ repayAmount + ", installmentNumber=" + installmentNumber
				+ "]";
	}
	public Repayment(int repaymentId, double repayAmount, int installmentNumber) {
		super();
		this.repaymentId = repaymentId;
		this.repayAmount = repayAmount;
		this.installmentNumber = installmentNumber;
	}
	public Repayment() {
		super();
	}

}
