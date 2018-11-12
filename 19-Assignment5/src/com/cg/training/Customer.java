package com.cg.training;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer_table")
public class Customer {
	@Id
	@GeneratedValue
	private int cus_Id;
	
	private String cus_Name;
	
	private Date date;
	
	public int getCus_Id() {
		return cus_Id;
	}
	public void setCus_Id(int cus_Id) {
		this.cus_Id = cus_Id;
	}
	public String getCus_Name() {
		return cus_Name;
	}
	public void setCus_Name(String cus_Name) {
		this.cus_Name = cus_Name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<Bank> getBankList() {
		return bankList;
	}
	public void setBankList(List<Bank> bankList) {
		this.bankList = bankList;
	}
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="customerList")
	private List<Bank> bankList=new ArrayList<>();
	
	public void addBank(Bank bank){
		this.bankList.add(bank);
	}
}
