package com.app.services;

import javax.faces.bean.ManagedBean;


import org.hibernate.Session;

import com.app.entities.User;
import com.app.util.HibernateUtil;

@ManagedBean
public class UserService {
	public void addUser(String firstname,String lastname,String gender,String birth,String email,String password, String phone) {

		Session session =  HibernateUtil.getSessionFactory().getCurrentSession(); 
		session.beginTransaction();  
		User p = new User();
		p.setFirstname(firstname);
		p.setLastname(lastname);
		p.setGender(gender);
		p.setBirth(birth);
		p.setEmail(email);
		p.setPassword(password);
		p.setPhone(phone);
		session.save(p);//la méthode .save qui va créer une commande SQL pour inserer une nouvelle personne pour l'inserer dans la BD
		session.getTransaction().commit();
	}

}
