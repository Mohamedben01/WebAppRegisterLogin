package com.app.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	 public static final SessionFactory sessionFactory;

	    static {
	        try {
	            // Création de la SessionFactory à partir de hibernate.cfg.xml
	            sessionFactory = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
	        } catch (Throwable ex) {
	            // Make sure you log the exception, as it might be swallowed
	            System.err.println("Création de session factory à échoué" + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }

	   // public static final ThreadLocal session = new ThreadLocal();
	   

	    public static SessionFactory getSessionFactory() {  //permet de retourner ma session
	        return sessionFactory;
	    }

}
