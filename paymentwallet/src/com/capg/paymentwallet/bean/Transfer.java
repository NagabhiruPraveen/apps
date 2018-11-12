package com.capg.paymentwallet.bean;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transfer {
	private LocalDate date;
	private LocalTime time;
public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
private double depositAmount;
private double  withdrawAmount;
public double getDepositAmount() {
	return depositAmount;
}
public void setDepositAmount(double depositAmount) {
	this.depositAmount = depositAmount;
}
public double getWithdrawAmount() {
	return withdrawAmount;
}
public void setWithdrawAmount(double withdrawAmount) {
	this.withdrawAmount = withdrawAmount;
}

}
