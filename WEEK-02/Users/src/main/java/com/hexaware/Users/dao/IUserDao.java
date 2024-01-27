package com.hexaware.Users.dao;

import java.util.List;

import com.hexaware.Users.entity.Users;

public interface IUserDao {
	public boolean createUser(Users user);
	public boolean updateUser(Users user);
	public boolean deleteUserById(int userID);
	Users selectUserById(int userID);
	List<Users> selectAllUsers();
	

}
