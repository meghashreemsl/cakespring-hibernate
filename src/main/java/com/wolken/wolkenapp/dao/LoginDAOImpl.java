package com.wolken.wolkenapp.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.wolken.wolkenapp.dto.UpdateDTO;
import com.wolken.wolkenapp.entity.CakeEntity;
import com.wolken.wolkenapp.entity.LoginEntity;


@Component
public class LoginDAOImpl implements LoginDAO {

	
	@Autowired
	LocalSessionFactoryBean bean;

	public LoginEntity Login(String userName) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query =session.createQuery("select le from LoginEntity le where le.userName = :uName");
		query.setParameter("uName", userName);
		LoginEntity loginEntity = (LoginEntity)query.uniqueResult();
		session.close();
		return loginEntity;
	}

	public CakeEntity get(String emailId) {
		
		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("select ck from CakeEntity ck where ck.emailId = :email");
		query.setParameter("email", emailId);
		CakeEntity cakeEntity = (CakeEntity)query.uniqueResult();
		session.close();
		return cakeEntity;
	}

	public int update(UpdateDTO dto) {
		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("update from CakeEntity ck set ck.cakeId= :uId, ck.userName= :uName, ck.contactNo= :ucontactNo,ck.dob= :udob,ck.gender= :ugender where ck.emailId= :uemail");
		query	.setParameter("uId",dto.getCakeId() );
		query.setParameter("uName", dto.getUserName());
		query.setParameter("ucontactNo", dto.getContactNo());
		query.setParameter("udob", dto.getDob());
		query.setParameter("ugender", dto.getGender());
		query.setParameter("uemail", dto.getEmailId());
		//CakeEntity cakeEntity = (CakeEntity)query.uniqueResult();
		int result = query.executeUpdate();
		transaction.commit();	
		session.close();
		return result;
		
	}
	
}
