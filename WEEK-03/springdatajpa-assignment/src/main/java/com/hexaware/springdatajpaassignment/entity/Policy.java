package com.hexaware.springdatajpaassignment.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "Policies")
public class Policy {

	@Id
	@Column(name = "PolicyID")
	private int policyId;

	@NotEmpty
	@Column(name = "PolicyName")
	private String policyName;

	@Column(name = "PolicyDescription")
	private String policyDescription;

	@NotEmpty
	@Column(name = "Company")
	private String company;

	@NotEmpty
	@Column(name = "PolicyType")
	private String policyType;

	@Column(name = "MaturityAmount")
	private Double maturityAmount;

	@Column(name = "InitialDeposit")
	private Double initialDeposit;

	@Column(name = "TermPeriod")
	private String termPeriod;

	@Column(name = "TermAmount")
	private Double termAmount;

	@Column(name = "Interest")
	private Double interest;

	public Policy() {
		super();
	}

	public Policy(int policyId, @NotEmpty String policyName, String policyDescription, @NotEmpty String company,
			@NotEmpty String policyType, Double maturityAmount, Double initialDeposit,
			@NotEmpty @Pattern(regexp = "^(Monthly|Quaterly|Half-Yearly|Annually)$") String termPeriod,
			Double termAmount, Double interest) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.policyDescription = policyDescription;
		this.company = company;
		this.policyType = policyType;
		this.maturityAmount = maturityAmount;
		this.initialDeposit = initialDeposit;
		this.termPeriod = termPeriod;
		this.termAmount = termAmount;
		this.interest = interest;
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

	public String getPolicyDescription() {
		return policyDescription;
	}

	public void setPolicyDescription(String policyDescription) {
		this.policyDescription = policyDescription;
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

	public String getTermPeriod() {
		return termPeriod;
	}

	public void setTermPeriod(String termPeriod) {
		this.termPeriod = termPeriod;
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

}