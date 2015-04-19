package com.login.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
    	try{
        // 1. configuring hibernate
        Configuration configuration = new Configuration().configure();

        // 2. create sessionfactory
         sessionFactory = configuration.buildSessionFactory();
    	}catch(Throwable ex){
    		ex.printStackTrace();
    		throw ex;
    	}
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
