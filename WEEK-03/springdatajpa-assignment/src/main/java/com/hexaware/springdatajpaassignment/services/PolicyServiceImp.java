package com.hexaware.springdatajpaassignment.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springdatajpaassignment.entity.Policy;
import com.hexaware.springdatajpaassignment.repository.PolicyRepository;

@Service
public class PolicyServiceImp implements IPolicyService {

	
	@Autowired
	PolicyRepository repo;
	
	Logger logger=LoggerFactory.getLogger(PolicyServiceImp.class);
	
	@Override
	public Policy addPolicy(Policy policy) {
		logger.info(policy+"Policy is added");
		return repo.save(policy);
		
	}

	@Override
	public Policy updatePolicy(Policy policy) {
		return repo.save(policy);
	}

	@Override
	public Policy getPolicyById(int policyId) {
		return repo.findById(policyId).orElse(null);
	}

	@Override
	public void deletePolicyById(int policyId) {
		repo.deleteById(policyId);
		
	}

	@Override
	public List<Policy> getAllPolicies() {
		return repo.findAll();
	}

	@Override
	public List<Policy> getPoliciesByCompany(String company) {
		return repo.findByCompany(company);
	}

}
