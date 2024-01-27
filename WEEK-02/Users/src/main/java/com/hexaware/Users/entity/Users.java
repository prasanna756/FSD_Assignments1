package com.hexaware.Users.entity;

import java.util.Date;

import org.springframework.stereotype.Component;


@Component
public class Users {
	
	private int userID;
    private String emailAddress;
    private String contactNo;
    private String password;
	
    public Users() {
		super();
	}

	public Users(int userID, String emailAddress, String contactNo, String password) {
		super();
		this.userID = userID;
		this.emailAddress = emailAddress;
		this.contactNo = contactNo;
		this.password = password;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Users [userID=" + userID + ", emailAddress=" + emailAddress + ", contactNo=" + contactNo + ", password="
				+ password + "]";
	}

}
