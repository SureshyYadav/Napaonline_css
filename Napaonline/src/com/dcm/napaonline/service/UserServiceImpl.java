package com.dcm.napaonline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcm.napaonline.dao.UserDao;
import com.dcm.napaonline.model.Login;
import com.dcm.napaonline.model.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public void register(User user) {
		userDao.register(user);

	}

	/*@Override
	public boolean validateUser(Login login) {
		return userDao.validateUser(login);
		
	}*/

	@Override
	public boolean validateUser(String username, String password) {
		return userDao.validateUser(username,password);
	}

}
