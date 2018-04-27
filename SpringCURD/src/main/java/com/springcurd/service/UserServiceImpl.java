package com.springcurd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springcurd.dao.UserDao;
import com.springcurd.pojo.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Transactional
	public void add(User user) {
		userDao.add(user);

	}

}
