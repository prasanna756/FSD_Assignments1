package com.hexaware.project_hibernate_entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PolicyPayments")
public class Policy_payment {
	@Id
	@Column(name = "PaymentID")
	private int paymentId;

	@ManyToOne
	@JoinColumn(name = "UserPolicyID")
	private User_Policy userPolicy;

	@Column(name = "TransactionID")
	private String transactionId;

	@Column(name = "PaymentDate")
	private Date paymentDate;

	@Column(name = "Bank")
	private String bank;

	@Column(name = "Amount")
	private Double amount;

	@Column(name = "Fine")
	private Double fine;

	public Policy_payment() {
		super();
	}

	public Policy_payment(int paymentId, User_Policy userPolicy, String transactionId, Date paymentDate, String bank,
			Double amount, Double fine) {
		super();
		this.paymentId = paymentId;
		this.userPolicy = userPolicy;
		this.transactionId = transactionId;
		this.paymentDate = paymentDate;
		this.bank = bank;
		this.amount = amount;
		this.fine = fine;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public User_Policy getUserPolicy() {
		return userPolicy;
	}

	public void setUserPolicy(User_Policy userPolicy) {
		this.userPolicy = userPolicy;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getFine() {
		return fine;
	}

	public void setFine(Double fine) {
		this.fine = fine;
	}

}
