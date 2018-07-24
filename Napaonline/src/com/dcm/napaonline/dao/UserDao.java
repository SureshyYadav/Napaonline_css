package com.dcm.napaonline.dao;

import com.dcm.napaonline.model.Login;
import com.dcm.napaonline.model.User;

public interface UserDao {
	void register(User user);
	//boolean validateUser(Login login);
	boolean validateUser(String username, String password);

}
