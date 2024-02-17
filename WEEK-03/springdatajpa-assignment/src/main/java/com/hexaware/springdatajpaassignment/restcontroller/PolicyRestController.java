package com.hexaware.springdatajpaassignment.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springdatajpaassignment.entity.Policy;
import com.hexaware.springdatajpaassignment.services.IPolicyService;
import com.hexaware.springdatajpaassignment.services.PolicyServiceImp;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/policies")
public class PolicyRestController {

	@Autowired
	IPolicyService service;
	
	Logger logger=LoggerFactory.getLogger(PolicyServiceImp.class);

	@PostMapping("/add")
	public Policy addPolicy(@RequestBody @Valid Policy policy) {
		logger.info("PolicyController is being executec..");
		return service.addPolicy(policy);
	}

	@PutMapping("/update")
	public Policy updatePolicy(@RequestBody Policy policy) {
		return service.updatePolicy(policy);
	}

	@GetMapping("/get/{policyId}")
	public Policy getPolicyById(@PathVariable int policyId) {
		return service.getPolicyById(policyId);
	}

	@DeleteMapping("/delete/{policyId}")
	public void deletePolicyById(@PathVariable int policyId) {
		service.deletePolicyById(policyId);
	}

	@GetMapping("/getall")
	public List<Policy> getAllPolicies() {
		return service.getAllPolicies();
	}
	
	@GetMapping("/getbycompany/{company}")
	public List<Policy> getPoliciesByCompany(@PathVariable String company) {
		
		return service.getPoliciesByCompany(company);
	}

}
