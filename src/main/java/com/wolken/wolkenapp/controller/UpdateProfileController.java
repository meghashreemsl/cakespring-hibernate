
package com.wolken.wolkenapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dto.UpdateDTO;
import com.wolken.wolkenapp.entity.CakeEntity;
import com.wolken.wolkenapp.service.UpdateProfileService;

@Controller
@RequestMapping("/")
public class UpdateProfileController {
	
	@Autowired
	UpdateProfileService updateProfileService;
	
	@RequestMapping("/get.do")
     public String get(HttpServletRequest req) {
		String email = req.getParameter("emailId");
		CakeEntity cakeEntity = updateProfileService.ValidateAndGet(email);
		req.setAttribute("cakeregistration", cakeEntity);
		return "update.jsp";
	}

	
	@RequestMapping("/update1.do")
	public String update(@ModelAttribute UpdateDTO dto,HttpServletRequest req) {
		String msg =updateProfileService.ValidateAndUpdate(dto);
		req.setAttribute("msg", msg);
		return "final.jsp";
	}
	
}

