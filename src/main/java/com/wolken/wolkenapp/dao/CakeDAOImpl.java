package com.wolken.wolkenapp.dao;


import org.apache.log4j.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.dto.CakeDTO;
import com.wolken.wolkenapp.entity.CakeEntity;
import com.wolken.wolkenapp.exception.MyException;


@Component
public class CakeDAOImpl implements CakeDAO{
	
	Logger logger = Logger.getLogger("CakeDAOImpl");
	
	@Autowired
	LocalSessionFactoryBean bean;

	public String save(CakeEntity cakeEntity) {
		try {
		logger.info("inside save");
		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(cakeEntity);
		transaction.commit();
		session.close();
		return "data added";
	}
    catch(Exception e){
    	logger.info("save method excuted");
    }
		return "data saved";
	
		}
	public CakeEntity getByuser(String userName)  {

		try {
		logger.info("inside getByusername");
		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("select ck from CakeEntity ck where userName = :username" );
		query.setParameter("username", userName);
		CakeEntity cakeEntity = (CakeEntity)query.uniqueResult();
		//query.executeUpdate();
		transaction.commit();
		session.close();
	    return cakeEntity;
	
}finally {
	logger.info("exceuted get byuser");
}
}
}