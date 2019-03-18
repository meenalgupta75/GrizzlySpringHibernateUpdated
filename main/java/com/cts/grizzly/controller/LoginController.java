package com.cts.grizzly.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.grizzly.bean.Login;
import com.cts.grizzly.bean.Profile;
import com.cts.grizzly.service.CategoryService;
import com.cts.grizzly.service.LoginService;
import com.cts.grizzly.service.ProductService;
import com.cts.grizzly.service.ProfileService;



@Controller
public class LoginController {

	
	
	@Autowired
	//@Qualifier("loginService")
	LoginService loginService;
	@Autowired
	ProfileService profileService;
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ProductService productService;
	
	
	@RequestMapping(value="login.html")                //GetMapping(value="login.html", method= RequestMethod.GET) could also be done
	public String getLoginPage(){
		return "login";
	}
	
	@RequestMapping(value="addProduct.html", method= RequestMethod.POST)						//PostMapping(value="login.html", method= RequestMethod.GET)
	public ModelAndView category(){
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(categoryService.getAllCategories());
		
		
	
	@RequestMapping(value="login.html", method= RequestMethod.POST)						//PostMapping(value="login.html", method= RequestMethod.GET)
	public ModelAndView validateUser(@ModelAttribute Login login){
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(login);
		if(loginService.authenticate(login)!=null){
			Profile profile = profileService.getUserType(login.getUserName());
			
			if(profile.getUserType().equals("A")){
				modelAndView.addObject("profile",profile);
				modelAndView.addObject("category",categoryService.getAllCategories()); 
				modelAndView.setViewName("admin");
				return modelAndView;
			}
			if(profile.getUserType().equals("V")){
				modelAndView.setViewName("Vendor-AddProduct");
				return modelAndView;
			}
			
	
	else{
		modelAndView.setViewName("admin");
		return modelAndView;
	}


	
	
	
	
	
	}else{
		modelAndView.setViewName("admin");
		return modelAndView;
	}}}
	
	
	
	
	
	
	
	/*
	@RequestMapping(value="login.html", method= RequestMethod.POST)
	public ModelAndView validateUser(@ModelAttribute Login login){
		ModelAndView modelAndView = new ModelAndView();
		if("admin".equals(login.getUserName())&&"admin".equals(login.getPassword())){
			modelAndView.setViewName("admin");
			return modelAndView;
		}
		else{
			modelAndView.setViewName("login");
			return modelAndView;
		}
	}*/
	

