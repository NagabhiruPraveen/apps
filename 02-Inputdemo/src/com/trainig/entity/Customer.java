package com.trainig.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Customer {
       @Id
int id;
String name;
int gender;
String email,phone,address;
Date dateOfJoining;
boolean privileaged;
String description;
double balanceAmount;
int customerRating;
public int getId() {
       return id;
}
public void setId(int id) {
       this.id = id;
}
public String getName() {
       return name;
}
public void setName(String name) {
       this.name = name;
}
public int getGender() {
       return gender;
}
public void setGender(int gender) {
       this.gender = gender;
}
public String getEmail() {
       return email;
}
public void setEmail(String email) {
       this.email = email;
}
public String getPhone() {
       return phone;
}
public void setPhone(String phone) {
       this.phone = phone;
}
public String getAddress() {
       return address;
}
public void setAddress(String address) {
       this.address = address;
}
public Date getDateOfJoining() {
       return dateOfJoining;
}
public void setDateOfJoining(Date dateOfJoining) {
       this.dateOfJoining = dateOfJoining;
}
public boolean isPrivileaged() {
       return privileaged;
}
public void setPrivileaged(boolean privileaged) {
       this.privileaged = privileaged;
}
public String getDescription() {
       return description;
}
public void setDescription(String description) {
       this.description = description;
}

public double getBalanceAmount() {
       return balanceAmount;
}
public void setBalanceAmount(double balanceAmount) {
       this.balanceAmount = balanceAmount;
}
public int getCustomerRating() {
       return customerRating;
}
public void setCustomerRating(int customerRating) {
       this.customerRating = customerRating;
}
@Override
public int hashCode() {
       final int prime = 31;
       int result = 1;
       result = prime * result + id;
       return result;
}
@Override
public boolean equals(Object obj) {
       if (this == obj)
              return true;
       if (obj == null)
              return false;
       if (getClass() != obj.getClass())
              return false;
       Customer other = (Customer) obj;
       if (id != other.id)
              return false;
       return true;
}
@Override
public String toString() {
       return "Customer [id=" + id + ", name=" + name + ", gender=" + gender
                     + ", email=" + email + ", phone=" + phone + ", address=" + address
                     + ", dateOfJoining=" + dateOfJoining + ", privileaged="
                     + privileaged + ", description=" + description + ", balanceAmount="
                     + balanceAmount + ", customerRating=" + customerRating + "]";
}

}

