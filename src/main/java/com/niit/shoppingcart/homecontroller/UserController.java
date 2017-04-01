package com.niit.shoppingcart.homecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.domain.User;

@Controller
public class UserController {
	@Autowired
	private UserDAO userDAO;
	

	@Autowired
	private User user;

	
	
	
	
	
	
	@RequestMapping(value = "/Registration" , method=RequestMethod.POST)
	public ModelAndView registerPage(@ModelAttribute User user,    @ModelAttribute("id")String id,@ModelAttribute("name")String name,
			@ModelAttribute("password")String password,@ModelAttribute("mail")String mail,@ModelAttribute("contact")String contact)
	{
		
	      user.setId(id);
	      user.setMail(mail);
	      user.setName(name);
	      user.setPassword(password);
	      user.setContact(contact);
	      user.setRole("Role_User");
	      
	      ModelAndView mv = new ModelAndView("/index");
	      if(userDAO.save(user))
	      {
	    	  mv.addObject("successR", "Success To Registration");
	      }
	      else
	      {
	    	  mv.addObject("errorR" ,"you are not Register go to Page Contact or About us ");
	      }
	      return mv;
	
	}
	
	
/*	
	@RequestMapping(value = "/Registration", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute User user) {
		
		ModelAndView mv = new ModelAndView("/index");
		if   (userDAO.save(user)){
			
			user.setRole("ROLE_USER"); // all the users are end users by default
			
			
			mv.addObject("successMessage", "You are successfully registered");
		} else {
			
			mv.addObject("errorMessage", "User exist with this id");
		}
		
		return mv;
	}
  
	
	
	@RequestMapping(value = "/Registration", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute User user) {
		
		ModelAndView mv = new ModelAndView("home");
		if (userDAO.get(user.getId()) == null) {
			user.setRole("ROLE_USER"); // all the users are end users by default
			userDAO.save(user);
		
			mv.addObject("successMessage", "You are successfully registered");
		} else {
		
			mv.addObject("errorMessage", "User exist with this id");
		}
		
		return mv;
	}
*/
}
