package com.hexaware.project_hibernate_services;

import java.util.List;

import com.hexaware.project_hibernate_entities.User_Policy;
import com.hexaware.project_hibernate_entities.Users;

public interface IUserPolicyServices {
	public User_Policy createUserPolicy(User_Policy userPolicy);
	public User_Policy updateUserPolicy(User_Policy userPolicy);
	public void deleteUserPolicyByPolicyId(int policyId);
	public User_Policy getUserPolicyByPolicyId(int policyId);
	public List<User_Policy> getUserPolicyByUserId(Users userId);
	public List<User_Policy> getAllUserPolicy();

}
