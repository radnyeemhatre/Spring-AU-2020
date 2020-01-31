package com.springau.realtime.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springau.model.User;
import com.springau.realtime.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	
	@PostMapping("/adduser")
	public Map <Integer,User> addUser(@RequestBody User user)
	{
		System.out.println(user);
		return userService.addUser(user);
	}
	@GetMapping("/all")
	public Map <Integer,User> getAllUser()
	{
		return userService.getAllUser();
	}

}
