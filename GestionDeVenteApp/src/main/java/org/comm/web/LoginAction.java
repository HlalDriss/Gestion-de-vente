package org.comm.web;

import org.comm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction  {


	@Autowired
	private UserService service;
	
	public String username;
	public String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String login()throws Exception{
		if(isInvalid(username)){
			System.out.println(username);
			return  "success";
			
		}else{
			return "input";
		}
	}
   private boolean isInvalid(String username){
	   return service.isValidUser(username);
   }

}
