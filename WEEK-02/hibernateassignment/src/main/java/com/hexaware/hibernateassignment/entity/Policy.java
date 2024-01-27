package com.hexaware.hibernateassignment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Policy_Details")
public class Policy {
	@Id
	@Column(name = "policy_id")
	private int policyID;

	@Column(name = "policy_name")
	private String policyName;
	
	@Column(name = "company")
	private String company;

	@Column(name = "policy_type")
	private String policyType;

	public Policy() {
		super();

	}

	public Policy(int policyID, String policyName, String company, String policyType) {
		super();
		this.policyID = policyID;
		this.policyName = policyName;
		this.company = company;
		this.policyType = policyType;
	}

	public int getPolicyID() {
		return policyID;
	}

	public void setPolicyID(int policyID) {
		this.policyID = policyID;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	@Override
	public String toString() {
		return "Policy [policyID=" + policyID + ", policyName=" + policyName + ", company=" + company + ", policyType="
				+ policyType + "]";
	}

}
