package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {
	
	
	@RequestMapping("/")
	public ModelAndView showHomePage()
	{
		
		//Specifying which page you have navigateion
		ModelAndView mv = new ModelAndView("/index");
		
		//Specify what data you have to carry to home page
		
		mv.addObject("msg", "WELCOME TO SHOPPING CART");
		
		return mv;
	}
	@RequestMapping("/Login")
	public ModelAndView showLoginPage()
	{
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("msg", " Hey Hello Brother , WELCOME TO LOGIN PAGE");
		mv.addObject("isUserClickedLogin","true");
		return mv;
	}

	@RequestMapping("/Registration")
	public ModelAndView showRegistrationPage()
	{
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("msg", " Now you enter the register page , WELCOME TO Registration page ");
		mv.addObject("isUserClickedRegistration","true");
		return mv;
	}
	
	@RequestMapping("/Contact")
	public ModelAndView showContactPage()
	{
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("msg", " Hey Hello Brother , WELCOME TO LOGIN PAGE");
		mv.addObject("isUserClickedContact","true");
		return mv;
	}
	@RequestMapping("/Menu")
	public ModelAndView showMenuPage()
	{
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("msg", " Hey Hello Brother , WELCOME TO LOGIN PAGE");
		mv.addObject("isUserClickedMenu","true");
		return mv;
	}
	
/*	@RequestMapping("/index")
	public ModelAndView showindexPage()
	{
		
		//Specifying which page you have navigateion
		ModelAndView mv = new ModelAndView("/index");
		
		//Specify what data you have to carry to home page
		
		mv.addObject("msg", "WELCOME TO SHOPPING CART");
		mv.addObject("isUserClickedindex","true");
		
		return mv;
	}*/
}
