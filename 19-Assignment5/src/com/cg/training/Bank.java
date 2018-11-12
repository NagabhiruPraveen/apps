package com.cg.training;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="bank_table")
public class Bank {
	@Id
	@GeneratedValue
	private int bankId;
	private String bankName;
	private String headOfficeLocation;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable( name ="join_table",joinColumns = { @JoinColumn(name = "bankId") }, inverseJoinColumns = { @JoinColumn(name = "cus_Id") })
	private List<Customer> customerList=new ArrayList<>();
	
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getHeadOfficeLocation() {
		return headOfficeLocation;
	}
	public void setHeadOfficeLocation(String headOfficeLocation) {
		this.headOfficeLocation = headOfficeLocation;
	}
	
	public void addCustomer(Customer customer){
		this.customerList.add(customer);
	}
}
