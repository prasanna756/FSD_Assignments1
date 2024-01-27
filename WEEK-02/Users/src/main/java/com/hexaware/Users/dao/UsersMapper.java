package com.hexaware.Users.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.Users.entity.Users;

public class UsersMapper implements RowMapper<Users> {

    @Override
    public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
        Users user = new Users();
        user.setUserID(rs.getInt("userID"));
        user.setEmailAddress(rs.getString("emailAddress"));
        user.setContactNo(rs.getString("contactNo"));
        user.setPassword(rs.getString("password"));
        return user;
    }

}
