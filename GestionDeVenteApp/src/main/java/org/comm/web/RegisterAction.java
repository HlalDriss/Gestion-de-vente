package org.comm.web;

import org.comm.enties.User;
import org.comm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class RegisterAction {

	@Autowired
	private UserService service;
	private String username;
	private String password;
	private String confirmpassword;
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
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
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	
	public String execute() throws Exception{
		User user=new User();
		user.setUsername(username);
		user.setPsw(password);
		
		if(service.save(user)==null){
			message="Hello, username: "+username+" is already registered, please re-select the username!";
			return "input";
		}
		message="registration succeeded!";
		return "success";
	}

}


