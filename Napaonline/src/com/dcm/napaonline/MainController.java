package com.dcm.napaonline;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dcm.napaonline.model.Product;
import com.dcm.napaonline.model.User;
import com.dcm.napaonline.service.UserService;

@Controller
public class MainController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/")
	public ModelAndView firstPage(){
		
		ModelAndView model=new ModelAndView();
		model.addObject("title", "this is first page");
		model.setViewName("home");
		return model;
	}
	@RequestMapping(value="/first")
	public ModelAndView firstPage1(){
		
		ModelAndView model=new ModelAndView();
		model.addObject("title", "this is first page");
		model.setViewName("home");
		return model;
	}
	
	@RequestMapping(value="/trackOrder")
	public ModelAndView trackOrder(){
		
		ModelAndView model=new ModelAndView();
		model.addObject("title", "this is first page");
		model.setViewName("trackOrder");
		return model;
	}
	
	@RequestMapping("/register")
	public ModelAndView register(){
		ModelAndView model=new ModelAndView();
		model.addObject("user", new User());
		model.setViewName("register");
		return model;
		
	}
	@RequestMapping(value="/registerProcess",method=RequestMethod.POST)
	public ModelAndView registerProcess(@ModelAttribute("user") User user){
		userService.register(user);
		return new ModelAndView("welcome","firstname",user.getFirstname());
	}
	

}
