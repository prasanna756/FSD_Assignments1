package com.hexaware.hibernateassignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.hibernateassignment.dao.PolicyDao;
import com.hexaware.hibernateassignment.entity.Policy;

@Service
public class PolicyServiceImpl implements PolicyService {

	@Autowired
	PolicyDao dao;

	@Override
	public void createPolicy(Policy policy) {
		 dao.createPolicy(policy);

	}

	@Override
	public void updatePolicy(Policy policy) {
		dao.updatePolicy(policy);

	}

	@Override
	public void deletePolicy(int policyID) {
		dao.deletePolicy(policyID);

	}

	@Override
	public Policy getPolicyById(int policyID) {

		return dao.getPolicyById(policyID);
	}

	@Override
	public List<Policy> getAllPolicies() {

		return dao.getAllPolicies();
	}

}
