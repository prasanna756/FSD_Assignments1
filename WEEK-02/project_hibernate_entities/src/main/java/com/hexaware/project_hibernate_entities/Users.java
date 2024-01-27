package com.hexaware.project_hibernate_entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class Users {

	@Id
	@Column(name = "UserID")
	private int userId;

	@Column(name = "EmailAddress")
	private String emailAddress;

	@Column(name = "ContactNo")
	private String contactNo;

	@Column(name = "Password")
	private String password;

	@Column(name = "FirstName")
	private String firstName;

	@Column(name = "LastName")
	private String lastName;

	@Column(name = "DateOfBirth")
	private Date dateOfBirth;

	@Column(name = "PANNo")
	private String panNo;

	@Column(name = "EmployerType")
	private String employerType;

	@Column(name = "EmployerName")
	private String employerName;

	@Column(name = "Salary")
	private Double salary;

	@Column(name = "UserType")
	private String userType;

	@ManyToOne
	@JoinColumn(name = "addressId")
	private Address address;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<User_Policy> user_Policies;

	public Users() {
		super();

	}

	public Users(int userId, String emailAddress, String contactNo, String password, String firstName, String lastName,
			Date dateOfBirth, String panNo, String employerType, String employerName, Double salary, String userType,
			Address address, List<User_Policy> userPolicies) {
		super();
		this.userId = userId;
		this.emailAddress = emailAddress;
		this.contactNo = contactNo;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.panNo = panNo;
		this.employerType = employerType;
		this.employerName = employerName;
		this.salary = salary;
		this.userType = userType;
		this.address = address;
		this.user_Policies = userPolicies;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getEmployerType() {
		return employerType;
	}

	public void setEmployerType(String employerType) {
		this.employerType = employerType;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<User_Policy> getUserPolicies() {
		return user_Policies;
	}

	public void setUserPolicies(List<User_Policy> userPolicies) {
		this.user_Policies = userPolicies;
	}

}
