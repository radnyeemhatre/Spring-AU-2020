package com.springau.realtime.dao;

import java.util.List;

import com.springau.model.User;

public interface UserDao {
	
	public List<User> addUser(User u);
	public List<User> getAllUsers();
	

}
