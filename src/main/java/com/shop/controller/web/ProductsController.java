package com.shop.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shop.controller.BaseController;

@Controller
public class ProductsController extends BaseController{
	@RequestMapping(value = {"chi-tiet-san-pham/{id}"})
	public ModelAndView products(@PathVariable int id) {
		modelAndView.setViewName("web/products/product");
		modelAndView.addObject("product", productsService.findProductsById(id));
		
		int idCategory = productsService.findProductsById(id).getIdcategory();
		modelAndView.addObject("productByIdCategory", productsService.findProductsByIdCategory(idCategory));
		return modelAndView;
	}
}
