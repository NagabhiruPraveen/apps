package com.training.client;
@Table(name = "Customer")
@Entity
public class Customer {
	@Id
int id;


@Column(name = "C_name", notNull = true, size = 25)
String name;
@Column(name = "C_city", notNull = true, size = 25)
String city;
double outStandingAmount;
}
