package com.wolken.wolkenapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@Entity
@NoArgsConstructor
@Table(name="product_table")
public class ProductEntity {

	@Id
	@Column(name="p_cakeid")
   private int p_cakeId;
	@Column(name="p_cakename")
	private String p_cakeName;
	@Column(name="p_cakeprice")
	private int p_cakePrice;
	@Column(name="p_quantity")
	private int p_quantity;
	@Column(name="p_rating")
	private int p_rating;

}
