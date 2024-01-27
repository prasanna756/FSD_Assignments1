package com.hexaware.project_hibernate_services;

import java.util.List;

import org.springframework.cglib.core.NamingPolicy;

import com.hexaware.project_hibernate_entities.Policies;

public class PoliciesServicesImp implements IPoliciesServices {

	@Override
	public Policies createPolicy(Policies policy) {
	
		return null;
	}

	@Override
	public Policies updatePolicy(Policies policy) {
		
		return null;
	}

	@Override
	public void deleteByPolicyId(int policyId) {
		
		
	}

	@Override
	public List<Policies> getPolicyByPolicyType(String policyType) {
		
		return null;
	}

	@Override
	public List<Policies> getPolicyByCompany(String company) {
		
		return null;
	}

	@Override
	public List<Policies> getByAmountLessThan(double amount) {
		
		return null;
	}

	@Override
	public List<Policies> getByAmountGreaterThan(double amount) {
		
		return null;
	}

	@Override
	public List<NamingPolicy> getAllPolicy() {
		
		return null;
	}

}
