package com.training.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="LOAN_MASTER")
public class Loan {
	@Id
int loanId;
String customerName;
double loanAmount;
List<Repayment> repaymentList= new ArrayList<Repayment>();
public int getLoanId() {
	return loanId;
}
public void setLoanId(int loanId) {
	this.loanId = loanId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public double getLoanAmount() {
	return loanAmount;
}
public void setLoanAmount(double loanAmount) {
	this.loanAmount = loanAmount;
}
public List<Repayment> getRepaymentlist() {
	return repaymentList;
}
public void setRepaymentlist(List<Repayment> repaymentlist) {
	this.repaymentList = repaymentlist;
}
@Override
public String toString() {
	return "Loan [customerName=" + customerName + ", loanAmount=" + loanAmount
			+ ", repaymentlist=" + repaymentList + "]";
}
public void addRepayment(Repayment rp){
	this.repaymentList.add(rp);
}
}
