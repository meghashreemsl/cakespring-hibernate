package com.wolken.wolkenapp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Component

public class CakeDTO {
	
	
     private Integer cakeId;

	private String UserName;

	private String emailId;

	private long contactNo;

	private String dob;

	private String gender;

	private String password;

	private String confirmPassword;
	

}
