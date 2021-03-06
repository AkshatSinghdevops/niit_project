package com.niit.shoppingcart.homecontroller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
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
import com.niit.shoppingcart.domain.User;


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
	
	@Autowired
	User user;
	
	
	

	@Autowired
	private HttpSession session;
	

	@RequestMapping("/manage_categories")
	public ModelAndView manageCategories()
	{
		
		ModelAndView mv;
		user=(User)session.getAttribute("loggedInUser");
		if(user==null)
		{
			mv = new ModelAndView("/index");
		}
		else
		{
			 if(!user.getRole().equals("Role_Admin"))
			 {
				 mv=new ModelAndView("/index");
			 }
		}
		
		System.out.println("manageCategories");
		 mv = new ModelAndView("/index");
		mv.addObject("isUserCategoryPage","true");
		//get the categories from db.
		
	  List<Category> categoryList=	categoryDAO.list();
	  mv.addObject("categoryList", categoryList);
	  mv.addObject("category", category);//To access category domain object in category.jsp
		
		return mv;
		
	}
	
	@RequestMapping("/manage_supplier")
	public ModelAndView manageSupplier()
	{
		System.out.println("Manage Suppplier");
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("isUserClickedSupplier",true);
		
		List<Supplier> supplierList  = supplierDAO.list();
		mv.addObject("supplierList" , supplierList);
		mv.addObject("supplier" , supplier);
		return mv;
	}
	
	@RequestMapping("/manage_product")
	public ModelAndView manageProduct()
	{
		 System.out.println("manage product");
		 ModelAndView mv = new ModelAndView("/index");
		 mv.addObject("isUserClickedProduct","true");
		 mv.addObject("category",category);
		 
		 List<Product> productList =  productDAO.list();
		 mv.addObject("productList",productList);
		 mv.addObject("product",product);
		 
		 return mv;
	}
	
}
