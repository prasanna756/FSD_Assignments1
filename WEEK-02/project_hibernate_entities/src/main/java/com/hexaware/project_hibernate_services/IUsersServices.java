package com.hexaware.project_hibernate_services;

import java.util.List;

import com.hexaware.project_hibernate_entities.Users;

public interface IUsersServices {
	public Users createUser(Users user);
	public Users updateUser(Users user);
	public void deleteByUserId(int userId);
    public Users getUserByEmail(String email);
    public List<Users> getUserByUserType(String userType);
    public Users getUserByMobNo(String mobNo);
	public List<Users> getAllUser();

}
