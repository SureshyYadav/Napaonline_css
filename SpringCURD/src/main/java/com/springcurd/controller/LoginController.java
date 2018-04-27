package com.springcurd.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springcurd.pojo.Login;
import com.springcurd.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	/*@RequestMapping(value="/")
	public String getResponse1(){
		return "index";
	}*/
	
	@RequestMapping(value="/login")
	public ModelAndView showLogin(){
		ModelAndView mv=new ModelAndView("login");
		mv.addObject("login", new Login());
		return mv;
	}
	
	@RequestMapping(value="/loginProcess")
	public String loginUser(@Valid Login login, BindingResult result,Map model){
		if(result.hasErrors()){
			return "login";
		}
		boolean userExists=loginService.validateUser(login);
		if(userExists){
			model.put("login", login);
			return "index";
		}else{
			result.rejectValue("username","invaliduser");
			return "login";
		}
	}
	
	
	
	/*public ModelAndView loginUser(@ModelAttribute("login") Login login){
		ModelAndView mv=null;
		User user=loginService.validateUser(login);
		
		if(null!=user){
			mv=new ModelAndView("home");
			mv.addObject("firstname", user.getFirstname());			
		}else{
			mv=new ModelAndView("home");
			mv.addObject("firstname", login.getUsername());
		}
		return mv;
		
		
		
	}*/
	

}
