package com.wolken.wolkenapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Controller;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Controller
@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@Table(name="cake_table")

public class LoginEntity {
	
	@Id
	@Column(name="cake_id")
	private int cakeId;
	@Column(name="username")
	private String userName;
	@Column(name="password")
	private String password;

}
