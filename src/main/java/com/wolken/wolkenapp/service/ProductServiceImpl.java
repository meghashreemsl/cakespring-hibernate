package com.wolken.wolkenapp.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.dao.ProductDAO;
import com.wolken.wolkenapp.dto.ProductDTO;
import com.wolken.wolkenapp.entity.CakeEntity;
import com.wolken.wolkenapp.entity.ProductEntity;

@Service
public class ProductServiceImpl implements ProductService {

Logger logger = Logger.getLogger("ProductServiceImpl");
	
    @Autowired
	ProductDAO productDAO;
    
	public String ValidateAndAdd(ProductDTO productDTO) {
		if(productDTO.getP_cakeId()>0) {
			if(productDTO.getP_cakeName()!=null) {
				if(productDTO.getP_cakePrice()>0) {
					if(productDTO.getP_quantity()>0) {
						if(productDTO.getP_rating()>0) {
							ProductEntity productEntity = new ProductEntity();
							productEntity=productDAO.getBySearch(productDTO.getP_cakeName());
							if(productEntity==null) {
								 ProductEntity productEntity1=new ProductEntity();
								 productEntity1.setP_cakeId(productDTO.getP_cakeId());
								 productEntity1.setP_cakeName(productDTO.getP_cakeName());
								 productEntity1.setP_cakePrice(productDTO.getP_cakePrice());
								 productEntity1.setP_quantity(productDTO.getP_quantity());
								 productEntity1.setP_rating(productDTO.getP_rating());
							productDAO.add(productEntity);
						}
						
					}else {
						logger.info("quantity is invalid");
					}
					
				}else {
					logger.info("cake price is invalid");
				}
				
			}else {
				logger.info("cake name is invalid");
			}
			
		}else {
			logger.info(" product cake id is invalid");
		}
		
		//return "product data saved";
	}
		return "product data saved";

}

	public ProductEntity ValidateAndGet(String p_cakeName) {
		
	logger.info("inside validate and get by cake name");
	ProductEntity productEntity =productDAO.getBySearch(p_cakeName);
	return productEntity;
	}
}
