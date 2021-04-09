package com.wolken.wolkenapp.dao;

import com.wolken.wolkenapp.dto.UpdateDTO;
import com.wolken.wolkenapp.entity.CakeEntity;
import com.wolken.wolkenapp.entity.LoginEntity;

public interface LoginDAO {
	
	public LoginEntity Login(String userName);
	
	public CakeEntity get(String email);
	
	public int update(UpdateDTO dto);
   
	

}
