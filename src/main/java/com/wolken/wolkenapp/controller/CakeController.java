package com.wolken.wolkenapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dto.CakeDTO;
import com.wolken.wolkenapp.exception.MyException;
import com.wolken.wolkenapp.service.CakeService;

@Controller
@RequestMapping("/")
public class CakeController {
	
	Logger logger = Logger.getLogger("CakeController");
	
	@Autowired
	CakeService cakeService;
	
	@RequestMapping("/cake.do")
	public String save(@ModelAttribute CakeDTO cakeDTO,HttpServletRequest req) throws MyException {
		logger.info("inside controller save");
		String msg= cakeService.validateAndSave(cakeDTO);
		req.setAttribute("msg", msg);
		return "login.jsp";
	}
}
