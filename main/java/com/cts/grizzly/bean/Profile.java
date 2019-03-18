package com.cts.grizzly.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Profile")
@Table(name="profile_table")
public class Profile {

	@Id
	@Column(name="userId")

	private String userId;
	@Column(name="password")

	private String password;
	@Column(name="contactNumber")

	private long contactNumber;
	@Column(name="userType")

	private String userType;
	@Column(name="address")

	private String address;
	@Column(name="designation")

	private String designation;
	@Column(name="name")

	private String name;
	@Column(name="Id")

	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Profile [userId=" + userId + ", password=" + password + ", contactNumber=" + contactNumber
				+ ", userType=" + userType + ", address=" + address + ", designation=" + designation + ", name=" + name
				+ ", id=" + id + "]";
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Profile(String userId, String password, long contactNumber, String userType, String address) {
		super();
		this.userId = userId;
		this.password = password;
		this.contactNumber = contactNumber;
		this.userType = userType;
		this.address = address;
	}
	public Profile() {
		super();
	}
	

}
