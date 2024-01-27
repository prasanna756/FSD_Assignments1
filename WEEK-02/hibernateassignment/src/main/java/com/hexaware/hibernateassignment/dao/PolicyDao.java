package com.hexaware.hibernateassignment.dao;

import java.util.List;

import com.hexaware.hibernateassignment.entity.Policy;

public interface PolicyDao {
	void createPolicy(Policy policy);
	void updatePolicy(Policy policy);
	void deletePolicy(int policyID);
	Policy getPolicyById(int policyID);
	List<Policy> getAllPolicies();
	

}
