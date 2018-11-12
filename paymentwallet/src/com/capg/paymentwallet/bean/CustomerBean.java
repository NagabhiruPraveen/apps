package com.capg.paymentwallet.bean;

import java.math.BigInteger;

public class CustomerBean {
//	private long accNum;
	private String firstName;
	private String lastName;
	private BigInteger phno;
	private String emailId;
	private String panNum;
	private int age;
	private String address;

	private double balance;
	private int pin;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}*/

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstNmae) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPanNum() {
		return panNum;
	}

	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	

	public BigInteger getPhno() {
		return phno;
	}

	public void setPhno(BigInteger phno) {
		this.phno = phno;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	

}
