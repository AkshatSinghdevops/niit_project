package com.niit.shoppingcart.homecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.domain.Supplier;

@Controller
public class SupplierController {
	
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	@Autowired
	 Supplier supplier;
	

	//CURD Operations
	@RequestMapping(value = "/manage_supplier_create" , method=RequestMethod.POST)
	public ModelAndView supplier(@ModelAttribute("id")String id,@ModelAttribute("name")String name,
			@ModelAttribute("address")String address)
	{
		
	      supplier.setid(id);
	      supplier.setname(name);
	      supplier.setaddress(address);
	      
	      ModelAndView mv = new ModelAndView("/index");
	      if(supplierDAO.save(supplier))
	      {
	    	  mv.addObject("successR", "Success To Registration");
	      }
	      else
	      {
	    	  mv.addObject("errorR" ,"you are not Register go to Page Contact or About us ");
	      }
	      return mv;
	
	}
	
	@RequestMapping("manage_supplier_remove/{id}")
//	public ModelAndView deleteCategory(@PathVariable("id") String id, Model model) throws Exception {
	public String deleteSupplier(@PathVariable("id") String id, Model model) throws Exception {
		boolean flag = supplierDAO.delete(id);

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

		return "forward:/ManageSupplier";
	}

	@RequestMapping("manage_supplier_edit/{id}")
	public String editSupplier(@PathVariable("id") String id, Model model) {
		// categoryDAO.saveOrUpdate(category);
	

		supplier = supplierDAO.get(id);
		//model.addAttribute("category", category);
		return "forward:/ManageSupplier";
	}
	

}
