package com.springcurd.dao;

import com.springcurd.pojo.Login;
import com.springcurd.pojo.User;

public interface LoginDao {
	
public boolean validateUser(Login login);
}
