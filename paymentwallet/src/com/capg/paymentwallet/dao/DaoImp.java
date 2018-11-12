package com.capg.paymentwallet.dao;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import com.capg.paymentwallet.bean.CustomerBean;
import com.capg.paymentwallet.bean.Transfer;
import com.capg.paymentwallet.exception.CustomerException;

public class DaoImp implements IDaoInterface {
	Transfer transfer=new Transfer();
	CustomerBean customerbean = new CustomerBean();
	ArrayList<CustomerBean> list = new ArrayList<CustomerBean>();
	static ArrayList<String> printList = new ArrayList<String>();

	@Override
	public boolean createAccount(CustomerBean customerBean) {
		return list.add(customerBean);

	}

	



	@Override
	public boolean fundTransfer(long accNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validate(CustomerBean customer) throws CustomerException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double showBalance(BigInteger phoneNo) {
		// TODO Auto-generated method stub
		if (phoneNo == customerbean.getPhno()) {
			double amt = customerbean.getBalance();
			System.out.println("the total balance in your account is:" + amt);
		}
		return customerbean.getBalance();

	}



	@Override
	public double deposit(BigInteger phoneNo, double amt) {
		if(phoneNo == customerbean.getPhno())
        {
   		 double amount = customerbean.getBalance()+amt;
   		 transfer.setDepositAmount(amount);
   	
   		 LocalDate date =  LocalDate.now();
   		 transfer.setDate(date);
   		 LocalTime time = LocalTime.now();
   		 transfer.setTime(time);
   		 customerbean.setBalance(amt);
   		 
   		 
   	}
   	 return transfer.getDepositAmount();
		//return amt;
		// TODO Auto-generated method stub
		
	}





	





	@Override
	public double withDraw(BigInteger phoneNo1, Double amtWth) {
		 if(phoneNo1 == customerbean.getPhno())
         {
			 if( customerbean.getBalance() > amtWth )
			 {
				 
    		 double amt = customerbean.getBalance()-amtWth;
    		 transfer.setWithdrawAmount(amt);
    		 LocalDate date =  LocalDate.now();
    		transfer.setDate(date);
    		 LocalTime time = LocalTime.now();
    		transfer.setTime(time);
    		 customerbean.setBalance(amt);

			 }
			 else{
				 System.out.println("insufficient balance");
			 }
			
    	}
		return customerbean.getBalance();
	 
	}







}
