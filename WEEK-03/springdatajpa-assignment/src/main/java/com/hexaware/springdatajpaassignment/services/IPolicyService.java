package com.hexaware.springdatajpaassignment.services;

import java.util.List;

import com.hexaware.springdatajpaassignment.entity.Policy;

public interface IPolicyService {
	Policy addPolicy(Policy policy);
    Policy updatePolicy(Policy policy);
    Policy getPolicyById(int policyId);
    void deletePolicyById(int policyId);
    List<Policy> getAllPolicies();
    List<Policy> getPoliciesByCompany(String company);

}
