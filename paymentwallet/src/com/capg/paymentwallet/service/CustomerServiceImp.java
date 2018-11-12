package com.capg.paymentwallet.service;

import java.math.BigInteger;

import com.capg.paymentwallet.bean.CustomerBean;
import com.capg.paymentwallet.dao.DaoImp;
import com.capg.paymentwallet.dao.IDaoInterface;
import com.capg.paymentwallet.exception.CustomerException;
import com.capg.paymentwallet.exception.CustomerExceptionMessage;

public class CustomerServiceImp implements ICustomerService {
	IDaoInterface dao = new DaoImp();

	@Override
	public boolean createAccount(CustomerBean customerBean) {

		return dao.createAccount(customerBean);
	}

	

	

	

	@Override
	public boolean fundTransfer(long accNum) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean validate(CustomerBean customer) throws CustomerException {
		boolean isValid = true;
		if (!(customer.getFirstName().matches("[a-z A-Z]"))) {
			isValid = false;
			throw new CustomerException(CustomerExceptionMessage.ERROR1);
		}
		if ((customer.getFirstName() == null)) {
			isValid = false;
			throw new CustomerException(CustomerExceptionMessage.ERROR1);
		}
		if (!(customer.getLastName().matches("[a-z A-Z]"))) {
			isValid = false;
			throw new CustomerException(CustomerExceptionMessage.ERROR2);
		}
		if (customer.getLastName() == null) {
			isValid = false;
			throw new CustomerException(CustomerExceptionMessage.ERROR2);

		}
		if (!(customer.getPhno().bitLength() == 10)) {

			isValid = false;
			throw new CustomerException(CustomerExceptionMessage.ERROR5);
		}
		if (customer.getPhno() == null) {
			isValid = false;
			throw new CustomerException(CustomerExceptionMessage.ERROR5);
		}
		if (!(customer.getEmailId()
				.matches("[a-zA-Z][a-zA-z0-9-.]*@[a-zA-Z0-9]+([.][a-zA-Z)]+)+"))) {

			isValid = false;
			throw new CustomerException(CustomerExceptionMessage.ERROR3);
		}
		if (customer.getEmailId() == null) {
			isValid = false;
			throw new CustomerException(CustomerExceptionMessage.ERROR3);
		}
		if (!(customer.getPanNum().matches("[A-Z][0-9]{10}"))) {

			isValid = false;
			throw new CustomerException(CustomerExceptionMessage.ERROR4);
		}
		if ((customer.getPanNum() == null)) {
			isValid = false;
			throw new CustomerException(CustomerExceptionMessage.ERROR4);
		}
		if ((customer.getAddress() == null)
				|| !(customer.getAddress().matches("[A-Z][0-9]{10,50}"))) {
			isValid = false;
			throw new CustomerException(CustomerExceptionMessage.ERROR7);
		}
		if (customer.getAddress() == null) {
			isValid = false;
			throw new CustomerException(CustomerExceptionMessage.ERROR7);
		}
		if (!(customer.getBalance() > 0)) {
			isValid = false;
			throw new CustomerException(CustomerExceptionMessage.ERROR6);

		}
		if (customer.getBalance() == 0) {
			isValid = false;
			throw new CustomerException(CustomerExceptionMessage.ERROR6);

		}
		
		return isValid;
	}



	@Override
	public double showBalance(BigInteger PhoneNo) {
		// TODO Auto-generated method stub
		return dao.showBalance(PhoneNo);
	}





	@Override
	public double deposit(BigInteger phoneNo, double amt) {
		// TODO Auto-generated method stub
		return dao.deposit(phoneNo,amt);
	}







	@Override
	public double withDraw(BigInteger phoneNo1, Double amtWth) {
		// TODO Auto-generated method stub
		return dao.withDraw(phoneNo1,amtWth);
	}

}
