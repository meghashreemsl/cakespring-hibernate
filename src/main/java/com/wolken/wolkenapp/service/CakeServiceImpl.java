package com.wolken.wolkenapp.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.dao.CakeDAO;
import com.wolken.wolkenapp.dto.CakeDTO;
import com.wolken.wolkenapp.entity.CakeEntity;
import com.wolken.wolkenapp.exception.MyException;

@Component
public class CakeServiceImpl implements CakeService {
	
	Logger logger = Logger.getLogger("CakeServiceImpl");
	
    @Autowired
	CakeDAO cakeDAO;
    
	public String validateAndSave(CakeDTO cakeDTO) throws MyException {
		 
		logger.info("inside validate and save");
		if(cakeDTO.getCakeId()>0) {
			if(cakeDTO.getUserName()!=null && cakeDTO.getUserName().length()<=18) {
				if(cakeDTO.getEmailId()!=null) {
					if(cakeDTO.getContactNo()>0) {
						if(cakeDTO.getDob()!=null) {
							if(cakeDTO.getPassword()!=null) {
								if(cakeDTO.getConfirmPassword()!= null){
									CakeEntity cakeentity = new CakeEntity();
									 cakeentity=cakeDAO.getByuser(cakeDTO.getUserName());
									 if(cakeentity==null) {
										 CakeEntity cakeEntity=new CakeEntity();
										 logger.info("setting the values");
										 logger.info("setting cake id");
										 cakeEntity.setCakeId(cakeDTO.getCakeId());
										 logger.info("setting username");
										 cakeEntity.setUserName(cakeDTO.getUserName());
										 logger.info("setting email id");
										 cakeEntity.setEmailId(cakeDTO.getEmailId());
										 logger.info("setting contact no");
										 cakeEntity.setContactNo(cakeDTO.getContactNo());
										 logger.info("setting dob");
										 cakeEntity.setDob(cakeDTO.getDob());
										 logger.info("setting gender");
										 cakeEntity.setGender(cakeDTO.getGender());
										 logger.info("setting password");
										 cakeEntity.setPassword(cakeDTO.getPassword());
										 logger.info("setting confirm password");
										 cakeEntity.setConfirmPassword(cakeDTO.getConfirmPassword());
										cakeDAO.save(cakeEntity);
										 }
									 else{
										 
								return "user already exists";
									 }
									
								}else
								logger.info(" confirm password is invalid");
							}
							else {
								logger.info("password is invalid");
							}
						}else {
							logger.info("dob is invalid");
						}
						
					}else {
						logger.info("contact no is invalid");
					}
					
				}else{
					logger.info("mail id is invalid");
				}
				
			}else {
				logger.info("username is invalid");
			}
		}else {
			
			logger.info("cake id is invalid");
			throw new MyException();
		}
		return "data saved";

	}

}
