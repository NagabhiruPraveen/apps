package com.capg.paymentwallet.ui;

import java.math.BigInteger;
import java.util.Scanner;

import com.capg.paymentwallet.bean.CustomerBean;
import com.capg.paymentwallet.bean.Transfer;
import com.capg.paymentwallet.exception.CustomerException;
import com.capg.paymentwallet.service.CustomerServiceImp;
import com.capg.paymentwallet.service.ICustomerService;

public class Client {

	public static void main(String[] args) throws CustomerException {
		Transfer transfer=new Transfer();
		CustomerBean customer = new CustomerBean();
		ICustomerService service = new CustomerServiceImp();
		while (true) {
			System.out
					.println("----------welcome to wallet application------------");
			System.out.println("1.create account");
			System.out.println("2.show balance");
			System.out.println("3.deposit");
			System.out.println("4.withdraw");
			System.out.println("5.Fund Transfer");
			System.out.println("6.print transactions");
			System.out.println("7.exit");
			Scanner sc = new Scanner(System.in);

			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				System.out.println("enter your first name");
				String fname = sc.next();
				customer.setFirstName(fname);
				System.out.println("enter your last name");
				String lname = sc.next();
				customer.setLastName(lname);
				System.out.println("enter your age");
				int age = sc.nextInt();
				customer.setAge(age);
				System.out.println("enter your mobile number:");
			    BigInteger phno=sc.nextBigInteger();
				customer.setPhno(phno);
				System.out.println("enter your mail-id");
				String mail = sc.next();
				customer.setEmailId(mail);
				System.out.println("Enter your PAN number");
				String panNum = sc.next();
				customer.setPanNum(panNum);
				System.out.println("Enter your address");
				String add = sc.next();
				customer.setAddress(add);
				System.out.println("Enter balance to open account");
				double bal=sc.nextDouble();
				customer.setBalance(bal);
				/*System.out.println("set your pin number");
				int pin=sc.nextInt();
				customer.setPin(pin);*/

				boolean isValid = service.validate(customer);
				if (isValid) {
					System.out.println("valid details");
					System.out.println("Account successfully created");
				} else {
					System.out.println("sorry invalid details");
				}
				break;
			case 2:System.out.println("Enter your phone number");
			BigInteger phno1=sc.nextBigInteger();
			service.showBalance(phno1);
				
				break;
			case 3:
				//System.out.println("enter the amount to deposit");
				System.out.println("enter your Phone Number:");
				BigInteger phoneNo = sc.nextBigInteger();
				System.out.println("Enter the amount to deposit:");
				double amt=sc.nextDouble();
				transfer.setDepositAmount(amt);
				service.deposit(phoneNo,amt);
				break;
			case 4:
				System.out.println("Enter your phone number");
				BigInteger phoneNo1 = sc.nextBigInteger();
				
				System.out.println("enter the amount to withdraw:");
				Double amtWth = sc.nextDouble();
				transfer.setWithdrawAmount(amtWth);
				service.withDraw(phoneNo1,amtWth);
				break;
			case 5:
				System.out.println("enter the amount to transfer");
				Double traAmt = sc.nextDouble();
				break;
			case 6:
				break;
			case 7:
				System.out.println("exit");
				System.exit(0);
				break;
			default:
				System.err.println("Invalid choice");
				break;

			}
		}

	}
}
