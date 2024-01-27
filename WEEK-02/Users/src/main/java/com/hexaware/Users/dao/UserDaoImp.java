package com.hexaware.Users.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.Users.entity.Users;

@Repository
public class UserDaoImp implements IUserDao {
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public UserDaoImp(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
		System.out.println(jdbcTemplate);
	}

	@Override
	public boolean createUser(Users user) {
		String insertQuery="INSERT INTO Users(userID,emailAddress,contactNo,password) values (?,?,?,?)";
		int count = jdbcTemplate.update(insertQuery, user.getUserID(), user.getEmailAddress(), user.getContactNo(),user.getPassword());
        return count > 0;
	}

	@Override
	public boolean updateUser(Users user) {
		String updateQuery = "UPDATE Users SET emailAddress=?, contactNo=?, password=? WHERE userID=?";
        int count = jdbcTemplate.update(updateQuery, user.getEmailAddress(), user.getContactNo(), user.getPassword(),user.getUserID());
        return count > 0;
	}

	@Override
	public boolean deleteUserById(int userID) {
		String deleteQuery = "DELETE FROM Users WHERE userID=?";
        int count = jdbcTemplate.update(deleteQuery, userID);
        return count > 0;
	
	}

	@Override
	public Users selectUserById(int userID) {
		String selectQueryById = "SELECT userID, emailAddress, contactNo, password FROM Users WHERE userID=?";
		Users user = jdbcTemplate.queryForObject(selectQueryById, new UsersMapper(), userID);
        return user;
	}

	@Override
	public List<Users> selectAllUsers() {
		String selectQuery = "SELECT userID, emailAddress, contactNo, password FROM Users";
        List<Users> userList = jdbcTemplate.query(selectQuery, new UsersMapper());
        return userList;

	}

}
