package com.niit.shoppingcart.homecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.domain.Category;

public class CategoryController {
	
	//Category.jsp  - addCategory, deleteCategory,
	//showCategoryList,updateCategory,editCategor
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private Category category;
	

	//CURD Operations
	@PostMapping("/manage_category_create")
	public ModelAndView createCategory(@RequestParam("id")String id, 
			@RequestParam("name")String name, @RequestParam("description")String description)
	{
		
		category.setID(id);
		category.setNAME(name);
		category.setDescription(description);
		
		ModelAndView mv = new ModelAndView("Redirect:/manage_categories");
		
		if (categoryDAO.save(category))
		{
			mv.addObject("message", "Successfully created the category");
		}
		else
		{
			mv.addObject("message", "Not able to create Category.  Pl contact Administrator");
		}
		
		return mv;
		
	}
	
	
	
	
	
	
	@GetMapping("/manage_category_delete/{id}")
	public ModelAndView deleteCategory(@PathVariable("id") String id)
	{
		ModelAndView mv = new ModelAndView("/Admin/AdminHome");
		
		if(categoryDAO.delete(id))
		{
			mv.addObject("message", "Successfully delete the category");
		}
		else
		{
			mv.addObject("message", "Note able delete the category pl contact administrator");
		}
		return mv;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
