package com.hexaware.project_hibernate_services;

import java.util.List;

import org.springframework.cglib.core.NamingPolicy;

import com.hexaware.project_hibernate_entities.Policies;

public interface IPoliciesServices {
	public Policies createPolicy(Policies policy);
	public Policies updatePolicy(Policies policy);
	public void deleteByPolicyId(int policyId);
    public List<Policies> getPolicyByPolicyType(String policyType);
    public List<Policies> getPolicyByCompany(String company);
    public List<Policies> getByAmountLessThan(double amount);
    public List<Policies> getByAmountGreaterThan(double amount);
	public List<NamingPolicy> getAllPolicy();

}
