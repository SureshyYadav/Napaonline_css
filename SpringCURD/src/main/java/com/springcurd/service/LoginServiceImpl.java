package com.springcurd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springcurd.dao.LoginDao;
import com.springcurd.pojo.Login;
import com.springcurd.pojo.User;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDao loginDao;

     @Transactional
	public boolean validateUser(Login login) {
    	 return loginDao.validateUser(login);		
		
		 
	}

}
