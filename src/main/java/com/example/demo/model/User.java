package com.example.demo.model;

import java.sql.Blob;
import java.util.Date;

public class User {
	
	private int id;
	private Blob picture;
	private String name, address, phone, email, password;
	private Date registrationDate ;
	public User(int id, String name , String address, String phone, String email,
			String password, Date registrationDate, Blob picture){ 
		this.id = id;
		this.name = name;
		this.registrationDate = registrationDate;
		this.address = address;
		this.phone = phone;
		this.email  = email;
		this.password = password;
		this.picture = picture;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Blob getPicture() {
		return picture;
	}
	public void setPicture(Blob picture) {
		this.picture = picture;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" "+this.name+" "+this.registrationDate+" "+this.address+" "+this.picture+" "+this.phone
				+" "+this.email+" "+this.password;
	}
	
	

}
