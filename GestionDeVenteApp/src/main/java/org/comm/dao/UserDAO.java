package org.comm.dao;


import org.comm.enties.User;

public interface UserDAO {

   
    public User getUser(int code);
    boolean isValidUser(String username);
	public   User save(User user);
   }
