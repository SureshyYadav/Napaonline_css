package com.springcurd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springcurd.pojo.User;
import com.springcurd.service.UserService;

@Controller
public class RegisterController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index(){		
		return "index";
	}
	
	/*@RequestMapping(value="/home")
	public String getResponse(){
		return "home";
	}*/
	
	@RequestMapping(value="/register")
	public ModelAndView registerUserDetails(){
		ModelAndView mv=new ModelAndView("register");
		mv.addObject("user", new User());
		return mv;
	}
	@RequestMapping(value="/registerProcess")
	public ModelAndView saveUserDetails(@ModelAttribute("user")User user){
		userService.add(user);
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("firstname", user.getFirstname());
		return mv;
		
	}
	

}
