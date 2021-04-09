package com.wolken.wolkenapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.wolken.wolkenapp.dto.ProductDTO;
import com.wolken.wolkenapp.entity.ProductEntity;
import com.wolken.wolkenapp.service.ProductService;

@Controller
@RequestMapping("/")
public class ProductController {
	
Logger logger = Logger.getLogger("ProductController");
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/product.do")
	public String add(@ModelAttribute ProductDTO productDTO,HttpServletRequest req) {
       logger.info("inside controller  product save");
		String msg= productService.ValidateAndAdd(productDTO);
		req.setAttribute("msg", msg);
		return "final.jsp";	
	}
	
	@RequestMapping("/search.do")
    public String get(HttpServletRequest req) {
		String cakename = req.getParameter("p_cakeName");
		ProductEntity productEntity = productService.ValidateAndGet(cakename);
	    req.setAttribute("product", productEntity);
		//return (List<ProductEntity>) productEntity;
		return "searchlist.jsp";
	}
	
}

