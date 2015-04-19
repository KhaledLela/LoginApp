package com.login.dao;

import java.util.List;

import org.hibernate.Session;

import com.login.entity.Users;

public class UserDao {

	public Users login(String uName, String passwd){
		Session session = HibernateUtil.getSessionFactory().openSession();	
		List<Users> users = session.getNamedQuery("Users.DoLogin")
				.setParameter("uname", uName)
				.setParameter("passwd", passwd).list();
		if(users !=null && !users.isEmpty()){
			return users.get(0);
		}
		return null;
	}
}
