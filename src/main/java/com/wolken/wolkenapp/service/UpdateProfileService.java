package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dto.UpdateDTO;
import com.wolken.wolkenapp.entity.CakeEntity;

public interface UpdateProfileService {
	
	public CakeEntity ValidateAndGet(String emailId);
	
	public  String ValidateAndUpdate(UpdateDTO dto);

}
