package com.springau.realtime.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.springau.model.User;
import com.springau.realtime.rowmapperlambda.RowMapperLambda;
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public List<User> addUser(User u) {
		System.out.println(u);
		SqlParameterSource parameters = new MapSqlParameterSource();
		((MapSqlParameterSource) parameters).addValue("id", u.getId());
		((MapSqlParameterSource) parameters).addValue("name", u.getName());
		((MapSqlParameterSource) parameters).addValue("email", u.getEmail());
		((MapSqlParameterSource) parameters).addValue("contact", u.getContact());
		String query ="insert into users value(:id,:name,:email,:contact)";
		jdbcTemplate.update(query, parameters);
		System.out.println(u);
		
		return getAllUsers();
	}

	@Override
	public List<User> getAllUsers() {
		String query ="select * from users";
		return jdbcTemplate.query(query,RowMapperLambda.userRowMapperLambda);
	}

}
