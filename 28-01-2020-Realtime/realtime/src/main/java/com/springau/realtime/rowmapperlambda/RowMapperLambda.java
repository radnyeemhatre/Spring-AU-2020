package com.springau.realtime.rowmapperlambda;

import org.springframework.jdbc.core.RowMapper;

import com.springau.model.User;


public class RowMapperLambda {
	public static final RowMapper<User> userRowMapperLambda=(rs,rownum)->
	{
		User user=new User();
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setEmail(rs.getString("email"));
		user.setContact(rs.getString("contact"));
		return user;
	};

}
