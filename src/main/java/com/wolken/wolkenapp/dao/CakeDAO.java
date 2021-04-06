package com.wolken.wolkenapp.dao;

import com.wolken.wolkenapp.dto.CakeDTO;
import com.wolken.wolkenapp.entity.CakeEntity;

public interface CakeDAO {
	public String save(CakeEntity cakeEntity);    
	public CakeEntity getByuser(String userName);
}
