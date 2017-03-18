package com.niit.shoppingcart.homecontroller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.domain.User;

@Controller
public class homeController {
	

	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private User user;
	
	
	@Autowired
	private HttpSession session;

	
	
	@RequestMapping(value={("/"),("/index")} )
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
	

	
	@RequestMapping("/validate")
	public ModelAndView validateCredentials(@RequestParam("userID") String id,@RequestParam("password") String pwd)
	{

		
		//Actually you have get the data from DB
		//Tempororily  -user->niit password =niit@123
		
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("isUserLoggedIn", "false");
		if( userDAO.validate(id, pwd)==true)
		
		{
			//Createntials are correct
			mv.addObject("isUserLoggedIn", "true");
			
			user = userDAO.getUser(id);
			
			if(user.getRole().equals("Role_Admin"))
			{
				mv.addObject("isAdmin", "true");
			}
			else
			{
				mv.addObject("isAdmin", "false");
			}
			
			mv.addObject("successMessage", "Valid Credentials");
			session.setAttribute("loginMessage", "Welcome :" +id);
		}
		else
		{
			mv.addObject("errorMessage", "InValid Credentials...please try again");
		}
		
		return mv;
		
		
	}
	@RequestMapping("/logout")
	public ModelAndView showlogout()
	{
		ModelAndView mv = new ModelAndView("/index");
		session.removeAttribute("loginMessage");
		return mv;
				
	}
}
