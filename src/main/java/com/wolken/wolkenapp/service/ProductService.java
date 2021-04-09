package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dto.ProductDTO;
import com.wolken.wolkenapp.entity.ProductEntity;


public interface ProductService {
	
	public String ValidateAndAdd(ProductDTO productDTO);
	public ProductEntity ValidateAndGet(String p_cakeName);


}
