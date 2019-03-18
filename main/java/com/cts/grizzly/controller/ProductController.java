package com.cts.grizzly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.grizzly.bean.Product;
import com.cts.grizzly.bean.Profile;
import com.cts.grizzly.service.ProductService;
import com.cts.grizzly.service.ProfileService;
@Controller

public class ProductController {

	

		
		
		@Autowired
		//@Qualifier("productService")
		ProductService productService;
		@Autowired
		ProfileService profileService;
		@RequestMapping(value="Product.html")                //GetMapping(value="Product.html", method= RequestMethod.GET) could also be done
		public String getProductPage(){
			return "Product";
		}
		
		@RequestMapping(value="add.html", method= RequestMethod.POST)						//PostMapping(value="Product.html", method= RequestMethod.GET)
		public ModelAndView validateUser(@ModelAttribute Product product){
			ModelAndView modelAndView = new ModelAndView();
			System.out.println(" inside product controller");
			System.out.println(product);
				productService.addProduct(product);
				modelAndView.setViewName("Admin-ListProducts");
				
				
		return modelAndView;
		


		
		
		
		
		
		}
	}
