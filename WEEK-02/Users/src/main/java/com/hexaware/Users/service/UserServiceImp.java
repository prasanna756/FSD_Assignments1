package com.hexaware.Users.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.Users.dao.IUserDao;
import com.hexaware.Users.entity.Users;
import com.hexaware.Users.exceptions.UserNotFoundException;


@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	IUserDao dao;

	@Override
	public boolean createUser(Users user) {
		
		
		return dao.createUser(user);
	}

	@Override
	public boolean updateUser(Users user) {
		
		return dao.updateUser(user);
	}

	@Override
	public boolean deleteUserById(int userID) {
		
		return dao.deleteUserById(userID);
	}

	@Override
	public Users selectUserById(int userID) {
		Users user=dao.selectUserById(userID);
		
		if (user == null) {
            throw new UserNotFoundException("User not found with ID: " + userID);
        }
		
		return user;
	}

	@Override
	public List<Users> selectAllUsers() {
		
		return dao.selectAllUsers();
	}

}
