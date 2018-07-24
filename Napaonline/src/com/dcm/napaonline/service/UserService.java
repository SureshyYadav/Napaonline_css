package com.dcm.napaonline.service;

import com.dcm.napaonline.model.Login;
import com.dcm.napaonline.model.User;

public interface UserService {
	void register(User user);
	//boolean validateUser(Login login);
	boolean validateUser(String username, String password);

}
