package com.niit.shoppingcart.homecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.domain.Category;
@Controller
public class CategoryController {
	
	
	//Category.jsp  - addCategory, deleteCategory,
	//showCategoryList,updateCategory,editCategor
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private Category category;
	

	//CURD Operations
	@RequestMapping(value = "/manage_category_create" , method=RequestMethod.POST)
	public ModelAndView category(@ModelAttribute("id")String id,@ModelAttribute("name")String name,
			@ModelAttribute("description")String description)
	{
		
	      category.setid(id);
	      category.setName(name);
	      category.setDescription(description);
	      
	      ModelAndView mv = new ModelAndView("/index");
	      if(categoryDAO.save(category))
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
	@PostMapping(value = "/manage_category_create")
	public ModelAndView createCategory(@RequestParam("id")String id, 
			@RequestParam("name")String name, @RequestParam("description")String description)
	{
		
		category.setId(id);
		category.setName(name);
		category.setDescription(description);
		
		ModelAndView mv = new ModelAndView("redirect:/manage_category_create");
		
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
/*	
	@RequestMapping(value = "/manage_category_add", method = RequestMethod.POST)
	public String addCategory(@ModelAttribute("category") Category category, Model model) {
		log.debug(" Starting of the method addCategory");
		log.info("id:" + category.getId());
		if (categoryDAO.save(category) == true) {
			
			model.addAttribute("msg", "Successfully created/updated the caetgory");
		} else {
			model.addAttribute("msg", "not able created/updated the caetgory");
		}
		model.addAttribute("category", category);
		model.addAttribute("categoryList", categoryDAO.list());
		model.addAttribute("isAdminClickedCategories", "true");
		log.debug(" Ending of the method addCategory");
		return "/home";
	}
	
*/	
	
	
	
/*	
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
	
*/	
	
	
	@RequestMapping("manage_category_remove/{id}")
//	public ModelAndView deleteCategory(@PathVariable("id") String id, Model model) throws Exception {
	public String deleteCategory(@PathVariable("id") String id, Model model) throws Exception {
		boolean flag = categoryDAO.delete(id);

		String msg = "Successfully done the operation";
		if (flag != true) {
			msg = "The operation could not success";
		}
		/*
		 * model.addAttribute("category", category);
		 * model.addAttribute("categoryList", this.categoryDAO.list());
		 */
		model.addAttribute("msg", msg);
	//	ModelAndView mv = new ModelAndView("forward:/manage_categories");
		//return mv;

		return "forward:/manage_categories";
	}

	@RequestMapping("manage_category_edit/{id}")
	public String editCategory(@PathVariable("id") String id, Model model) {
		// categoryDAO.saveOrUpdate(category);
	

		category = categoryDAO.get(id);
		//model.addAttribute("category", category);
		return "forward:/manage_categories";
	}	
	
	
	
	
	
	
	
	
	
	
}
