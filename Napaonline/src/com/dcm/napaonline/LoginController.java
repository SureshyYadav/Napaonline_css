package com.dcm.napaonline;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dcm.napaonline.model.Login;
import com.dcm.napaonline.model.User;
import com.dcm.napaonline.service.UserService;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView model = new ModelAndView("login");
		model.addObject("login", new Login());
		return model;
	}

	/*
	 * @RequestMapping(value="/loginProcess", method=RequestMethod.POST) public
	 * ModelAndView loginPageProcess(@ModelAttribute("login") Login login){
	 * ModelAndView model=null; User user=userService.validateUser(login);
	 * 
	 * if(null!=user){ model=new ModelAndView("welcome");
	 * model.addObject("firstname",user.getFirstname()); }else{ model=new
	 * ModelAndView("login"); model.addObject("message",
	 * "Username or password is wrong !!"); }
	 * 
	 * 
	 * return model; }
	 */
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView validateUser(@Valid Login login, BindingResult result, HttpSession session) {
		String msg = "";
		if (result.hasErrors()) {
			result.addError(new ObjectError("invalid", "Invalid Credentials!!!"));
			return new ModelAndView("error");
		}
		boolean isValid = userService.validateUser(login.getUsername(), login.getPassword());

		if (isValid) {
			msg = "Welcome " + login.getUsername() + "!";

		} else {

			try {
				throw new LoginPasswordException("Username or password is incorrect");
			} catch (LoginPasswordException e) {

				msg = e.getMessage();

			}
		}

		return new ModelAndView("welcome", "firstname", msg);

	}

}
