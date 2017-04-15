package com.niit.shoppingcart.homecontroller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.domain.Category;
import com.niit.shoppingcart.domain.Product;
import com.niit.shoppingcart.domain.Supplier;


@Controller
@RequestMapping("/uploadFile.do")
public class ProductController {
	
	/*
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
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private Product product;
	
	@Autowired(required=true)
	private SupplierDAO supplierDAO;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	//private String path="D:\\shoopingCart\\Images";
	

     
	 //for add and update product both
/*	@RequestMapping(value="manage_product_add",method=RequestMethod.POST)
	public String addProduct(@ModelAttribute("product")Product product,@RequestParam("image") MultipartFile file,Model model)
	{
		System.out.println(product.getId());
		if(productDAO.saveOrUpdate(product)==true){
			model.addAttribute("msg","Successfully created/update the product");
			return "/product";
		}else{
			model.addAttribute("msg","not able to created/update the product");
		return "/product";
		}
	}*/
	//log.debug("Starting of the method addProduct");
	/*Category category=categoryDAO.getByName(product.getCategory().getName());
	categoryDAO.saveOrUpdate(category);//why to save??
	
	Supplier supplier=supplierDAO.getByName(product.getSupplier().getName());
	categoryDAO.saveOrUpdate(category);//why to save??
	
	product.setCategory(category);
	product.setSupplier(supplier);
	product.setCategory_id(category.getId());
	product.setSupplier_id(supplier.getId());
	//product.setId(com.niit.shoppingcart.util.FileUtil.removeCommon(product.getId()));
	productDAO.saveOrUpdate(product);
//	FileUtil.upload(path,file,product.getId()+".jpg");
	//log.debug("Ending of the method addProduct");
	model.addAttribute("isAdminClickedProducts","true");
	model.addAttribute("productList",this.productDAO.list());
	model.addAttribute("product",new Product());
	return "/homepage";*/
	
/*	@RequestMapping("/search_product/{search_string}")
	public List<Product> getAllProductBySearchString(PathVariable("search_string") String search_string)
    {
    		return List<Product> product=productDAO.getSimilarProducts(search_string);
    		ModelAndView mv=new ModelAndView("/home");
    		if(products.isEnpty())
    		{
    			mv.addObject("msg","No products are available with the search text:+search_string);
    		}else{
    			mv.addObject("productList",products);
    		}
    		return mv;
      }
     @RequestMapping(value="/product_create",method=RequestMethod.POST)
 	public ModelAndView addProduct(@ModelAttribute("product") Product product,  @RequestParam MultipartFile[] image  ,Model model)
 	{
 		System.out.println(product.getId());
 	   
 	    if (image != null && image.length > 0) {
 	        for (MultipartFile aFile : image){
 	              
 	            System.out.println("Saving file: " + aFile.getOriginalFilename());
 	             
 	          
 	          //  product.setImage(aFile.getOriginalFilename());
 	            //product.setContent(aFile.getBytes());
 	                      
 	        }
 	    }
 		if(productDAO.save(product)==true){
 			model.addAttribute("msg","Successfully created/update the product");
 			ModelAndView obj=new ModelAndView("product");
			java.util.List<Product> list=productDAO.list();
			obj.addObject("list", list);
			return obj;
 		}else{
 			model.addAttribute("msg","not able to created/update the product");
 			ModelAndView obj=new ModelAndView("product");
			java.util.List<Product> list=productDAO.list();
			obj.addObject("list", list);
			return obj;
 		}
 	}
	
	*/
	
	private String saveDirectory = "d:/CopyofShoppingCartLoginRistration/src/main/webapp/resources/Image/";
    
    @RequestMapping(method = RequestMethod.POST)
    public String handleimage(HttpServletRequest request,
            @RequestParam CommonsMultipartFile[] image) throws Exception {
         
        System.out.println("description: " + request.getParameter("description"));
         
        if (image != null && image.length > 0) {
            for (CommonsMultipartFile aFile : image){
                 
                System.out.println("Saving file: " + aFile.getOriginalFilename());
                 
                if (!aFile.getOriginalFilename().equals("")) {
                    aFile.transferTo(new File(saveDirectory + aFile.getOriginalFilename()));
                }
            }
        }
 
        // returns to the view "Result"
        return "/index";
    }
}
	
	
	
	

