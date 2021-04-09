package com.wolken.wolkenapp.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;
import com.wolken.wolkenapp.entity.ProductEntity;

@Component
public class ProductDAOImpl  implements ProductDAO{
	
Logger logger = Logger.getLogger("ProductDAOImpl");
	
	@Autowired
	LocalSessionFactoryBean bean;
	
	public String add(ProductEntity productEntity) {
		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(productEntity);
		transaction.commit();
		session.close();
		return "product data added";
	}
	
	public ProductEntity getBySearch(String p_cakeName){
		SessionFactory factory = bean.getObject();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("select pk from ProductEntity pk where pk.p_cakeName = :pcname" );
		query.setParameter("pcname", p_cakeName);
		ProductEntity productEntity = (ProductEntity)query.uniqueResult();
		//query.executeUpdate();
		transaction.commit();
		session.close();
		return  productEntity;
		
	}

}
