package com.springcurd.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springcurd.pojo.User;
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory session;

	@Override
	public void add(User user) {
		System.out.println("reached userdao impl");
		session.getCurrentSession().save(user);

	}

}
