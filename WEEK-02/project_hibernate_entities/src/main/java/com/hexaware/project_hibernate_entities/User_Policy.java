package com.hexaware.project_hibernate_entities;

import java.util.Date;
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
@Table(name = "UserPolicies")
public class User_Policy {
	@Id
	@Column(name = "UserPolicyID")
	private int userPolicyId;
	
	@ManyToOne
    @JoinColumn(name = "UserID")
	private Users user;
	
	@ManyToOne
    @JoinColumn(name = "PolicyID")
	private Policies policy;
	
	@OneToMany(mappedBy = "userPolicy", cascade = CascadeType.ALL)
	private List<Policy_payment> policyPayments;
	
	@Column(name = "RegistrationDate")
	private Date registrationDate;
	
	@Column(name = "StartDate")
	private Date startDate;
	
	@Column(name = "DurationInYears")
	private int durationInYears;

	public User_Policy() {
		super();
	}

	public User_Policy(int userPolicyId, Users user, Policies policy, Date registrationDate, Date startDate,
			int durationInYears) {
		super();
		this.userPolicyId = userPolicyId;
		this.user = user;
		this.policy = policy;
		this.registrationDate = registrationDate;
		this.startDate = startDate;
		this.durationInYears = durationInYears;
	}

	public int getUserPolicyId() {
		return userPolicyId;
	}

	public void setUserPolicyId(int userPolicyId) {
		this.userPolicyId = userPolicyId;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Policies getPolicy() {
		return policy;
	}

	public void setPolicy(Policies policy) {
		this.policy = policy;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public int getDurationInYears() {
		return durationInYears;
	}

	public void setDurationInYears(int durationInYears) {
		this.durationInYears = durationInYears;
	}

}
