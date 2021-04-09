package com.wolken.wolkenapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dto.LoginDTO;
import com.wolken.wolkenapp.entity.CakeEntity;
import com.wolken.wolkenapp.entity.LoginEntity;
import com.wolken.wolkenapp.service.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {
	
	Logger logger = Logger.getLogger("LoginController");
	@Autowired
	LoginService loginService;
	
	@RequestMapping("/login.do")
	public String Login(@ModelAttribute LoginDTO loginDTO, HttpServletRequest req) {
		logger.info("inside login controller");
		String msg= loginService.ValidateAndLogin(loginDTO);
		req.setAttribute("msg", msg);
		return "final.jsp";
		
	}
	

}
