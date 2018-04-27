package com.springcurd.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springcurd.pojo.Login;
import com.springcurd.pojo.User;

@Repository
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	/*private JdbcTemplate jdbcTemplate;*/
	public void setSessionFactory(SessionFactory session){
		sessionFactory=session;
	}
	public Session getSession(){
		return sessionFactory.openSession();
	}

	@Override
	public boolean validateUser(Login login) {
		Session session = sessionFactory.openSession();
		boolean userFound=false;
		String sql="from User as o where o.username=? and o.username=?";
		Query query=session.createQuery(sql);
		query.setParameter(0, login.getUsername());
		query.setParameter(1, login.getPassword());
		List list=query.list();
		
		if((list!=null) &&(list.size()>0)){
			userFound=true;
		}
		session.close();
		return userFound;
		
		
	}
}
		/*String sql="Select *from user where username="+login.getUsername()+"and password="+login.getPassword()+" ";		
		List<User> users=jdbcTemplate.query(sql, new UserMapper());
		return users.size()>0 ? users.get(0) :null;		
	
	}
	class UserMapper implements RowMapper<User>{
		public User mapRow(ResultSet rs, int arg1) throws SQLException{
			User user=new User();
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setFirstname(rs.getString("firstname"));
			user.setLastname(rs.getString("lastname"));
			user.setEmail(rs.getString("email"));
			user.setAddress(rs.getString("address"));
			user.setPhone(rs.getInt("phone"));
			
			return user;
		}

		
		
	}*/


