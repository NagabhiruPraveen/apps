package com.capg.paymentwallet.exception;

public class CustomerExceptionMessage extends CustomerException{
	
	public static final String ERROR1 = "Age should be minimum 18 to open account ";
	public static final String ERROR2 = "FirstName should be greater than 4 characters";
	public static final String ERROR3 = "LastName should be greater than 4 characters";
	public static final String ERROR4 = "Phone number should be of 10 digits";
	public static final String ERROR5 = "E-mail should not be null and it should be in the form of XYZ@XYZ.com";
	
	public static final String ERROR6 = "PAN number should not be null and it should contain only upper case alphabets and numbers";
	public static final String ERROR7 = "amount should be valid";
	public static final String ERROR8="Address should not be null";
}
