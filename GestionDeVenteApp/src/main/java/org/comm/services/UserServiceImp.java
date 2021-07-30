package org.comm.services;

import org.comm.dao.UserDAO;
import org.comm.enties.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDAO dao;
	
	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

	@Override
	public User getUser(int code) {
	
		return dao.getUser(code);
	}

	@Override
	public boolean isValidUser(String username) {
	
		return dao.isValidUser(username);
	}

	@Override
	public User save(User user) {
	     dao.save(user);
		return user;
	}

}
