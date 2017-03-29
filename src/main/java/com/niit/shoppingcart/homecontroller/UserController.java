package com.niit.shoppingcart.homecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.domain.User;

@Controller
public class UserController {

	
	@Autowired
	User user;
	
	@Autowired
	UserDAO userDAO;
	
	
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
	
}
