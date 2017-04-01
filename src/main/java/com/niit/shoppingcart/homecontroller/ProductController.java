package com.niit.shoppingcart.homecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.domain.Product;

@Controller
public class ProductController {
	
	
	@Autowired
	private Product product;
	
	@Autowired
	private ProductDAO productDAO;
	
	
	@PostMapping("/product_create")
	public ModelAndView createProduct(@RequestParam("id")String id, 
			@RequestParam("name")String name, 
			@RequestParam("description")String description,
			@RequestParam("price")double price,@RequestParam("image")MultipartFile image)
			
	{ 
		product.setId(id);
		product.setName(name);
		product.setDescription(description);
		product.setPrice(price);
		product.setImage(image);
		
		
		ModelAndView mv = new ModelAndView("Redirect:/ManageProduct");
		
		if (productDAO.save(product))
		{
			mv.addObject("message", "Successfully created new product");
		}
		else
		{
			mv.addObject("message", "Not able to create product.  Pl contact Administrator");
		}
		
		return mv;
		
		
	
	}
}
