package com.example.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.Produces;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Path("/apis")
public class Employee{
	public static LinkedList<String> arr=new LinkedList<>();
	@POST
	@Path("/post/{item}")
	@Produces("application/html")
	public String[] getAllUsers(@PathParam("item") String item) {
		arr.add(item);
		String str[] = new String[arr.size()]; 
		for (int j = 0; j < arr.size(); j++) { 
			  
			System.out.println(arr.get(j));
            str[j] = arr.get(j); 
        } 
		return str;
	}
	@GET
	@Path("/get")
	@Produces("application/json")
	public String[] getAllUsers1() {
		
		
		String str[] = new String[arr.size()]; 
		for (int j = 0; j < arr.size(); j++) { 
			  
			System.out.println(arr.get(j));
            str[j] = arr.get(j); 
        } 
		return str;
	}
	@PUT
	@ResponseBody
	@Path("/put/{item}")
	public String getAllUsersput(@PathParam("item") String item) {
		arr.add(item);
		return "put "+item+"successfully";
	}
	@DELETE
	@Path("/delete/{item}")
	@Produces("application/text")
	public String getAllUsersdel(@PathParam("item") String item) {
		
		arr.remove(item);
		return "removed "+item+ " successfully";
	}
}
