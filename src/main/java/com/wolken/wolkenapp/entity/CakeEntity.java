package com.wolken.wolkenapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter
@ToString
@Component
@Table(name="cake_table")
public class CakeEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	@Column(name="cake_id")
     private Integer cakeId;
	@Column(name="username")
	private String UserName;
	@Column(name="email_id")
	private String emailId;
	@Column(name="contact_no")
	private long contactNo;
	@Column(name="dob")
	private String dob;
	@Column(name="gender")
	private String gender;
	@Column(name="password")
	private String password;
	@Transient
	private String confirmPassword;
	

}

