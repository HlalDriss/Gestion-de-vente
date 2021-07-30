package org.comm.services;

import org.comm.enties.User;



public interface UserService {
 
	    public User getUser(int code);
	    boolean isValidUser(String username);
		public   User save(User user);
}
