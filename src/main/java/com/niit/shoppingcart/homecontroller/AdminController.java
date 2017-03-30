package com.niit.shoppingcart.homecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.domain.Category;
import com.niit.shoppingcart.domain.Product;
import com.niit.shoppingcart.domain.Supplier;


@Controller
public class AdminController {


	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	Category  category;
	
	@Autowired
	Supplier supplier;
	
	@Autowired
	SupplierDAO supplierDAO;
	
	@Autowired
	Product product;
	
	@Autowired
	ProductDAO productDAO;
	

	@RequestMapping("/manage_categories")
	public ModelAndView manageCategories()
	{
		System.out.println("manageCategories");
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("isUserCategoryPage","true");
		//get the categories from db.
		
	  List<Category> categoryList=	categoryDAO.list();
	  mv.addObject("categoryList", categoryList);
	  mv.addObject("category", category);//To access category domain object in category.jsp
		
		return mv;
		
	}
	
	@RequestMapping("/ManageSupplier")
	public ModelAndView manageSupplier()
	{
		System.out.println("Manage Suppplier");
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("ClickedSupplier",true);
		
		List<Supplier> supplierList  = supplierDAO.list();
		mv.addObject("supplierList" , supplierList);
		mv.addObject("supplier" , supplier);
		return mv;
	}
	
	@RequestMapping("/ManageProduct")
	public ModelAndView manageProduct()
	{
		 System.out.println("manage product");
		 ModelAndView mv = new ModelAndView("/index");
		 mv.addObject("isUserProduct","true");
		 
		 
		 return mv;
	}
	
}
