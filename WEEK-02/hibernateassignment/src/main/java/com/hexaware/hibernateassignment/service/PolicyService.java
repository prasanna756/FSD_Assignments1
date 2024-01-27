package com.hexaware.hibernateassignment.service;

import java.util.List;

import com.hexaware.hibernateassignment.entity.Policy;

public interface PolicyService {
	void createPolicy(Policy policy);
	void updatePolicy(Policy policy);
	void deletePolicy(int policyID);
	Policy getPolicyById(int policyID);
	List<Policy> getAllPolicies();
	

}
