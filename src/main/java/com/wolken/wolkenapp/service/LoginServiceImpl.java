package com.wolken.wolkenapp.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.dao.LoginDAO;
import com.wolken.wolkenapp.dto.LoginDTO;
import com.wolken.wolkenapp.entity.LoginEntity;

@Service
public class LoginServiceImpl implements LoginService {

	Logger logger = Logger.getLogger("LoginServiceImpl");
	@Autowired
	LoginEntity loginEntity;
	@Autowired
	LoginDAO loginDAO;

	public String ValidateAndLogin(LoginDTO loginDTO) {
		if (loginDTO != null) {
			logger.info("======================="+loginDTO.getUserName());
			LoginEntity loginEntity = loginDAO.Login(loginDTO.getUserName());
			if (loginEntity != null) {
				if (loginDTO.getUserName().equals(loginEntity.getUserName())) {
					if (loginDTO.getPassword().equals(loginEntity.getPassword())) {
						logger.info("login successfull");
						return loginEntity.getUserName() ;
					} else {
						return "password is incorrect";
					}
				} else {
					return "username is invalid";
				}
			} else {
				return "login entity is null";
			}
		} else {
			return "entity is null";
		}
	}
}
