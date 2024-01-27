package com.hexaware.project_hibernate_entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Policies")
public class Policies {

	@Id
	@Column(name = "PolicyID")
	private int policyId;

	@Column(name = "PolicyName")
	private String policyName;

	@Column(name = "Company")
	private String company;

	@Column(name = "PolicyType")
	private String policyType;

	@Column(name = "MaturityAmount")
	private Double maturityAmount;

	@Column(name = "InitialDeposit")
	private Double initialDeposit;

	@Column(name = "TermsPerYear")
	private int termsPerYear;

	@Column(name = "TermAmount")
	private Double termAmount;

	@Column(name = "Interest")
	private Double interest;

	@OneToMany(mappedBy = "policy", cascade = CascadeType.ALL)
	private List<User_Policy> userPolicies;

	public Policies() {
		super();
	}

	public Policies(int policyId, String policyName, String company, String policyType, Double maturityAmount,
			Double initialDeposit, int termsPerYear, Double termAmount, Double interest,
			List<User_Policy> userPolicies) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.company = company;
		this.policyType = policyType;
		this.maturityAmount = maturityAmount;
		this.initialDeposit = initialDeposit;
		this.termsPerYear = termsPerYear;
		this.termAmount = termAmount;
		this.interest = interest;
		this.userPolicies = userPolicies;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
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

	public Double getMaturityAmount() {
		return maturityAmount;
	}

	public void setMaturityAmount(Double maturityAmount) {
		this.maturityAmount = maturityAmount;
	}

	public Double getInitialDeposit() {
		return initialDeposit;
	}

	public void setInitialDeposit(Double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}

	public int getTermsPerYear() {
		return termsPerYear;
	}

	public void setTermsPerYear(int termsPerYear) {
		this.termsPerYear = termsPerYear;
	}

	public Double getTermAmount() {
		return termAmount;
	}

	public void setTermAmount(Double termAmount) {
		this.termAmount = termAmount;
	}

	public Double getInterest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}

	public List<User_Policy> getUserPolicies() {
		return userPolicies;
	}

	public void setUserPolicies(List<User_Policy> userPolicies) {
		this.userPolicies = userPolicies;
	}

}
