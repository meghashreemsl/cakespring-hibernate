package com.wolken.wolkenapp.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ProductDTO {
	

	private int p_cakeId;
	
	private String p_cakeName;
	
	private int p_cakePrice;
	
	private int p_quantity;
	
	private int p_rating;

}
