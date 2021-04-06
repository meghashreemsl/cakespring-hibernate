package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dto.CakeDTO;
import com.wolken.wolkenapp.entity.CakeEntity;
import com.wolken.wolkenapp.exception.MyException;

public interface CakeService {
	
	public String validateAndSave(CakeDTO cakeDTO) throws MyException;
    

}
