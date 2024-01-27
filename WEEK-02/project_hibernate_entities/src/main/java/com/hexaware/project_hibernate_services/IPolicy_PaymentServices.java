package com.hexaware.project_hibernate_services;

import java.util.List;

import com.hexaware.project_hibernate_entities.Policy_payment;

public interface IPolicy_PaymentServices {
	public Policy_payment createPolicyPayment(Policy_payment policyPayment);

	public Policy_payment updatePolicyPayment(Policy_payment policyPayment);

	public void deletePolicyPaymentByTransactionId(String transactionId);

	public Policy_payment getPolicyPaymentByTransactionId(String transactionId);

	public Policy_payment getPolicyPaymentByPolicyId(Policy_payment policyId);

	public List<Policy_payment> getAllPolicyPayment();

}
