package com.springau.realtime.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springau.model.User;
import com.springau.realtime.dao.UserDao;

@Service
public class UserService {
	@Autowired
	UserDao userDao;
	
	public Map<Integer, User> addUser(User user) {
	
		Map<Integer, User> mapUser=new HashMap();
		List<User> userList=userDao.addUser(user);
		for(User u:userList)
			mapUser.put(u.getId(), u);
		
		return mapUser;
	}

	public Map<Integer, User> getAllUser() {
		Map<Integer, User> mapUser=new HashMap();
		List<User> userList=userDao.getAllUsers();
		for(User u:userList)
			mapUser.put(u.getId(), u);
		
		return mapUser;
	}
	
	

}
