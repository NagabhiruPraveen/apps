
package com.capg.paymentwallet.service;

import java.math.BigInteger;

import com.capg.paymentwallet.bean.CustomerBean;
import com.capg.paymentwallet.exception.CustomerException;

public interface ICustomerService {
	public boolean createAccount(CustomerBean customerBean);
	public double showBalance(BigInteger PhoneNo);
//	public double deposit(long accNum);
	//public double withDraw(long accNum);
	public boolean fundTransfer(long accNum);
	//public ArrayList<> addTransaction(long accNum);
	public boolean validate(CustomerBean customer) throws CustomerException;
	public double deposit(BigInteger phoneNo, double amt);
	public double withDraw(BigInteger phoneNo1, Double amtWth);

}
