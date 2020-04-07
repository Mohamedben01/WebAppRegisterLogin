package com.app.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	 public static final SessionFactory sessionFactory;

	    static {
	        try {
	            // Cr�ation de la SessionFactory � partir de hibernate.cfg.xml
	            sessionFactory = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
	        } catch (Throwable ex) {
	            // Make sure you log the exception, as it might be swallowed
	            System.err.println("Cr�ation de session factory � �chou�" + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }

	   // public static final ThreadLocal session = new ThreadLocal();
	   

	    public static SessionFactory getSessionFactory() {  //permet de retourner ma session
	        return sessionFactory;
	    }

}
