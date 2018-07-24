package com.dcm.napaonline.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dcm.napaonline.model.Login;
import com.dcm.napaonline.model.User;
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory factory;

	@Override
	public void register(User user) {
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		session.save(user);
		tx.commit();

	}

	/*@Override
	public boolean validateUser(Login login) {
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		boolean isValidUser=false;
		System.out.println("................");
		String sqlQuery = "from User u where u.username=? and u.password=?";
		
		try{
			List<Login> userObj=(List)session.get(sqlQuery, Login.class);
			
			if(userObj != null && userObj.size() > 0) {
				isValidUser=true;
			}
		} catch(Exception e){
			isValidUser = false;

		}
		
		return isValidUser;
		
		
	}*/

	@Override
	public boolean validateUser(String username, String password) {
		System.out.println("In Check login");
		Session session=factory.openSession();
		boolean userFound=false;
		String SQL_QUERY =" from User as o where o.username=? and o.password=?";
		Query query=session.createQuery(SQL_QUERY);
		query.setParameter(0, username);
		query.setParameter(1, password);
		List list=query.list();
		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}
		
		return userFound;
	}

}
